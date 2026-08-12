package com.eldoria.rpg;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class ModCreativeTabs {

    public static final ResourceKey<CreativeModeTab> ELDORIA_RPG_TAB =
            ResourceKey.create(Registries.CREATIVE_MODE_TAB,
                    EldoriaRPG.id("eldoria_rpg"));

    public static void initialize() {
        EldoriaRPG.LOGGER.info("Registering Eldoria RPG Creative Tab");

        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
                ELDORIA_RPG_TAB, FabricItemGroup.builder()
                        .title(Component.translatable("itemGroup.eldoria-rpg.eldoria_rpg"))
                        .icon(() -> new ItemStack(ModItems.ELDORIAN_CRYSTAL))
                        .displayItems((parameters, output) -> {
                            output.accept(ModItems.ELDORIAN_CRYSTAL);
                        }).build()
        );
    }
}
