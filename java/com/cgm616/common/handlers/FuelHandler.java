package com.cgm616.common.handlers;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.IFuelHandler;

public class FuelHandler implements IFuelHandler{

	@Override
	public int getBurnTime(ItemStack fuel) {
		if(fuel.getItem() == Items.string) {
			return 30;
		}
		if(fuel.getItem() == Item.getItemFromBlock(Blocks.wool)) {
			return 140;
		}
		return 0;
	}
	
}
