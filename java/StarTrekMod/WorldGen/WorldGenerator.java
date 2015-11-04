package StarTrekMod.WorldGen;

import java.util.Random;

import StarTrekMod.StarTrekModBase;
import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;

public class WorldGenerator implements IWorldGenerator
{

	@Override
	public void generate(Random rand, int chunkX, int chunkZ, World world, IChunkProvider arg4, IChunkProvider arg5)
	{
		switch(world.provider.dimensionId)
		{
			case 0:
				genWorld(world, rand, chunkX * 16, chunkZ * 16);
				break;
			
			case StarTrekModBase.SPACE_DIM_ID:
				genSpace(world, rand, chunkX * 16, chunkZ * 16);
				break;
				
		}
	}
	
	private void genWorld(World world, Random rand, int chunkX, int chunkZ)
	{
		for(int i = 0; i < 2; i++) //TODO: Adjust
		{
			int randPosX1 = chunkX + rand.nextInt(16);
			int randPosY1 = rand.nextInt(128);
			int randPosZ1 = chunkZ + rand.nextInt(16);
			new WorldGenCrashedShip().generate(world, rand, randPosX1, randPosY1, randPosZ1);
		}
	}
	
	private void genSpace(World world, Random rand, int chunkX, int chunkZ)
	{
	}
}
