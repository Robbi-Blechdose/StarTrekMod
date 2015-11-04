package StarTrekMod.Util;

import net.minecraft.block.Block;
import net.minecraft.nbt.NBTTagCompound;

public class CBlock {
	public Block block;
	public int metadata;
	public NBTTagCompound nbt;
	public boolean hasTileEntity;

	public CBlock(Block block, int meta, NBTTagCompound cpnd, boolean hasTileEntity){
		this.block=block;
		this.metadata=meta;
		this.nbt=cpnd;
		this.hasTileEntity=hasTileEntity;
	}
}
