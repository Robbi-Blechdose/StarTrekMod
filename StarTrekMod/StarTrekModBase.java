package StarTrekMod;

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
	
	@SidedProxy(clientSide = "StarTrekMod.StarTrekClientProxy", serverSide = "StarTrekMod.StarTrekCommonProxy")
	public static StarTrekCommonProxy proxy;
	
	public static Item YellowTShirt;
	public static Item BlueTShirt;
	public static ArmorMaterial tshirt = EnumHelper.addArmorMaterial("tshirt", 99999, new int[]{0, 0, 0, 0}, 0);
	public static CreativeTabs startrektab = new StarTrekTab("StarTrekTab");
	
	//PreInit
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		YellowTShirt = new TShirts(tshirt, proxy.addArmor("TShirtYellow"), 1).setCreativeTab(startrektab).setTextureName("startrekmod:yellowtshirt").setUnlocalizedName("yellowtshirt");
		BlueTShirt = new TShirts(tshirt, proxy.addArmor("TShirtBlue"), 1).setCreativeTab(startrektab).setTextureName("startrekmod:bluetshirt").setUnlocalizedName("bluetshirt");
		GameRegistry.registerItem(YellowTShirt, "YellowTShirt");
		GameRegistry.registerItem(BlueTShirt, "BlueTShirt");
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
