package com.as.testmod.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.as.testmod.TestMod;
import com.as.testmod.help.Reference;

public class BlockTestOre extends Block {

	public BlockTestOre() {
		super(Material.rock);
		setBlockName("testOre");
		setBlockTextureName(Reference.MODID + ":"
				+ getUnlocalizedName().substring(5));
		setCreativeTab(CreativeTabs.tabBlock);
		setStepSound(Block.soundTypeStone);
		setHardness(3.0f);
		setResistance(0.5f);
		setHarvestLevel("pickaxe", 2);
		
	}

	@Override
	public Item getItemDropped(int a, Random r, int b) {
		return TestMod.testItem;
	}

}
