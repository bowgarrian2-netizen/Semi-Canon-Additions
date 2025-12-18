package net.onehappyfern.semi_canon_additions.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.onehappyfern.semi_canon_additions.SemiCanonAdditions;
import net.onehappyfern.semi_canon_additions.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup SEMI_CANON_ADDITIONS_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(SemiCanonAdditions.MOD_ID, "semi_canon_additions_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.RUBY))
                    .displayName(Text.translatable("itemgroup.semi_canon_additions.semi_canon_additions_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.RUBY);
                        entries.add(ModBlocks.RUBY_BLOCK);

                    }).build());



    public static void registerItemGroups() {
        SemiCanonAdditions.LOGGER.info("Registering Item Groups for " + SemiCanonAdditions.MOD_ID);
    }
}
