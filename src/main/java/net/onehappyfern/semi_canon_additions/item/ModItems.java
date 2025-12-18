package net.onehappyfern.semi_canon_additions.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.onehappyfern.semi_canon_additions.SemiCanonAdditions;

//Items Below

public class ModItems {
    public static final Item RUBY = registerItem("ruby", new Item(new Item.Settings()));

//Items Above

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(SemiCanonAdditions.MOD_ID, name), item);
    }

    public static void registerModItems() {
        SemiCanonAdditions.LOGGER.info("Registering Mod Items for " + SemiCanonAdditions.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(RUBY);
        });
    }
}
