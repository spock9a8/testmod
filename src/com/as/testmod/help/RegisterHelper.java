package com.as.testmod.help;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.GameRegistry;

public class RegisterHelper {

	public static void registerBlock(Block b) {
		GameRegistry.registerBlock(b, Reference.MODID + "_"
				+ b.getUnlocalizedName().substring(5));

	}

	public static void registerItem(Item i) {
		GameRegistry.registerItem(i, Reference.MODID + "_"
				+ i.getUnlocalizedName().substring(5));
	}
	
	public static void setTextureName(Item i) {
		i.setTextureName(Reference.MODID + ":" + i.getUnlocalizedName().substring(5));
	}
	
	public static void setTextureName(Block b) {
		b.setBlockTextureName(Reference.MODID + ":" + b.getUnlocalizedName().substring(5));
	}
}
