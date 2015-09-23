package StarTrekMod.Dimensions.Space;

import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenerator;

public class SpaceBiome extends BiomeGenBase
{
	private WorldGenerator generatorOverworldPlanet; //TODO: Add more
	
	public SpaceBiome(int par1)
	{
		super(par1);
		this.setBiomeName("Space");
		
		//Clear out mob lists
		this.spawnableCaveCreatureList.clear();
		this.spawnableCreatureList.clear();
		this.spawnableMonsterList.clear();
		this.spawnableWaterCreatureList.clear();
	}

}
