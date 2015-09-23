package StarTrekMod.Block;

import StarTrekMod.StarTrekModBase;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BaseBlock extends Block
{
	public BaseBlock(Material mat)
	{
		super(mat);
		setCreativeTab(StarTrekModBase.startrektab);
	}
}
