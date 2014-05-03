package StarTrekMod;

<<<<<<< HEAD
=======
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.Achievement;
import net.minecraftforge.common.AchievementPage;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.FMLCommonHandler;
>>>>>>> a73d77751baf1a61a3dd81ffd8039836cfc44987
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
<<<<<<< HEAD

@Mod(modid = "startrekmod", name = "Star Trek Mod", version = "0.0.1")

public class StarTrekModBase {
=======
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = "startrekmod", name = "Star Trek Mod", version = "0.0.1")



public class StarTrekModBase{
>>>>>>> a73d77751baf1a61a3dd81ffd8039836cfc44987
	
	@Instance("startrekmod")
	public static StarTrekModBase instance;
	
<<<<<<< HEAD
	
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
=======
    //PreInit
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {    	
    	Configuration config = new Configuration(event.getSuggestedConfigurationFile());
	    config.load();
	    
	    config.save();
	    
    }     

    
    //Init
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	
    }
 
    
    //PostInit
    @EventHandler
    public static void postInit(FMLPostInitializationEvent fmlpostinitializationevent)
    {
    	
    }
    
}
>>>>>>> a73d77751baf1a61a3dd81ffd8039836cfc44987
