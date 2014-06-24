package com.as.testmod;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

import com.as.testmod.blocks.BlockTestOre;
import com.as.testmod.help.Reference;
import com.as.testmod.help.RegisterHelper;
import com.as.testmod.items.TestItem;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MODID, version = Reference.VERSION)
public class TestMod {

	public static CreativeTabs tabTest = new CreativeTabs("tabTest") {
		public Item getTabIconItem() {
			return Item.getItemFromBlock(Blocks.diamond_block);
		}
	};

	public static Item testItem;

	public static Block testOre;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		tabTest.setNoTitle();
		testItem = new TestItem();
		RegisterHelper.registerItem(testItem);

		testOre = new BlockTestOre();
		RegisterHelper.registerBlock(testOre);
	}

}
