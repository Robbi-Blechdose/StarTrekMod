package StarTrekMod.Util;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;

public class UtilWarp {
	
	public static CBlock[] copyShip(World world, int x, int y, int z, int sx, int sy, int sz){
		int i=3;
		CBlock[] ship = new CBlock[255*255*255];
		ship[0]=new CBlock(null, sx, null,false);
		ship[1]=new CBlock(null, sy, null,false);
		ship[2]=new CBlock(null, sz, null,false);
		for(int ix = 0; ix<sx; ix++){
			for(int iy = 0; iy<sy; iy++){
				for(int iz = 0; iz<sz; iz++){
					NBTTagCompound cpnd = new NBTTagCompound();
					if (world.getTileEntity(x+ix, y+iy, z+iz)!=null){
						world.getTileEntity(x+ix, y+iy, z+iz).writeToNBT(cpnd);
						ship[i]=new CBlock(world.getBlock(x+ix,y+iy,z+iz), world.getBlockMetadata(x+ix,y+iy,z+iz), cpnd,true);
					}else{
						ship[i]=new CBlock(world.getBlock(x+ix,y+iy,z+iz), world.getBlockMetadata(x+ix,y+iy,z+iz), new NBTTagCompound(),false);
					}
					i++;
				}
			}
		}
		return ship;
	}
	
	public static void pasteShip(World world, int x, int y, int z, CBlock[] ship){
		int i=3;
		int sx=ship[0].metadata;
		int sy=ship[1].metadata; 
		int sz=ship[2].metadata;
		for(int ix = 0; ix<sx; ix++){
			for(int iy = 0; iy<sy; iy++){
				for(int iz = 0; iz<sz; iz++){
					world.setBlock(x+ix, y+iy, z+iz, ship[i].block);
					world.setBlockMetadataWithNotify(x+ix, y+iy, z+iz, ship[i].metadata, 2);
					if (ship[i].hasTileEntity){
						world.getTileEntity(x+ix, y+iy, z+iz).readFromNBT(ship[i].nbt);
						world.getTileEntity(x+ix, y+iy, z+iz).xCoord=x+ix;
						world.getTileEntity(x+ix, y+iy, z+iz).yCoord=y+iy;
						world.getTileEntity(x+ix, y+iy, z+iz).zCoord=z+iz;						
					}
					i++;
				}
			}
		}
		for(int ix=0; ix<sx; ix++){
			for(int iy=0; iy<sy; iy++){
				for(int iz=0; iz<sz; iz++){
					world.getBlock(x+ix, y+iy, z+iz).onNeighborBlockChange(world, x+ix, y+iy, z+iz, world.getBlock(x+ix, y+iy, z+iz));
				}
			}
		}

		return;
	}
	
	public static void clearArea(World world, int x, int y, int z, int sx, int sy, int sz){
		for(int ix=0; ix<sx; ix++){
			for(int iy=0; iy<sy; iy++){
				for(int iz=0; iz<sz; iz++){
					if(world.getTileEntity(x+ix, y+iy, z+iz)!=null){
						world.getTileEntity(x+ix, y+iy, z+iz).readFromNBT(new NBTTagCompound());
					}
					world.setBlockToAir(x+ix, y+iy, z+iz);
				}
			}
		}
		for(int ix=-1; ix<sx+1; ix++){
			for(int iy=-1; iy<sy+1; iy++){
				for(int iz=-1; iz<sz+1; iz++){
					world.getBlock(x+ix, y+iy, z+iz).onNeighborBlockChange(world, x+ix, y+iy, z+iz, world.getBlock(x+ix, y+iy, z+iz));
				}
			}
		}
			
	}
	
	public static CBlock[] turnLeft(CBlock[] ship){
		CBlock[][][] oldShip = new CBlock[255][255][255];
		CBlock[] newShip = new CBlock[255*255*255];
		int sx = ship[0].metadata;
		int sy = ship[1].metadata;
		int sz = ship[2].metadata;
		int i=3;
		for(int x=sx-1; x>=0; x--){
			for(int y=0; y<sy; y++){
				for(int z=0; z<sz; z++){
					oldShip[x][y][z] = ship[i];
					i++;
				}
			}
		}
		newShip[0]=new CBlock(null, sz, null, false);
		newShip[1]=new CBlock(null, sy, null, false);
		newShip[2]=new CBlock(null, sx, null, false);
		i=3;
		for(int z=0; z<sz; z++){
			for(int y=0; y<sy; y++){
				for(int x=0; x<sx; x++){
					newShip[i] = oldShip[x][y][z];
					i++;
				}
			}
		}
		return newShip;
	}
	
	public static CBlock[] turnRight(CBlock[] ship){
		CBlock[][][] oldShip = new CBlock[128][128][128];
		CBlock[] newShip = new CBlock[128*128*128];
		int sx = ship[0].metadata;
		int sy = ship[1].metadata;
		int sz = ship[2].metadata;
		int i=3;
		for(int x=0; x<sx; x++){
			for(int y=0; y<sy; y++){
				for(int z=sz-1; z>=0; z--){
					oldShip[x][y][z] = ship[i];
					i++;
				}
			}
		}
		newShip[0]=new CBlock(null, sz, null, false);
		newShip[1]=new CBlock(null, sy, null, false);
		newShip[2]=new CBlock(null, sx, null, false);
		i=3;
		for(int z=0; z<sz; z++){
			for(int y=0; y<sy; y++){
				for(int x=0; x<sx; x++){
					newShip[i] = oldShip[x][y][z];
					i++;
				}
			}
		}
		return newShip;
	}
	
	public static int getBlocksCount(World world, int x, int y, int z, int lenX, int lenY, int lenZ){
		int i=0;
		for(int x1=0; x1<lenX; x1++){
			for(int y1=0; y1<lenY; y1++){
				for(int z1=0; z1<lenZ; z1++){
					if(!world.getBlock(x+x1, y+y1, z+z1).equals(Blocks.air)){
						i++;
					}
				}
			}
		}
		return i;
	}
	
	public static boolean isFree(World world, int x, int y, int z, int lenX, int lenY, int lenZ){
		if(getBlocksCount(world, x, y, z, lenX, lenY, lenZ)>0){
			System.out.println(getBlocksCount(world, x, y, z, lenX, lenY, lenZ));
			return false;
		}
		return true;
	}
	
	public static boolean containsUnbreakableBlock(World world, int x, int y, int z, int lenX, int lenY, int lenZ){
		for(int x1=0; x1<lenX; x1++){
			for(int y1=0; y1<lenY; y1++){
				for(int z1=0; z1<lenZ; z1++){
					if(world.blockExists(x+x1, y+y1, z+z1)){
						if(world.getBlock(x+x1, y+y1, z+z1).getBlockHardness(world, x+x1, y+y1, z+z1)<0){
							return true;
						}
					}
				}

			}

		}
		return false;
	}
	
	public static void warpShip(World world, int x, int y, int z, int lenX, int lenY, int lenZ, int tarX, int tarY, int tarZ){
		if(containsUnbreakableBlock(world, x, y, z, lenX, lenY, lenZ)){
			Minecraft.getMinecraft().thePlayer.sendChatMessage("Failed to warp: Ship containes indestructable Blocks");
			return;
		}
		CBlock[] ship = new CBlock[255*255*255];
		ship=copyShip(world,x,y,z,lenX,lenY,lenZ);
		clearArea(world,x,y,z,lenX,lenY,lenZ);
		if(!isFree(world, tarX,tarY,tarZ,lenX,lenY,lenZ)){
			Minecraft.getMinecraft().thePlayer.sendChatMessage("Failed to warp: Target Space not empty");
			pasteShip(world,x,y,z,ship);
			return;
		}
		pasteShip(world,tarX,tarY,tarZ,ship);
		List<Entity> e = world.getEntitiesWithinAABB(Entity.class, AxisAlignedBB.getBoundingBox(x, y, z, x+lenX, y+lenY, z+lenZ));
		for(int i=0; i<e.size(); i++){
			Entity en = e.get(i);
			en.setPosition(en.posX-x+tarX, en.posY-y+tarY, en.posZ-z+tarZ);
		}
	}
}
