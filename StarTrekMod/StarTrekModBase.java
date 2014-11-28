package StarTrekMod;

import StarTrekMod.Block.BaseBlock;
import StarTrekMod.Entity.EntityTribble;
import StarTrekMod.Item.BaseItem;
import StarTrekMod.Item.ProtectiveSuits;
import StarTrekMod.Item.TShirts;
import StarTrekMod.Proxys.StarTrekCommonProxy;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityList;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = "startrekmod", name = "Star Trek Mod", version = "0.0.1")

public class StarTrekModBase{
	
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
	public static Block dilithium_ore;
	public static Item dilithium_circuit;
	public static Item engineeringuniform;
	public static Item black_leggins;
	
	//Armor Materials
	public static ArmorMaterial uniform = EnumHelper.addArmorMaterial("uniform", 99999, new int[]{0, 0, 0, 0}, 0);
	public static ArmorMaterial protectivesuits = EnumHelper.addArmorMaterial("protectivesuits", 500, new int[]{1, 1, 1, 1}, 0);
	
	//Creative Tab
	public static CreativeTabs startrektab = new StarTrekTab("StarTrekTab");
	
	//PreInit
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		StarTrekModInit.init(startrektab, proxy);
		
		int entityID;
        entityID = EntityRegistry.findGlobalUniqueEntityId();
    	EntityRegistry.registerModEntity(EntityTribble.class, "Tribble", 600, this, 80, 3, true);
    	EntityList.addMapping(EntityTribble.class, "Tribble", 1200, 0x318A25, 0x26F50F);
    	
    	
		StarTrekRecipes.initCraftingRecipes();
		StarTrekRegistry.registerItems();
		StarTrekRegistry.registerBlocks();
		
		
		proxy.registerRenderThings();
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
