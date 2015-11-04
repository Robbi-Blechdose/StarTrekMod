package StarTrekMod.Item.Phaser;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityPhaserBolt extends EntityThrowable
{
	public float speed = 8.0F;

	public EntityPhaserBolt(World par1World)
	{
		super(par1World);
		setThrowableHeading(this.motionX, this.motionY, this.motionZ, 3.0F, 1.0F);
		this.motionX*=speed;
		this.motionY*=speed;
		this.motionZ*=speed;
	}

	public EntityPhaserBolt(World par1World, EntityPlayer par3EntityPlayer)
	{
		super(par1World, par3EntityPlayer);
	}

	public EntityPhaserBolt(World par1World, double par2, double par4, double par6)
	{
		super(par1World, par2, par4, par6);
	}

	@Override
	protected void onImpact(MovingObjectPosition movingobjectposition)
	{
		this.worldObj.createExplosion(this, this.posX, this.posY, this.posZ, 1.5F, true);
		this.setDead();
	}

	@Override
	protected float getGravityVelocity()
	{
		return 0;
	}

}
