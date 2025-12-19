package net.onehappyfern.semi_canon_additions;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.registry.FabricBrewingRecipeRegistryBuilder;
import net.minecraft.block.Blocks;
import net.minecraft.block.FlowerPotBlock;
import net.minecraft.item.Items;
import net.minecraft.potion.Potions;
import net.onehappyfern.semi_canon_additions.block.ModBlocks;
import net.onehappyfern.semi_canon_additions.item.ModItemGroups;
import net.onehappyfern.semi_canon_additions.item.ModItems;
import net.onehappyfern.semi_canon_additions.potion.ModPotions;
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

		ModPotions.registerPotions();

		FabricBrewingRecipeRegistryBuilder.BUILD.register(builder -> {
			builder.registerPotionRecipe(Potions.AWKWARD, Items.WITHER_ROSE, ModPotions.WITHER_POTION);
		});

	}
}