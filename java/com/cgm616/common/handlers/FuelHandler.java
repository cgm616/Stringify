package com.cgm616.common.handlers;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.IFuelHandler;

public class FuelHandler implements IFuelHandler{

	@Override
	public int getBurnTime(ItemStack fuel) { // Sets up the override function getBurnTime()
		if(fuel.getItem() == Items.string) { // Checks if the fuel is string
			return 30; // If yes, return 30 as the burn time
		}
		if(fuel.getItem() == Item.getItemFromBlock(Blocks.wool)) { // Checks if wool is the fuel
			return 140; // If yes, return 140 as the burn time
		}
		return 0; // If the fuel does not match fuels added, return 0 as burn time
	}
	
}
