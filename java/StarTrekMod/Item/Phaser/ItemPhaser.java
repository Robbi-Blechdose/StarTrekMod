package StarTrekMod.Item.Phaser;

import StarTrekMod.Reference;
import StarTrekMod.StarTrekModBase;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.ArrowLooseEvent;

public class ItemPhaser extends Item
{
	public ItemPhaser()
	{
		super();
		this.setMaxDamage(1000);
		this.setMaxStackSize(1);
		this.setCreativeTab(StarTrekModBase.startrektab);
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
	{
		if(par3EntityPlayer.capabilities.isCreativeMode)
		{
			this.shoot(par2World, par3EntityPlayer);
		}
		else
		{
			par1ItemStack.damageItem(1, par3EntityPlayer);
			this.shoot(par2World, par3EntityPlayer);
		}
		return par1ItemStack;
	}
	
	private void shoot(World par2World, EntityPlayer par3EntityPlayer)
	{
		par2World.playSoundAtEntity(par3EntityPlayer, Reference.MODID + ":phaser", 0.5f, 1f);
		if(!par2World.isRemote)
		{
			if(par3EntityPlayer.isSneaking())
			{
				par2World.spawnEntityInWorld(new EntityPhaserBolt(par2World, par3EntityPlayer));
			}
			else
			{
				par2World.spawnEntityInWorld(new EntityPhaserBoltStun(par2World, par3EntityPlayer));
			}
		}
	}

	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister)
	{
		itemIcon = iconRegister.registerIcon(Reference.MODID + ":phaser");
	}
}
