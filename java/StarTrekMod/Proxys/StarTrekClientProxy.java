package StarTrekMod.Proxys;

import StarTrekMod.Entity.EntityTribble;
import StarTrekMod.Item.Phaser.EntityPhaserBolt;
import StarTrekMod.Item.Phaser.EntityPhaserBoltStun;
import StarTrekMod.Item.Phaser.RenderPhaserBolt;
import StarTrekMod.Item.Phaser.RenderPhaserBoltStun;
import StarTrekMod.Model.ModelTribble;
import StarTrekMod.Render.RenderTribble;
import StarTrekMod.TileEntity.Deflector.EntityDeflector3x3;
import StarTrekMod.TileEntity.Deflector.RenderDeflector3x3;
import StarTrekMod.TileEntity.Helm.EntityHelm;
import StarTrekMod.TileEntity.Helm.RenderHelm;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class StarTrekClientProxy extends StarTrekCommonProxy
{
	public void registerRenderThings()
	{
		//Render Blocks
		ClientRegistry.bindTileEntitySpecialRenderer(EntityDeflector3x3.class, new RenderDeflector3x3());
		ClientRegistry.bindTileEntitySpecialRenderer(EntityHelm.class, new RenderHelm());
		
		//Render Entities
		RenderingRegistry.registerEntityRenderingHandler(EntityTribble.class, new RenderTribble(new ModelTribble(), 0.4F));
		RenderingRegistry.registerEntityRenderingHandler(EntityPhaserBolt.class, new RenderPhaserBolt());
		RenderingRegistry.registerEntityRenderingHandler(EntityPhaserBoltStun.class, new RenderPhaserBoltStun());
	}

	public int addArmor(String par1)
	{
		return RenderingRegistry.addNewArmourRendererPrefix(par1);
	}
}
