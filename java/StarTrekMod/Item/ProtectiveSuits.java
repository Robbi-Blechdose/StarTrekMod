package StarTrekMod.Item;

import StarTrekMod.Reference;
import StarTrekMod.StarTrekModBase;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ProtectiveSuits extends ItemArmor{

	public ProtectiveSuits(ArmorMaterial mat, int var1, int var2) {
		super(mat, var1, var2);
	}

	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		if(stack.getItem() == StarTrekModBase.protectivehelmet || stack.getItem() == StarTrekModBase.protectivechest || stack.getItem() == StarTrekModBase.protectiveboots){
			return Reference.MODID + ":textures/armor/protectivesuit_layer_1.png";
		}
		else if(stack.getItem() == StarTrekModBase.protectiveleggins)
		{
			return Reference.MODID + ":textures/armor/protectivesuit_layer_2.png";
		}
		else
		return Reference.MODID + ":textures/armor/protectivesuit_layer_2.png";
	}
}
