package net.onehappyfern.semi_canon_additions;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.RenderLayer;
import net.onehappyfern.semi_canon_additions.block.ModBlocks;

public class SemiCanonAdditionsClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        RenderLayer cutout = RenderLayer.getCutout();

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BUTTERCUP, cutout);
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PINK_DAISY, cutout);
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_BUTTERCUP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_PINK_DAISY, RenderLayer.getCutout());
    }
}
