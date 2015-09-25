package StarTrekMod.Dimensions.Space;

import StarTrekMod.Reference;
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomeGenSpace extends BiomeGenBase
{
	public BiomeGenSpace(int id)
	{
		super(id);
		
		this.setBiomeName(Reference.MODID + ": Space");
		
		this.spawnableCaveCreatureList.clear();
		this.spawnableCreatureList.clear();
		this.spawnableMonsterList.clear();
		this.spawnableWaterCreatureList.clear();
		
		this.setDisableRain();
		
		this.setTemperatureRainfall(0.0f, 0.0f);
		
		//Space is empty
		this.topBlock = Blocks.air;
		this.fillerBlock = Blocks.air;
	}
}
