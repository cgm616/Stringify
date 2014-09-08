package com.cgm616.common.handlers;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.IFuelHandler;

public class FuelHandler implements IFuelHandler{

	@Override
	public int getBurnTime(ItemStack fuel) {
		if(fuel.getItem() == Items.string) {
			return 30;
		}
		return 0;
	}
	
}
