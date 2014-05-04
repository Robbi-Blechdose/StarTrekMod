package StarTrekMod.Proxys;

import cpw.mods.fml.client.registry.RenderingRegistry;

public class StarTrekClientProxy extends StarTrekCommonProxy{
	
	public void registerRenderThings(){
		
	}

	public int addArmor(String par1)
	{
		return RenderingRegistry.addNewArmourRendererPrefix(par1);
	}
}
