package StarTrekMod;

import StarTrekMod.Entity.EntityTribble;
import StarTrekMod.Item.Phaser.EntityPhaserBolt;
import StarTrekMod.Item.Phaser.EntityPhaserBoltStun;
import StarTrekMod.TileEntity.Deflector.EntityDeflector3x3;
import StarTrekMod.TileEntity.Helm.EntityHelm;
import StarTrekMod.WorldGen.WorldGenCrashedShip;
import StarTrekMod.WorldGen.WorldGenerator;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.entity.EntityList;

public class StarTrekRegistry
{
	public static void registerItems()
	{
		GameRegistry.registerItem(StarTrekModBase.commanduniform, "commanduniform");
		GameRegistry.registerItem(StarTrekModBase.scienceuniform, "scienceuniform");
		GameRegistry.registerItem(StarTrekModBase.protectivehelmet, "protectivehelmet");
		GameRegistry.registerItem(StarTrekModBase.protectivechest, "protectivechest");
		GameRegistry.registerItem(StarTrekModBase.protectiveleggins, "protectiveleggins");
		GameRegistry.registerItem(StarTrekModBase.protectiveboots, "protectiveboots");
		GameRegistry.registerItem(StarTrekModBase.logo, "logo");
		GameRegistry.registerItem(StarTrekModBase.black_boots, "black_boots");
		GameRegistry.registerItem(StarTrekModBase.black_leggins, "black_leggins");
		GameRegistry.registerItem(StarTrekModBase.dilithium_crystal, "dithium_crystal");
		GameRegistry.registerItem(StarTrekModBase.dilithium_circuit, "dilithium_circuit");
		GameRegistry.registerItem(StarTrekModBase.engineeringuniform, "engineeringuniform");
		GameRegistry.registerItem(StarTrekModBase.helm_panel, "helm_panel");
		GameRegistry.registerItem(StarTrekModBase.phaser, "phaser");
	}
	
	public static void registerBlocks()
	{
		GameRegistry.registerBlock(StarTrekModBase.dilithium_ore, "dithium_ore");
		GameRegistry.registerBlock(StarTrekModBase.Deflector3x3, "Deflector3x3");
		GameRegistry.registerBlock(StarTrekModBase.ship_block, "ship_block");
		GameRegistry.registerBlock(StarTrekModBase.ship_block_marked, "ship_block_marked");
		GameRegistry.registerBlock(StarTrekModBase.ship_block_marked_front, "ship_block_marked_front");
		GameRegistry.registerBlock(StarTrekModBase.ship_block_marked_back, "ship_block_marked_back");
		GameRegistry.registerBlock(StarTrekModBase.ship_block_window, "ship_block_window");
		GameRegistry.registerBlock(StarTrekModBase.helm, "Helm");
	}
	
	public static void registerTileEntities()
	{
		GameRegistry.registerTileEntity(EntityDeflector3x3.class, "Deflector3x3");
			GameRegistry.registerTileEntity(EntityHelm.class, "Helm");
	}
	
	public static void registerEntities(StarTrekModBase base)
	{
		int entityID;
        entityID = EntityRegistry.findGlobalUniqueEntityId();
    	EntityRegistry.registerModEntity(EntityTribble.class, "Tribble", 600, base, 80, 3, true);
    	EntityList.addMapping(EntityTribble.class, "Tribble", 1200, 0x318A25, 0x26F50F);
    	
    	EntityRegistry.registerGlobalEntityID(EntityPhaserBolt.class, "PhaserBolt", EntityRegistry.findGlobalUniqueEntityId());
    	EntityRegistry.registerModEntity(EntityPhaserBolt.class, "PhaserBolt", 601, base, 128, 3, true);

    	EntityRegistry.registerGlobalEntityID(EntityPhaserBoltStun.class, "PhaserBolt_Stun", EntityRegistry.findGlobalUniqueEntityId());
    	EntityRegistry.registerModEntity(EntityPhaserBoltStun.class, "PhaserBolt_Stun", 602, base, 128, 3, true);
	}
	
	public static void registerWorldGenerators()
	{
		GameRegistry.registerWorldGenerator(new WorldGenerator(), 1);
	}
}
