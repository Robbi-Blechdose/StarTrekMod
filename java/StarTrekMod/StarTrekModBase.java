package StarTrekMod;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityList;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.util.EnumHelper;
import StarTrekMod.CreativeTabs.StarTrekTab;
import StarTrekMod.CreativeTabs.StarTrekTabPlanets;
import StarTrekMod.CreativeTabs.StarTrekTabShips;
import StarTrekMod.Dimensions.StarTrekBiomes;
import StarTrekMod.Entity.EntityTribble;
import StarTrekMod.Gui.GuiHandler;
import StarTrekMod.Network.NetInit;
import StarTrekMod.Proxys.StarTrekCommonProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;

@Mod(modid = Reference.MODID, name = Reference.MODNAME, version = Reference.MODVERSION)
public class StarTrekModBase
{
	
	@Instance("startrekmod")
	public static StarTrekModBase instance;
	
	@SidedProxy(clientSide = "StarTrekMod.Proxys.StarTrekClientProxy", serverSide = "StarTrekMod.Proxys.StarTrekCommonProxy")
	public static StarTrekCommonProxy proxy;
	
	//Items
	public static Item commanduniform;
	public static Item scienceuniform;
	public static Item protectivehelmet;
	public static Item protectivechest;
	public static Item protectiveleggins;
	public static Item protectiveboots;
	public static Item logo;
	public static Item black_boots;
	public static Item dilithium_crystal;
	public static Item dilithium_circuit;
	public static Item engineeringuniform;
	public static Item black_leggins;
	public static Item helm_panel;
	
	//Blocks
	public static Block dilithium_ore;
	public static Block Deflector3x3;
	public static Block ship_block;
	public static Block ship_block_marked;
	public static Block ship_block_window;
	//TODO: Use custom model to make them rotate right
	public static Block ship_block_marked_front;
	public static Block ship_block_marked_back;
	public static Block helm;
	
	//Armor Materials
	public static ArmorMaterial uniform = EnumHelper.addArmorMaterial("uniform", 99999, new int[]{0, 0, 0, 0}, 0);
	public static ArmorMaterial protectivesuits = EnumHelper.addArmorMaterial("protectivesuits", 500, new int[]{1, 1, 1, 1}, 0);
	
	//Creative Tabs
	//TODO: Is this also possible with one class???
	public static CreativeTabs startrektab = new StarTrekTab("StarTrekTab");
	public static CreativeTabs startrektab_ships = new StarTrekTabShips("StarTrekTabShips");
	public static CreativeTabs startrektab_planets = new StarTrekTabPlanets("StarTrekTabPlanets");
	
	/** Dimensions START **/
	public static int SPACE_DIM_ID = 100;
	
	public static BiomeGenBase biomeSpace;
	
	/** Dimensions END **/
	
	//PreInit
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{	
		StarTrekModInit.init(startrektab, proxy);
		
		int entityID;
        entityID = EntityRegistry.findGlobalUniqueEntityId();
    	EntityRegistry.registerModEntity(EntityTribble.class, "Tribble", 600, this, 80, 3, true);
    	EntityList.addMapping(EntityTribble.class, "Tribble", 1200, 0x318A25, 0x26F50F);
    	
		StarTrekRegistry.registerItems();
		StarTrekRegistry.registerBlocks();
		StarTrekRecipes.initCraftingRecipes();
		
		createDimensions();
		
		proxy.registerRenderThings();
		
		NetInit.init();
	}
	
	//Init
	@EventHandler
	public void Init(FMLInitializationEvent event)
	{
		NetworkRegistry.INSTANCE.registerGuiHandler(StarTrekModBase.instance, new GuiHandler());
	}
	
	//PostInit
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
				
	}
	
	private void createDimensions()
	{
		StarTrekBiomes.initBiomes();
		StarTrekBiomes.registerBiomes();
		
		//StarTrekDimensions.registerDimensions();
	}

}
