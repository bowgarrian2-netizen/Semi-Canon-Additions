package net.onehappyfern.semi_canon_additions.potion;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.potion.Potion;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.onehappyfern.semi_canon_additions.SemiCanonAdditions;

public class ModPotions {
    public static final RegistryEntry<Potion> WITHER_POTION = registerPotion("wither_potion",
            new Potion(new StatusEffectInstance(StatusEffects.WITHER, 800, 0)));


    private static RegistryEntry<Potion> registerPotion(String name, Potion potion) {
        return Registry.registerReference(Registries.POTION, Identifier.of(SemiCanonAdditions.MOD_ID, name), potion);
    }

    public static void registerPotions() {
        SemiCanonAdditions.LOGGER.info("Registering Mod Potions for " + SemiCanonAdditions.MOD_ID);
    }
}
