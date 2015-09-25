package StarTrekMod.Dimensions.Space;

import StarTrekMod.Reference;
import StarTrekMod.StarTrekModBase;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.WorldChunkManagerHell;
import net.minecraft.world.chunk.IChunkProvider;

public class SpaceWorldProvider extends WorldProvider
{
	@Override
	public void registerWorldChunkManager()
	{
		//TODO: Should we create our own WorldChunkManager???
		this.worldChunkMgr = new WorldChunkManagerHell(StarTrekModBase.biomeSpace, 0.0f);
		this.dimensionId = StarTrekModBase.SPACE_DIM_ID;
	}
	
	@Override
	public IChunkProvider createChunkGenerator()
	{
		return null; //TODO: Should we create our own ChunkProvider?
	}
	
	@Override
	public String getDimensionName()
	{
		return Reference.MODID + ": Space";
	}
}
