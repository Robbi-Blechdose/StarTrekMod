package StarTrekMod.Dimensions.Space;

import java.util.ArrayList;
import java.util.List;

import StarTrekMod.StarTrekModBase;
import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.BiomeCache;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.WorldChunkManager;
import net.minecraft.world.gen.layer.GenLayer;

public class SpaceWorldChunkManager extends WorldChunkManager
{
	private GenLayer genBiomes;
	private GenLayer biomeIndexLayer;
	private BiomeCache biomeCache;
	private List<BiomeGenBase> biomesToSpawnIn;
	
	protected SpaceWorldChunkManager()
	{
		this.biomeCache = new BiomeCache(this);
		this.biomesToSpawnIn = new ArrayList<BiomeGenBase>();
		this.biomesToSpawnIn.add(StarTrekModBase.spaceBiome);
	}
	
	public SpaceWorldChunkManager(long seed, WorldType worldType) //I don't think we'll need the seed, space should always generate the same (planets ect.)
	{
		this();
		GenLayer[] genLayer = SpaceGenLayer.makeTheWorld(seed); //TODO: Generate nothing but planets as structures
		this.genBiomes = genLayer[0];
		this.biomeIndexLayer = genLayer[1];
	}
	
	public SpaceWorldChunkManager(World world)
	{
		this(world.getSeed(), world.provider.terrainType);
	}
	
	@Override
	public List<BiomeGenBase> getBiomesToSpawnIn()
	{
		return this.biomesToSpawnIn;
	}
	
	//TODO: Disable rain
	
	//TODO: Should we override other methods (like in the Robbi Blechdose Mod) ?
	
}
