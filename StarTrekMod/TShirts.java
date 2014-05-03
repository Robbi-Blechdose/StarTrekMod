package StarTrekMod;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class TShirts extends ItemArmor{

	public TShirts(ArmorMaterial mat, int var1, int var2) {
		super(mat, var1, var2);
	}

	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		if(stack.getItem() == StarTrekModBase.YellowTShirt){
			return "startrekmod:textures/armor/yellowtshirt_layer_1.png";
		}
		else if(stack.getItem() == StarTrekModBase.BlueTShirt){
			return "startrekmod:textures/armor/bluetshirt_layer_1.png";
		}
		else
		return null;
	}
}
