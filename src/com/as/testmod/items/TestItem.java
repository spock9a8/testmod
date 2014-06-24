package com.as.testmod.items;

import net.minecraft.item.Item;

import com.as.testmod.TestMod;
import com.as.testmod.help.RegisterHelper;

public class TestItem extends Item {

	public TestItem() {
		super();
		setUnlocalizedName("testItem");
		RegisterHelper.setTextureName(this);
		setCreativeTab(TestMod.tabTest);

	}

}
