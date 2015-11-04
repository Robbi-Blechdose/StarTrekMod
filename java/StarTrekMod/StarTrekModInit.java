package StarTrekMod;

import StarTrekMod.Block.BaseBlock;
import StarTrekMod.Block.OreBlock;
import StarTrekMod.Item.BaseItem;
import StarTrekMod.Item.ProtectiveSuits;
import StarTrekMod.Item.TShirts;
import StarTrekMod.Item.Phaser.ItemPhaser;
import StarTrekMod.Proxys.StarTrekCommonProxy;
import StarTrekMod.TileEntity.Deflector.BlockDeflector3x3;
import StarTrekMod.TileEntity.Helm.BlockHelm;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class StarTrekModInit
{
	private static CreativeTabs startrektab;
	private static StarTrekCommonProxy proxy;
	
	public static void init(CreativeTabs tab, StarTrekCommonProxy prox)
	{
		startrektab = tab;
		proxy = prox;
		
		StarTrekModBase.commanduniform = new TShirts(StarTrekModBase.uniform, proxy.addArmor("commanduniform"), 1).setCreativeTab(startrektab).setTextureName(Reference.MODID + ":yellowtshirt").setUnlocalizedName("commanduniform");
		StarTrekModBase.scienceuniform = new TShirts(StarTrekModBase.uniform, proxy.addArmor("scienceuniform"), 1).setCreativeTab(startrektab).setTextureName(Reference.MODID + ":bluetshirt").setUnlocalizedName("scienceuniform");
		StarTrekModBase.engineeringuniform = new TShirts(StarTrekModBase.uniform, proxy.addArmor("engineeringuniform"), 1).setCreativeTab(startrektab).setTextureName(Reference.MODID + ":redtshirt").setUnlocalizedName("engineeringuniform");
		
		StarTrekModBase.protectivehelmet = new ProtectiveSuits(StarTrekModBase.protectivesuits, proxy.addArmor("protective"), 0).setCreativeTab(startrektab).setTextureName(Reference.MODID + ":protectivehelmet").setUnlocalizedName("protectivehelmet");
		StarTrekModBase.protectivechest = new ProtectiveSuits(StarTrekModBase.protectivesuits, proxy.addArmor("protective"), 1).setCreativeTab(startrektab).setTextureName(Reference.MODID + ":protectivechest").setUnlocalizedName("protectivechest");
		StarTrekModBase.protectiveleggins = new ProtectiveSuits(StarTrekModBase.protectivesuits, proxy.addArmor("protective"), 2).setCreativeTab(startrektab).setTextureName(Reference.MODID + ":protectiveleggins").setUnlocalizedName("protectiveleggins");
		StarTrekModBase.protectiveboots = new ProtectiveSuits(StarTrekModBase.protectivesuits, proxy.addArmor("protective"), 3).setCreativeTab(startrektab).setTextureName(Reference.MODID + ":protectiveboots").setUnlocalizedName("protectiveboots");
		
		StarTrekModBase.logo = new BaseItem().setTextureName("startrekmod:logo").setUnlocalizedName("logo");
		
		StarTrekModBase.black_boots = new TShirts(StarTrekModBase.uniform, proxy.addArmor("black_boots"), 3).setCreativeTab(startrektab).setTextureName("startrekmod:black_boots").setUnlocalizedName("black_boots");
		StarTrekModBase.black_leggins = new TShirts(StarTrekModBase.uniform, proxy.addArmor("black_leggins"), 2).setCreativeTab(startrektab).setTextureName("startrekmod:black_leggins").setUnlocalizedName("black_leggins");
		
		StarTrekModBase.dilithium_crystal = new BaseItem().setTextureName(Reference.MODID + ":dilithium_crystal").setUnlocalizedName("dilithium_crystal").setCreativeTab(startrektab);
		StarTrekModBase.dilithium_ore = new OreBlock(Material.rock).setHardness(2.0F).setBlockTextureName(Reference.MODID + ":dilithium_ore").setBlockName("dilithium_ore");
		StarTrekModBase.dilithium_circuit = new BaseItem().setTextureName(Reference.MODID + ":dilithium_circuit").setUnlocalizedName("dilithium_circuit").setCreativeTab(startrektab);
	
		StarTrekModBase.Deflector3x3 = new BlockDeflector3x3().setBlockName("Deflector3x3").setHardness(2.8f);
		
		StarTrekModBase.ship_block = new BaseBlock(Material.iron).setBlockTextureName(Reference.MODID + ":ship_block").setBlockName("ship_block").setHardness(3.0f);
		StarTrekModBase.ship_block_marked = new BaseBlock(Material.iron).setBlockTextureName(Reference.MODID + ":ship_block_marked").setBlockName("ship_block_marked").setHardness(3.0f);
		StarTrekModBase.ship_block_marked_front = new BaseBlock(Material.iron).setBlockTextureName("startrekmod:ship_block_marked_yellow").setBlockName("ship_block_marked_front").setHardness(3.0f);
		StarTrekModBase.ship_block_marked_back = new BaseBlock(Material.iron).setBlockTextureName("startrekmod:ship_block_marked_end").setBlockName("ship_block_marked_back").setHardness(3.0f);
		StarTrekModBase.ship_block_window = new BaseBlock(Material.iron).setBlockTextureName("startrekmod:ship_block_window").setBlockName("ship_block_window").setHardness(3.0f).setLightLevel(0.4f);

		StarTrekModBase.helm_panel = new BaseItem().setTextureName(Reference.MODID + ":helm_panel").setUnlocalizedName("helm_panel");
		StarTrekModBase.helm = new BlockHelm().setBlockName("Helm").setHardness(1.0f);
		
		StarTrekModBase.phaser = new ItemPhaser().setUnlocalizedName("phaser");
	}
}
