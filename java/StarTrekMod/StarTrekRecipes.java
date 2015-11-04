package StarTrekMod;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class StarTrekRecipes {

	public static void initCraftingRecipes()
	{
		GameRegistry.addRecipe(new ItemStack(StarTrekModBase.commanduniform, 1), "YXL",
																				 "YYY",
																				 "YYY",
					'Y', new ItemStack(Blocks.wool, 1, 4), 'L', StarTrekModBase.logo);
		
		GameRegistry.addRecipe(new ItemStack(StarTrekModBase.logo, 1), "XGX",
																	   "GGG",
																	   "GXX",
													'G', Items.gold_nugget);
		
		GameRegistry.addRecipe(new ItemStack(StarTrekModBase.scienceuniform, 1), "BXL",
																				 "BBB",
																				 "BBB",
					'B', new ItemStack(Blocks.wool, 1, 3), 'L', StarTrekModBase.logo);
		
		GameRegistry.addRecipe(new ItemStack(StarTrekModBase.dilithium_circuit, 1), "GIG",
																					"GDG",
																					"GIG",
		'D', StarTrekModBase.dilithium_crystal, 'G', Blocks.glass, 'I', Items.iron_ingot);
		
		GameRegistry.addRecipe(new ItemStack(StarTrekModBase.engineeringuniform, 1), "RXL",
				 																	 "RRR",
				 																	 "RRR",
				 		'R', new ItemStack(Blocks.wool, 1, 14), 'L', StarTrekModBase.logo);
		
		GameRegistry.addRecipe(new ItemStack(StarTrekModBase.black_leggins, 1), "BBB",
																				"BXB",
																				"BXB",
												'B', new ItemStack(Blocks.wool, 1, 8));
		
		GameRegistry.addRecipe(new ItemStack(StarTrekModBase.black_boots, 1), "BXB",
																		 	  "BXB",
											'B', new ItemStack(Blocks.wool, 1, 8));
		
		GameRegistry.addRecipe(new ItemStack(StarTrekModBase.ship_block, 8), "III",
																			 "ISI",
																			 "III",
									'I', Items.iron_ingot, 'S', Blocks.stone);
		
		GameRegistry.addRecipe(new ItemStack(StarTrekModBase.ship_block_marked, 1), "DB",
				 'D', new ItemStack(Items.dye, 1, 14), 'B', StarTrekModBase.ship_block);
		
		GameRegistry.addRecipe(new ItemStack(StarTrekModBase.ship_block_marked_front, 1), "DB",
				 'D', new ItemStack(Items.dye, 1, 4), 'B', StarTrekModBase.ship_block);
		
		GameRegistry.addRecipe(new ItemStack(StarTrekModBase.ship_block_marked_back, 1), "B",
				 									'B', StarTrekModBase.ship_block_marked);

		GameRegistry.addRecipe(new ItemStack(StarTrekModBase.ship_block_marked, 1), "B",
				 						'B', StarTrekModBase.ship_block_marked_back);
		
		GameRegistry.addRecipe(new ItemStack(StarTrekModBase.helm, 1), "PPP",
																	   "XBX",
					'B', Blocks.iron_block, 'P', StarTrekModBase.helm_panel);
		
		GameRegistry.addRecipe(new ItemStack(StarTrekModBase.helm_panel, 1), "ILI",
																	   "GRG",
																	   "III",
		'I', Items.iron_ingot, 'R', Blocks.redstone_block, 'L', Blocks.redstone_lamp, 'G', Items.gold_ingot);
		
		//TODO: Phaser recipe
	}
}
