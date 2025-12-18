package net.onehappyfern.semi_canon_additions;

import net.fabricmc.api.ModInitializer;

import net.onehappyfern.semi_canon_additions.block.ModBlocks;
import net.onehappyfern.semi_canon_additions.item.ModItemGroups;
import net.onehappyfern.semi_canon_additions.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SemiCanonAdditions implements ModInitializer {
	public static final String MOD_ID = "semi_canon_additions";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}