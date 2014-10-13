package StarTrekMod.Item;

import StarTrekMod.StarTrekModBase;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class TShirts extends ItemArmor{

	public TShirts(ArmorMaterial mat, int var1, int var2) {
		super(mat, var1, var2);
	}

	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		if(stack.getItem() == StarTrekModBase.commanduniform)
		{
			return "startrekmod:textures/armor/yellowtshirt_layer_1.png";
		}
		else if(stack.getItem() == StarTrekModBase.scienceuniform)
		{
			return "startrekmod:textures/armor/bluetshirt_layer_1.png";
		}
		else if(stack.getItem() == StarTrekModBase.black_boots)
		{
			return "startrekmod:textures/armor/black_boots_layer_1.png";
		}
		else if(stack.getItem() == StarTrekModBase.engineeringuniform)
		{
			return "startrekmod:textures/armor/redtshirt_layer_1.png";
		}
		else if(stack.getItem() == StarTrekModBase.black_leggins)
		{
			return "startrekmod:textures/armor/black_leggins_layer_2.png";
		}
		else
		return null;
	}
}
