package StarTrekMod.Dimensions;

import StarTrekMod.StarTrekModBase;
import StarTrekMod.Dimensions.Space.SpaceWorldProvider;
import net.minecraftforge.common.DimensionManager;

public class StarTrekDimensions
{
	public static void registerDimensions()
	{
		DimensionManager.registerProviderType(StarTrekModBase.SPACE_DIM_ID, SpaceWorldProvider.class, false);
		DimensionManager.registerDimension(StarTrekModBase.SPACE_DIM_ID, StarTrekModBase.SPACE_DIM_ID);
	}
}
