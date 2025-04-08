/*
 * Copyright (c) 2021, Jordan Atwood <nightfirecat@protonmail.com>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.runelite.client.plugins.skillcalculator.skills;

import lombok.AllArgsConstructor;
import lombok.Getter;
import net.runelite.api.gameval.ItemID;
import net.runelite.client.game.ItemManager;

@AllArgsConstructor
@Getter
public enum CookingAction implements ItemSkillAction
{
	SINEW(ItemID.XBOWS_SINEW, 1, 3),
	ANCHOVIES(ItemID.ANCHOVIES, 1, 30),
	COOKED_CHICKEN(ItemID.COOKED_CHICKEN, 1, 30),
	COOKED_MEAT(ItemID.COOKED_MEAT, 1, 30),
	COOKED_RABBIT(ItemID.COOKED_RABBIT, 1, 30),
	SHRIMPS(ItemID.SHRIMP, 1, 30),
	BREAD(ItemID.BREAD, 1, 40),
	SARDINE(ItemID.SARDINE, 1, 40),
	UGTHANKI_MEAT(ItemID.COOKED_UGTHANKI_MEAT, 1, 40),
	POISON_KARAMBWAN(ItemID.TBWT_POORLY_COOKED_KARAMBWAN, 1, 80),
	HERRING(ItemID.HERRING, 5, 50),
	FRUIT_BLAST(ItemID.FRUIT_BLAST, 6, 50),
	GUPPY(ItemID.GUPPY, 7, 12),
	BAKED_POTATO(ItemID.POTATO_BAKED, 7, 15),
	PINEAPPLE_PUNCH(ItemID.PINEAPPLE_PUNCH, 8, 70),
	SPICY_SAUCE(ItemID.BOWL_CHILLI, 9, 25),
	MACKEREL(ItemID.MACKEREL, 10, 60),
	REDBERRY_PIE(ItemID.REDBERRY_PIE, 10, 78),
	TOAD_CRUNCHIES(ItemID.TOAD_CRUNCHIES, 10, 100),
	CHILLI_CON_CARNE(ItemID.BOWL_CHILLI_CARNE, 11, 55),
	ROAST_BIRD_MEAT(ItemID.SPIT_ROASTED_BIRD_MEAT, 11, 62.5f),
	THIN_SNAIL_MEAT(ItemID.SNAIL_CORPSE_COOKED1, 12, 70),
	SPICY_CRUNCHIES(ItemID.SPICY_CRUNCHIES, 12, 100),
	SCRAMBLED_EGG(ItemID.BOWL_EGG_SCRAMBLED, 13, 50),
	WORM_CRUNCHIES(ItemID.WORM_CRUNCHIES, 14, 104),
	CIDER(ItemID.CIDER, 14, 182),
	TROUT(ItemID.TROUT, 15, 70),
	ROAST_RABBIT(ItemID.SPIT_ROASTED_RABBIT_MEAT, 16, 72.5f),
	SPIDER_ON_SHAFT(ItemID.TBW_SPIDER_ON_SHAFT_RAW, 16, 80),
	SPIDER_ON_STICK(ItemID.TBW_SPIDER_ON_STICK_RAW, 16, 80),
	CHOCCHIP_CRUNCHIES(ItemID.CHOCCHIP_CRUNCHIES, 16, 100),
	LEAN_SNAIL_MEAT(ItemID.SNAIL_CORPSE_COOKED2, 17, 80),
	COD(ItemID.COD, 18, 75),
	WIZARD_BLIZZARD(ItemID.WIZARD_BLIZZARD, 18, 110),
	DWARVEN_STOUT(ItemID.DWARVEN_STOUT, 19, 215, true),
	CAVEFISH(ItemID.CAVEFISH, 20, 23),
	CUP_OF_TEA(ItemID.DISPLAY_TEA, 20, 52),
	PIKE(ItemID.PIKE, 20, 80),
	MEAT_PIE(ItemID.MEAT_PIE, 20, 110),
	SHORT_GREEN_GUY(ItemID.SGG, 20, 120),
	POT_OF_CREAM(ItemID.POT_OF_CREAM, 21, 18),
	ROAST_BEAST_MEAT(ItemID.SPIT_ROASTED_BEAST_MEAT, 21, 82.5f),
	COOKED_CRAB_MEAT(ItemID.HUNDRED_PIRATE_GIANT_CRAB_MEAT_5, 21, 100),
	FAT_SNAIL_MEAT(ItemID.SNAIL_CORPSE_COOKED3, 22, 95),
	EGG_AND_TOMATO(ItemID.BOWL_EGG_TOMATO, 23, 50),
	COOKED_WILD_KEBBIT(ItemID.WILDKEBBIT_COOKED, 23, 73),
	ASGARNIAN_ALE(ItemID.ASGARNIAN_ALE, 24, 248, true),
	SALMON(ItemID.SALMON, 25, 90),
	STEW(ItemID.STEW, 25, 117),
	FRUIT_BATTA(ItemID.FRUIT_BATTA, 25, 150),
	TOAD_BATTA(ItemID.TOAD_BATTA, 26, 152),
	WORM_BATTA(ItemID.WORM_BATTA, 27, 154),
	COOKED_SLIMY_EEL(ItemID.MORT_SLIMEY_EEL_COOKED, 28, 95),
	SWEETCORN(ItemID.SWEETCORN_COOKED, 28, 104),
	VEGETABLE_BATTA(ItemID.VEGETABLE_BATTA, 28, 156),
	MUD_PIE(ItemID.MUD_PIE, 29, 128),
	CHEESE_AND_TOMATO_BATTA(ItemID.CHEESE_TOM_BATTA, 29, 158),
	GREENMANS_ALE(ItemID.GREENMANS_ALE, 29, 281),
	COOKED_BREAM(ItemID.BREAM_FISH_COOKED, 30, 45),
	COOKED_MOSS_LIZARD(ItemID.COOKED_LIZARD, 30, 60),
	ROASTED_CHOMPY(ItemID.COOKED_CHOMPY, 30, 100),
	TUNA(ItemID.TUNA, 30, 100),
	APPLE_PIE(ItemID.APPLE_PIE, 30, 130),
	WORM_HOLE(ItemID.WORM_HOLE, 30, 170),
	COOKED_KARAMBWAN(ItemID.TBWT_COOKED_KARAMBWAN, 30, 190),
	COOKED_LARUPIA(ItemID.LARUPIA_COOKED, 31, 92),
	FISHCAKE(ItemID.HUNDRED_PIRATE_FISHCAKE, 31, 100),
	COOKED_BARBTAILED_KEBBIT(ItemID.BARBKEBBIT_COOKED, 32, 106),
	DRUNK_DRAGON(ItemID.DRUNK_DRAGON, 32, 160),
	TETRA(ItemID.TETRA, 33, 31),
	CHOC_SATURDAY(ItemID.CHOCOLATE_SATURDAY, 33, 170),
	GARDEN_PIE(ItemID.GARDEN_PIE, 34, 138),
	WIZARDS_MIND_BOMB(ItemID.WIZARDS_MIND_BOMB, 34, 314, true),
	RAINBOW_FISH(ItemID.HUNTING_FISH_SPECIAL, 35, 110),
	PLAIN_PIZZA(ItemID.PLAIN_PIZZA, 35, 143),
	VEG_BALL(ItemID.VEG_BALL, 35, 175),
	JUG_OF_WINE(ItemID.JUG_WINE, 35, 200),
	BLURBERRY_SPECIAL(ItemID.BLURBERRY_SPECIAL, 37, 180),
	PAT_OF_BUTTER(ItemID.POT_OF_BUTTER, 38, 40.5f),
	CAVE_EEL(ItemID.CAVE_EEL, 38, 115),
	POTATO_WITH_BUTTER(ItemID.POTATO_BUTTER, 39, 40),
	DRAGON_BITTER(ItemID.DRAGON_BITTER, 39, 347),
	LOBSTER(ItemID.LOBSTER, 40, 120),
	CAKE(ItemID.CAKE, 40, 180),
	TANGLED_TOADS_LEGS(ItemID.TANGLED_TOADS_LEGS, 40, 185),
	COOKED_GRAAHK(ItemID.GRAAHK_COOKED, 41, 124),
	COOKED_JUBBLY(ItemID._100_JUBBLY_MEAT_COOKED, 41, 160),
	CHILLI_POTATO(ItemID.POTATO_CHILLI_CARNE, 41, 165.5f),
	FRIED_ONIONS(ItemID.BOWL_ONION_FRIED, 42, 60),
	CHOCOLATE_BOMB(ItemID.CHOCOLATE_BOMB, 42, 190),
	BASS(ItemID.BASS, 43, 130),
	MOONLIGHT_MEAD(ItemID.MOONLIGHT_MEAD, 44, 380),
	SWORDFISH(ItemID.SWORDFISH, 45, 140),
	MEAT_PIZZA(ItemID.MEAT_PIZZA, 45, 169),
	CATFISH(ItemID.CATFISH, 46, 43),
	FRIED_MUSHROOMS(ItemID.BOWL_MUSHROOM_FRIED, 46, 60),
	POTATO_WITH_CHEESE(ItemID.POTATO_CHEESE, 47, 40),
	FISH_PIE(ItemID.FISH_PIE, 47, 164),
	CHEESE(ItemID.CHEESE, 48, 64, true),
	AXEMANS_FOLLY(ItemID.AXEMANS_FOLLY, 49, 413),
	COOKED_OOMLIE_WRAP(ItemID.COOKED_OOMLIE, 50, 30),
	CHOCOLATE_CAKE(ItemID.CHOCOLATE_CAKE, 50, 210),
	COOKED_KYATT(ItemID.KYATT_COOKED, 51, 143),
	EGG_POTATO(ItemID.POTATO_EGG_TOMATO, 51, 195.5f),
	BOTANICAL_PIE(ItemID.BOTANICAL_PIE, 52, 180),
	LAVA_EEL(ItemID.LAVA_EEL, 53, 30),
	CHEFS_DELIGHT(ItemID.CHEFS_DELIGHT, 54, 446),
	ANCHOVY_PIZZA(ItemID.ANCHOVIE_PIZZA, 55, 182),
	MUSHROOM_AND_ONION(ItemID.BOWL_MUSHROOM_ONION, 57, 120),
	PITTA_BREAD(ItemID.PITTA_BREAD, 58, 40),
	UGTHANKI_KEBAB_FRESH(ItemID.UGTHANKI_KEBAB_BAD, 58, 80),
	SLAYERS_RESPITE(ItemID.SLAYERS_RESPITE, 59, 479),
	MUSHROOM_PIE(ItemID.MUSHROOM_PIE, 60, 200),
	CURRY(ItemID.CURRY, 60, 280),
	MONKFISH(ItemID.MONKFISH, 62, 150),
	MUSHROOM_POTATO(ItemID.POTATO_MUSHROOM_ONION, 64, 270.5f),
	PINEAPPLE_PIZZA(ItemID.PINEAPPLE_PIZZA, 65, 188),
	WINE_OF_ZAMORAK(ItemID.WINE_OF_ZAMORAK, 65, 200, true),
	TUNA_AND_CORN(ItemID.BOWL_TUNA_SWEETCORN, 67, 204),
	COOKED_SUNLIGHT_ANTELOPE(ItemID.ANTELOPESUN_COOKED, 68, 175),
	TUNA_POTATO(ItemID.POTATO_TUNA_SWEETCORN, 68, 309.5f),
	ADMIRAL_PIE(ItemID.ADMIRAL_PIE, 70, 210),
	SACRED_EEL(ItemID.SNAKEBOSS_EEL, 72, 109),
	DRAGONFRUIT_PIE(ItemID.DRAGONFRUIT_PIE, 73, 220),
	SHARK(ItemID.SHARK, 80, 210),
	SEA_TURTLE(ItemID.SEATURTLE, 82, 211.3f),
	COOKED_DASHING_KEBBIT(ItemID.DASHINGKEBBIT_COOKED, 82, 215),
	ANGLERFISH(ItemID.ANGLERFISH, 84, 230),
	WILD_PIE(ItemID.WILD_PIE, 85, 240),
	DARK_CRAB(ItemID.DARK_CRAB, 90, 215),
	MANTA_RAY(ItemID.MANTARAY, 91, 216.3f),
	COOKED_MOONLIGHT_ANTELOPE(ItemID.ANTELOPEMOON_COOKED, 92, 220),
	SUMMER_PIE(ItemID.SUMMER_PIE, 95, 260),
	;

	private final int itemId;
	private final int level;
	private final float xp;
	private final boolean isMembersOverride;

	CookingAction(int itemId, int level, float xp)
	{
		this(itemId, level, xp, false);
	}

	@Override
	public boolean isMembers(final ItemManager itemManager)
	{
		return isMembersOverride() || ItemSkillAction.super.isMembers(itemManager);
	}
}
