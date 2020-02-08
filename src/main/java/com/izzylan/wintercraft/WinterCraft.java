package com.izzylan.wintercraft;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class WinterCraft implements ModInitializer {

    public static final String NAMESPACE = "wintercraft";

    public static final String ID_PERMAFROST = "permafrost";
    public static final Block BLOCK_PERMAFROST = new Block(FabricBlockSettings.of(Material.EARTH).build());

    public static Identifier BuildModIdentifier(String name) {
        return new Identifier(NAMESPACE, name);
    }

    @Override
    public void onInitialize() {
        Registry.register(Registry.BLOCK, BuildModIdentifier(ID_PERMAFROST), BLOCK_PERMAFROST);
        Registry.register(Registry.ITEM, BuildModIdentifier(ID_PERMAFROST), new BlockItem(BLOCK_PERMAFROST, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
    }
}
