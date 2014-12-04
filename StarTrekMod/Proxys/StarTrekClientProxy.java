package StarTrekMod.Proxys;

import StarTrekMod.Entity.EntityTribble;
import StarTrekMod.Model.ModelTribble;
import StarTrekMod.Render.RenderTribble;
import StarTrekMod.TileEntity.EntityDeflector3x3;
import StarTrekMod.TileEntity.RenderDeflector3x3;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class StarTrekClientProxy extends StarTrekCommonProxy{
	
	public void registerRenderThings()
	{
		//Render Blocks
		ClientRegistry.bindTileEntitySpecialRenderer(EntityDeflector3x3.class, new RenderDeflector3x3());
		
		//Render Entities
		RenderingRegistry.registerEntityRenderingHandler(EntityTribble.class, new RenderTribble(new ModelTribble(), 0.4F));
	}

	public int addArmor(String par1)
	{
		return RenderingRegistry.addNewArmourRendererPrefix(par1);
	}
}
