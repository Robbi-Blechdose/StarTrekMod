package StarTrekMod.Dimensions.Space;

import StarTrekMod.StarTrekModBase;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.layer.GenLayer;

public class SpaceGenLayerBiomes extends GenLayer
{
	protected BiomeGenBase[] allowedBiomes = { StarTrekModBase.spaceBiome };
	
	public SpaceGenLayerBiomes(long seed, GenLayer genLayer)
	{
		super(seed);
		this.parent = genLayer;
	}
	
	public SpaceGenLayerBiomes(long seed)
	{
		super(seed);
	}

	@Override
	public int[] getInts(int var1, int var2, int var3, int var4)
	{
		// TODO
		return null;
	}

}
