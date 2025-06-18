package net.runelite.cache;

import lombok.extern.slf4j.Slf4j;
import net.runelite.cache.definitions.ObjectDefinition;
import net.runelite.cache.fs.*;
import net.runelite.cache.region.Location;
import net.runelite.cache.region.Position;
import net.runelite.cache.region.Region;
import net.runelite.cache.region.RegionLoader;

import com.google.gson.Gson;
import net.runelite.cache.util.XteaKeyManager;
import org.apache.commons.cli.*;

import java.io.*;
import java.util.*;

@Slf4j
public class ObjectLocationDumper
{
    public static void main(String[] args) throws Exception
    {
        Options options = new Options();
        options.addOption(Option.builder().longOpt("cachedir").hasArg().required().build());
        options.addOption(Option.builder().longOpt("outputdir").hasArg().required().build());

        CommandLineParser parser = new DefaultParser();
        CommandLine cmd;
        try
        {
            cmd = parser.parse(options, args);
        }
        catch (ParseException ex)
        {
            System.err.println("Error parsing command line options: " + ex.getMessage());
            System.exit(-1);
            return;
        }

        final String cacheDirectory = cmd.getOptionValue("cachedir");
        final String outputDirectory = cmd.getOptionValue("outputdir");

        Gson gson = new Gson();
        String cache = String.format("%s/cache", cacheDirectory);
        Store store = new Store(new File(cache));
        store.load();
        log.info("Cache loaded: " + cache);

        String xteas = String.format("%s/xteas.json", cacheDirectory);
        XteaKeyManager xteaKeyManager = new XteaKeyManager();
        try (FileInputStream fin = new FileInputStream(xteas))
        {
            xteaKeyManager.loadKeys(fin);
        }

        RegionLoader regionLoader = new RegionLoader(store, xteaKeyManager);
        regionLoader.loadRegions();
        ObjectManager objectManager = new ObjectManager(store);
        objectManager.load();
        AreaManager areaManager = new AreaManager(store);
        areaManager.load();

        ArrayList<String> sceneryLocations = new ArrayList<>();
        sceneryLocations.add("id,name,x,y,plane");

        ObjectDefinition od;
        Position position;
        for (Region region : regionLoader.getRegions()) {
            for (Location location : region.getLocations()) {
                od = objectManager.getObject(location.getId());
                position = location.getPosition();
                sceneryLocations.add(String.format(
                    "%s,%s,%s,%s,%s",
                    od.getId(),
                    od.getName(),
                    position.getX(),
                    position.getY(),
                    position.getZ()
                ));
            }
        }

        String sceneryCsv = String.join("\n", sceneryLocations);
        String filename = "scenery_locations.csv";
        File outputfile = fileWithDirectoryAssurance(outputDirectory, filename);
        PrintWriter out = new PrintWriter(outputfile);
        out.write(sceneryCsv);
        out.close();
        log.info(outputfile.getAbsolutePath());
    }

    private static File fileWithDirectoryAssurance(String directory, String filename) {
        File dir = new File(directory);
        if (!dir.exists()) dir.mkdirs();
        return new File(directory + "/" + filename);
    }
}