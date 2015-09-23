package StarTrekMod.Dimensions.Space;

import StarTrekMod.StarTrekModBase;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraftforge.common.DimensionManager;

public class SpaceWorldProvider extends WorldProvider
{
	public SpaceWorldProvider()
	{
		
	}
	
	@Override
	public void registerWorldChunkManager()
	{
		this.worldChunkMgr = new SpaceWorldChunkManager(worldObj.getSeed(), terrainType);
		this.hasNoSky = true;
	}

	@Override
	public String getDimensionName()
	{
		return "StarTrekMod:Space"; //Add StarTrekMod to not have dim conflicts with other mods
	}
	
	public static WorldProvider getProviderForDimension(int id)
	{
		return DimensionManager.createProviderFor(StarTrekModBase.SPACE_DIM_ID);
	}
	
	@Override
	public String getWelcomeMessage()
	{
		return "Entering Space"; //Is this still necessary?
	}
	
	@Override
	public IChunkProvider createChunkGenerator()
	{
		return new SpaceChunkProvider(worldObj, worldObj.getSeed(), true);
	}
	
	@Override
	public boolean canRespawnHere()
	{
		return false; //Players shouldn't respawn in Space
	}
}
