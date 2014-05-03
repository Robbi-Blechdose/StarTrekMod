package StarTrekMod;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = "startrekmod", name = "Star Trek Mod", version = "0.0.1")

public class StarTrekModBase{
	
	@Instance("startrekmod")
	public static StarTrekModBase instance;
	
	
	@SidedProxy(clientSide = "StarTrekMod.StarTrekClientProxy", serverSide = "StarTrekMod.StarTrekCommonProxy")
	public static StarTrekCommonProxy proxy;
	
	//PreInit
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		
	}
	
	//Init
	@EventHandler
	public void Init(FMLInitializationEvent event)
	{
			
	}
	
	//PostInit
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
				
	}

}
