package StarTrekMod.Dimensions.Space;

import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.GenLayerVoronoiZoom;
import net.minecraft.world.gen.layer.GenLayerZoom;

public class SpaceGenLayer extends GenLayer
{

	public SpaceGenLayer(long seed)
	{
		super(seed);
	}
	
	public static GenLayer[] makeTheWorld(long seed)
	{
		GenLayer biomes = new SpaceGenLayerBiomes(1L);
		biomes = new GenLayerZoom(100L, biomes);
		
		GenLayer genLayerVoronoiZoom = new GenLayerVoronoiZoom(10L, biomes);
		
		biomes.initWorldGenSeed(seed);
		genLayerVoronoiZoom.initWorldGenSeed(seed);
		
		return new GenLayer[] {biomes, genLayerVoronoiZoom};
	}

	@Override
	public int[] getInts(int var1, int var2, int var3, int var4)
	{
		//TODO
		return null;
	}

}
