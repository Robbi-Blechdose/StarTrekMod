package StarTrekMod.Block;

import java.util.Random;

import StarTrekMod.StarTrekModBase;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class OreBlock extends BaseBlock
{

	public OreBlock(Material mat)
	{
		super(mat);
	}
	
	public Item getItemDropped(int int1, Random rand, int int2)
    {
        return this == StarTrekModBase.dilithium_ore ? StarTrekModBase.dilithium_crystal : Item.getItemFromBlock(this);
    }
	

}
