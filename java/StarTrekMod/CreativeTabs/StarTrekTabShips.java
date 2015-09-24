package StarTrekMod.CreativeTabs;

import StarTrekMod.StarTrekModBase;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class StarTrekTabShips extends CreativeTabs
{
	public StarTrekTabShips(String label)
	{
		super(label);
	}

	@Override
	public Item getTabIconItem()
	{
		return Item.getItemFromBlock(StarTrekModBase.ship_block_window);
	}
}
