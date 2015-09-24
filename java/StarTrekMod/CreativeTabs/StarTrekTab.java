package StarTrekMod.CreativeTabs;

import StarTrekMod.StarTrekModBase;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class StarTrekTab extends CreativeTabs
{
	public StarTrekTab(String label)
	{
		super(label);
	}

	@Override
	public Item getTabIconItem()
	{
		return StarTrekModBase.commanduniform;
	}
}
