package StarTrekMod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class StarTrekTab extends CreativeTabs{

	public StarTrekTab(String lable) {
		super(lable);
	}

	@Override
	public Item getTabIconItem(){
		return StarTrekModBase.commanduniform;
	}
}
