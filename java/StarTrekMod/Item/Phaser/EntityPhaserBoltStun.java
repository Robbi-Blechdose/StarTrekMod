package StarTrekMod.Item.Phaser;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityPhaserBoltStun extends EntityThrowable
{
	public float speed = 8.0F;

	public EntityPhaserBoltStun(World par1World)
	{
		super(par1World);
		setThrowableHeading(this.motionX, this.motionY, this.motionZ, 3.0F, 1.0F);
		this.motionX*=speed;
		this.motionY*=speed;
		this.motionZ*=speed;
	}

	public EntityPhaserBoltStun(World par1World, EntityPlayer par3EntityPlayer)
	{
		super(par1World, par3EntityPlayer);
	}

	public EntityPhaserBoltStun(World par1World, double par2, double par4, double par6)
	{
		super(par1World, par2, par4, par6);
	}

	@Override
	protected float getGravityVelocity()
	{
		return 0;
	}

	@Override
	protected void onImpact(MovingObjectPosition arg0)
	{
		if(arg0.entityHit != null)
		{
			((EntityLivingBase) arg0.entityHit).addPotionEffect((new PotionEffect(Potion.moveSlowdown.getId(), 20, 5)));
			((EntityLivingBase) arg0.entityHit).addPotionEffect((new PotionEffect(Potion.digSlowdown.getId(), 20, 5)));
			((EntityLivingBase) arg0.entityHit).addPotionEffect((new PotionEffect(Potion.weakness.getId(), 20, 5)));
		}
		this.setDead();
	}

}
