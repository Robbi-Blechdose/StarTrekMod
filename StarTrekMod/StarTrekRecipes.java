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
	}
}
