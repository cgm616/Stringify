package com.cgm616.common.Main;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import com.cgm616.common.handlers.FuelHandler;
import com.cgm616.common.lib.RefStrings;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = RefStrings.MODID, name = RefStrings.NAME, version = RefStrings.VERSION)
public class MainRegistry {
	
	// Loads proxies
	@SidedProxy(clientSide = RefStrings.CLIENTSIDE, serverSide = RefStrings.SERVERSIDE)
	public static ServerProxy proxy;
	
	// Handles all PreLoad, Load, and PostLoad events
	@EventHandler
	public static void PreLoad(FMLPreInitializationEvent PreEvent) {
		proxy.registerRenderInfo();
	}
	
	@EventHandler
	public static void Load(FMLInitializationEvent Event) {
		AddRecipes(); // Calls the function to add recipes
		AddFuels();
	}
	
	@EventHandler
	public static void PostLoad(FMLPostInitializationEvent PostEvent) {
		
	}
	
	private static void AddRecipes() { // Adds recipes through GameRegistry
		GameRegistry.addShapelessRecipe(new ItemStack(Items.string, 4), Blocks.wool);
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.web, 1), "XYX", " X ", "X X", 'X', Items.string, 'Y', Items.slime_ball);
	}
	
	private static void AddFuels() { // Adds fuels
		GameRegistry.registerFuelHandler(new FuelHandler());
	}

}
