package StarTrekMod;

import cpw.mods.fml.common.registry.GameRegistry;

public class StarTrekRegistry
{
	public static void registerItems()
	{
		GameRegistry.registerItem(StarTrekModBase.commanduniform, "commanduniform");
		GameRegistry.registerItem(StarTrekModBase.scienceuniform, "scienceuniform");
		GameRegistry.registerItem(StarTrekModBase.protectivehelmet, "protectivehelmet");
		GameRegistry.registerItem(StarTrekModBase.protectivechest, "protectivechest");
		GameRegistry.registerItem(StarTrekModBase.protectiveleggins, "protectiveleggins");
		GameRegistry.registerItem(StarTrekModBase.protectiveboots, "protectiveboots");
		GameRegistry.registerItem(StarTrekModBase.logo, "logo");
		GameRegistry.registerItem(StarTrekModBase.black_boots, "black_boots");
		GameRegistry.registerItem(StarTrekModBase.black_leggins, "black_leggins");
		GameRegistry.registerItem(StarTrekModBase.dilithium_crystal, "dithium_crystal");
		GameRegistry.registerItem(StarTrekModBase.dilithium_circuit, "dilithium_circuit");
		GameRegistry.registerItem(StarTrekModBase.engineeringuniform, "engineeringuniform");
	}
	
	public static void registerBlocks()
	{
		GameRegistry.registerBlock(StarTrekModBase.dilithium_ore, "dithium_ore");
		GameRegistry.registerBlock(StarTrekModBase.Deflector3x3, "Deflector3x3");
		GameRegistry.registerBlock(StarTrekModBase.ship_block, "ship_block");
		GameRegistry.registerBlock(StarTrekModBase.ship_block_marked, "ship_block_marked");
		GameRegistry.registerBlock(StarTrekModBase.ship_block_marked_front, "ship_block_marked_front");
		GameRegistry.registerBlock(StarTrekModBase.ship_block_marked_back, "ship_block_marked_back");
		GameRegistry.registerBlock(StarTrekModBase.ship_block_window, "ship_block_window");
	}
}
