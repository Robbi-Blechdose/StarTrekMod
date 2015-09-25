package StarTrekMod.Dimensions;

import StarTrekMod.StarTrekModBase;
import StarTrekMod.Dimensions.Space.BiomeGenSpace;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager;

public class StarTrekBiomes
{
	public static void initBiomes()
	{
		StarTrekModBase.biomeSpace = new BiomeGenSpace(150); //Number is biome ID
	}
	
	public static void registerBiomes()
	{
		BiomeDictionary.registerBiomeType(StarTrekModBase.biomeSpace, Type.END); //Is this necessary?
	}
}
