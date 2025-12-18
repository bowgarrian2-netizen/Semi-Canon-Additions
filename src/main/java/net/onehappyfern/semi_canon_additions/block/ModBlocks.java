package net.onehappyfern.semi_canon_additions.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.onehappyfern.semi_canon_additions.SemiCanonAdditions;

import static net.minecraft.block.Blocks.createFlowerPotBlock;

//Blocks Below

public class ModBlocks {
    public static final Block RUBY_BLOCK = registerBlock("ruby_block",
            new Block(AbstractBlock.Settings.create()
                    .requiresTool()
                    .strength(5.0f,6.0f)
                    .sounds(BlockSoundGroup.METAL)
            )
    );
    public static final Block RUBY_ORE = registerBlock("ruby_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(3,7),
                    AbstractBlock.Settings.create()
                            .strength(3.0f,3.0f)
                            .requiresTool()
            )
    );

    public static final Block DEEPSLATE_RUBY_ORE = registerBlock("deepslate_ruby_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(3,7),
                    AbstractBlock.Settings.create()
                            .strength(4.5f,3.0f)
                            .requiresTool()
                            .sounds(BlockSoundGroup.DEEPSLATE)
            )
    );

    public static final Block BUTTERCUP = registerBlock("buttercup",
            new FlowerBlock(
                    StatusEffects.POISON,
                    0.35f,
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DARK_GREEN)
                            .noCollision()
                            .breakInstantly()
                            .sounds(BlockSoundGroup.GRASS)
                            .offset(AbstractBlock.OffsetType.XZ)
                            .pistonBehavior(PistonBehavior.DESTROY)
            )
    );

    public static final Block PINK_DAISY = registerBlock("pink_daisy",
            new FlowerBlock(
                    StatusEffects.POISON,
                    0.35f,
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DARK_GREEN)
                            .noCollision()
                            .breakInstantly()
                            .sounds(BlockSoundGroup.GRASS)
                            .offset(AbstractBlock.OffsetType.XZ)
                            .pistonBehavior(PistonBehavior.DESTROY)
            )
    );

    public static final Block POTTED_BUTTERCUP = registerBlock("potted_buttercup", createFlowerPotBlock(BUTTERCUP));
    public static final Block POTTED_PINK_DAISY = registerBlock("potted_pink_daisy", createFlowerPotBlock(PINK_DAISY));

//Blocks Above

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(SemiCanonAdditions.MOD_ID, name), block);
    }


    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(SemiCanonAdditions.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        SemiCanonAdditions.LOGGER.info("Registering Mod Blocks for " + SemiCanonAdditions.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
        });
    }
}
