package com.eldoria.rpg;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.Item;

public class ModItems {

    public static final Item ELDORIAN_CRYSTAL = Registry.register(
            BuiltInRegistries.ITEM,
            EldoriaRPG.id("eldorian_crystal"),
            new Item(new Item.Properties())
    );

    public static void initialize() {

        EldoriaRPG.LOGGER.info("Registering ModItems");

        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.INGREDIENTS).register(
                entries -> {entries.accept(ELDORIAN_CRYSTAL);});
    }
}
