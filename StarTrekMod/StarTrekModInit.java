package StarTrekMod;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import StarTrekMod.Block.BaseBlock;
import StarTrekMod.Block.OreBlock;
import StarTrekMod.Item.BaseItem;
import StarTrekMod.Item.ProtectiveSuits;
import StarTrekMod.Item.TShirts;
import StarTrekMod.Proxys.StarTrekCommonProxy;

public class StarTrekModInit
{
	private static CreativeTabs startrektab;
	private static StarTrekCommonProxy proxy;
	
	public static void init(CreativeTabs tab, StarTrekCommonProxy prox)
	{
		startrektab = tab;
		proxy = prox;
		
		StarTrekModBase.commanduniform = new TShirts(StarTrekModBase.uniform, proxy.addArmor("commanduniform"), 1).setCreativeTab(startrektab).setTextureName("startrekmod:yellowtshirt").setUnlocalizedName("commanduniform");
		StarTrekModBase.scienceuniform = new TShirts(StarTrekModBase.uniform, proxy.addArmor("scienceuniform"), 1).setCreativeTab(startrektab).setTextureName("startrekmod:bluetshirt").setUnlocalizedName("scienceuniform");
		StarTrekModBase.engineeringuniform = new TShirts(StarTrekModBase.uniform, proxy.addArmor("engineeringuniform"), 1).setCreativeTab(startrektab).setTextureName("startrekmod:redtshirt").setUnlocalizedName("engineeringuniform");
		
		StarTrekModBase.protectivehelmet = new ProtectiveSuits(StarTrekModBase.protectivesuits, proxy.addArmor("protective"), 0).setCreativeTab(startrektab).setTextureName("startrekmod:protectivehelmet").setUnlocalizedName("protectivehelmet");
		StarTrekModBase.protectivechest = new ProtectiveSuits(StarTrekModBase.protectivesuits, proxy.addArmor("protective"), 1).setCreativeTab(startrektab).setTextureName("startrekmod:protectivechest").setUnlocalizedName("protectivechest");
		StarTrekModBase.protectiveleggins = new ProtectiveSuits(StarTrekModBase.protectivesuits, proxy.addArmor("protective"), 2).setCreativeTab(startrektab).setTextureName("startrekmod:protectiveleggins").setUnlocalizedName("protectiveleggins");
		StarTrekModBase.protectiveboots = new ProtectiveSuits(StarTrekModBase.protectivesuits, proxy.addArmor("protective"), 3).setCreativeTab(startrektab).setTextureName("startrekmod:protectiveboots").setUnlocalizedName("protectiveboots");
		
		StarTrekModBase.logo = new BaseItem().setTextureName("startrekmod:logo").setUnlocalizedName("logo");
		
		StarTrekModBase.black_boots = new TShirts(StarTrekModBase.uniform, proxy.addArmor("black_boots"), 3).setCreativeTab(startrektab).setTextureName("startrekmod:black_boots").setUnlocalizedName("black_boots");
		StarTrekModBase.black_leggins = new TShirts(StarTrekModBase.uniform, proxy.addArmor("black_leggins"), 2).setCreativeTab(startrektab).setTextureName("startrekmod:black_leggins").setUnlocalizedName("black_leggins");
		
		StarTrekModBase.dilithium_crystal = new BaseItem().setTextureName("startrekmod:dilithium_crystal").setUnlocalizedName("dilithium_crystal").setCreativeTab(startrektab);
		StarTrekModBase.dilithium_ore = new OreBlock(Material.rock).setHardness(2.0F).setBlockTextureName("startrekmod:dilithium_ore").setBlockName("dilithium_ore");
		StarTrekModBase.dilithium_circuit = new BaseItem().setTextureName("startrekmod:dilithium_circuit").setUnlocalizedName("dilithium_circuit").setCreativeTab(startrektab);
		
	}
}
