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
	@Override
	public boolean canSave()
	{
		return false;
	}

	@Override
	public boolean chunkExists(int arg0, int arg1)
	{
		return false;
	}

	@Override
	public ChunkPosition func_147416_a(World arg0, String arg1, int arg2, int arg3, int arg4)
	{
		return null;
	}

	@Override
	public int getLoadedChunkCount()
	{
		return 0;
	}

	@Override
	public List getPossibleCreatures(EnumCreatureType arg0, int arg1, int arg2, int arg3)
	{
		return null;
	}

	@Override
	public Chunk loadChunk(int arg0, int arg1)
	{
		return null;
	}

	@Override
	public String makeString()
	{
		return null;
	}

	@Override
	public void populate(IChunkProvider arg0, int arg1, int arg2)
	{

	}

	@Override
	public Chunk provideChunk(int arg0, int arg1)
	{
		return null;
	}

	@Override
	public void recreateStructures(int arg0, int arg1)
	{

	}

	@Override
	public boolean saveChunks(boolean arg0, IProgressUpdate arg1)
	{
		return false;
	}

	@Override
	public void saveExtraData()
	{

	}

	@Override
	public boolean unloadQueuedChunks()
	{
		return false;
	}

}
