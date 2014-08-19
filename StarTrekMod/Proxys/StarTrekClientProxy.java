package StarTrekMod.Proxys;

import StarTrekMod.Entity.EntityTribble;
import StarTrekMod.Model.ModelTribble;
import StarTrekMod.Render.RenderTribble;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class StarTrekClientProxy extends StarTrekCommonProxy{
	
	public void registerRenderThings()
	{
		RenderingRegistry.registerEntityRenderingHandler(EntityTribble.class, new RenderTribble(new ModelTribble(), 0.4F));
	}

	public int addArmor(String par1)
	{
		return RenderingRegistry.addNewArmourRendererPrefix(par1);
	}
}
