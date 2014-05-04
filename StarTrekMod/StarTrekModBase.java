package StarTrekMod;

import StarTrekMod.Item.ProtectiveSuits;
import StarTrekMod.Item.TShirts;
import StarTrekMod.Proxys.StarTrekCommonProxy;
import net.minecraft.creativetab.CreativeTabs;
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
	
	public static Item commanduniform;
	public static Item scienceuniform;
	public static Item protectivehelmet;
	public static Item protectivechest;
	public static Item protectiveleggins;
	public static Item protectiveboots;
	public static ArmorMaterial uniform = EnumHelper.addArmorMaterial("uniform", 99999, new int[]{0, 0, 0, 0}, 0);
	public static ArmorMaterial protectivesuits = EnumHelper.addArmorMaterial("protectivesuits", 500, new int[]{1, 1, 1, 1}, 0);
	public static CreativeTabs startrektab = new StarTrekTab("StarTrekTab");
	
	//PreInit
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		commanduniform = new TShirts(uniform, proxy.addArmor("commanduniform"), 1).setCreativeTab(startrektab).setTextureName("startrekmod:yellowtshirt").setUnlocalizedName("commanduniform");
		scienceuniform = new TShirts(uniform, proxy.addArmor("scienceuniform"), 1).setCreativeTab(startrektab).setTextureName("startrekmod:bluetshirt").setUnlocalizedName("scienceuniform");
		
		protectivehelmet = new ProtectiveSuits(protectivesuits, proxy.addArmor("protective"), 0).setCreativeTab(startrektab).setTextureName("startrekmod:protectivehelmet").setUnlocalizedName("protectivehelmet");
		protectivechest = new ProtectiveSuits(protectivesuits, proxy.addArmor("protective"), 1).setCreativeTab(startrektab).setTextureName("startrekmod:protectivechest").setUnlocalizedName("protectivechest");
		protectiveleggins = new ProtectiveSuits(protectivesuits, proxy.addArmor("protective"), 2).setCreativeTab(startrektab).setTextureName("startrekmod:protectiveleggins").setUnlocalizedName("protectiveleggins");
		protectiveboots = new ProtectiveSuits(protectivesuits, proxy.addArmor("protective"), 3).setCreativeTab(startrektab).setTextureName("startrekmod:protectiveboots").setUnlocalizedName("protectiveboots");
		
		GameRegistry.registerItem(commanduniform, "commanduniform");
		GameRegistry.registerItem(scienceuniform, "scienceuniform");
		GameRegistry.registerItem(protectivehelmet, "protectivehelmet");
		GameRegistry.registerItem(protectivechest, "protectivechest");
		GameRegistry.registerItem(protectiveleggins, "protectiveleggins");
		GameRegistry.registerItem(protectiveboots, "protectiveboots");
		
		
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
