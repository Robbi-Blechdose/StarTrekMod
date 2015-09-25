package StarTrekMod.Item;

import StarTrekMod.StarTrekModBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class BaseItem extends Item
{

	public BaseItem()
	{
		super();
		setCreativeTab(StarTrekModBase.startrektab);
	}
	
	/**
	@Override
	public ItemStack onItemRightClick(ItemStack arg0, World arg1, EntityPlayer arg2)
	{
		arg2.travelToDimension(StarTrekModBase.SPACE_DIM_ID);
		return arg0;
	}
	**/
}
