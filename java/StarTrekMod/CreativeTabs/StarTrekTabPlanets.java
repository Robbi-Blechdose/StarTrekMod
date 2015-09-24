package StarTrekMod.CreativeTabs;

import StarTrekMod.StarTrekModBase;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class StarTrekTabPlanets extends CreativeTabs
{
	public StarTrekTabPlanets(String label)
	{
		super(label);
	}

	@Override
	public Item getTabIconItem()
	{
		return Item.getItemFromBlock(StarTrekModBase.dilithium_ore);
	}
}
