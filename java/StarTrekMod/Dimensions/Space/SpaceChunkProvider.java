package StarTrekMod.Dimensions.Space;

import java.util.List;

import net.minecraft.entity.EnumCreatureType;
import net.minecraft.util.IProgressUpdate;
import net.minecraft.world.ChunkPosition;
import net.minecraft.world.World;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.chunk.IChunkProvider;

//TODO
public class SpaceChunkProvider implements IChunkProvider
{
	public SpaceChunkProvider(World world, long par2, boolean par3)
	{
		
	}

	@Override
	public boolean chunkExists(int var1, int var2)
	{
		return false;
	}

	@Override
	public Chunk provideChunk(int var1, int var2)
	{
		return null;
	}

	@Override
	public Chunk loadChunk(int var1, int var2)
	{
		return null;
	}

	@Override
	public void populate(IChunkProvider var1, int var2, int var3)
	{
		
	}

	@Override
	public boolean saveChunks(boolean var1, IProgressUpdate var2)
	{
		return false;
	}

	@Override
	public boolean unloadQueuedChunks()
	{
		return false;
	}

	@Override
	public boolean canSave()
	{
		return false;
	}

	@Override
	public String makeString()
	{
		return null;
	}

	@Override
	public List getPossibleCreatures(EnumCreatureType var1, int var2, int var3, int var4)
	{
		return null;
	}

	@Override
	public ChunkPosition func_147416_a(World var1, String var2, int var3, int var4, int var5)
	{
		return null;
	}

	@Override
	public int getLoadedChunkCount()
	{
		return 0;
	}

	@Override
	public void recreateStructures(int var1, int var2)
	{
		
	}

	@Override
	public void saveExtraData()
	{
		
	}

}