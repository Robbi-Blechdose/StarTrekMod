package StarTrekMod.WorldGen;

import java.util.Random;

import StarTrekMod.StarTrekModBase;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;

public class WorldGenCrashedShip extends WorldGenerator
{
	public WorldGenCrashedShip()
	{
		
	}

	public boolean generate(World world, Random rand, int x, int y, int z)
	{
		if(world.getBlock(x, y - 1, z) != Blocks.grass)
		{
			return false;
		}
		
		world.setBlock(x+3, y-2, z+6, StarTrekModBase.ship_block);
		world.setBlock(x+4, y-2, z+6, StarTrekModBase.ship_block);
		world.setBlock(x+5, y-2, z+6, StarTrekModBase.ship_block);
		world.setBlock(x+3, y-2, z+7, StarTrekModBase.ship_block);
		world.setBlock(x+4, y-2, z+7, StarTrekModBase.ship_block);
		world.setBlock(x+5, y-2, z+7, StarTrekModBase.ship_block);
		world.setBlock(x+3, y-2, z+8, StarTrekModBase.ship_block);
		world.setBlock(x+4, y-2, z+8, StarTrekModBase.ship_block);
		world.setBlock(x+5, y-2, z+8, StarTrekModBase.ship_block);
		world.setBlock(x+3, y-2, z+9, StarTrekModBase.ship_block);
		world.setBlock(x+4, y-2, z+9, StarTrekModBase.ship_block);
		world.setBlock(x+5, y-2, z+9, StarTrekModBase.ship_block);
		world.setBlock(x+1, y-1, z+2, StarTrekModBase.ship_block);
		world.setBlock(x+1, y-1, z+3, StarTrekModBase.ship_block);
		world.setBlock(x+7, y-1, z+3, StarTrekModBase.ship_block);
		world.setBlock(x+1, y-1, z+4, StarTrekModBase.ship_block);
		world.setBlock(x+7, y-1, z+4, StarTrekModBase.ship_block);
		world.setBlock(x+1, y-1, z+5, StarTrekModBase.ship_block);
		world.setBlock(x+3, y-1, z+5, StarTrekModBase.ship_block);
		world.setBlock(x+4, y-1, z+5, StarTrekModBase.ship_block);
		world.setBlock(x+5, y-1, z+5, StarTrekModBase.ship_block);
		world.setBlock(x+1, y-1, z+6, StarTrekModBase.ship_block);
		world.setBlock(x+3, y-1, z+6, StarTrekModBase.ship_block);
		world.setBlock(x+4, y-1, z+6, StarTrekModBase.ship_block);
		world.setBlock(x+5, y-1, z+6, StarTrekModBase.ship_block);
		world.setBlock(x+3, y-1, z+7, StarTrekModBase.ship_block);
		world.setBlock(x+4, y-1, z+7, StarTrekModBase.ship_block);
		world.setBlock(x+3, y-1, z+8, StarTrekModBase.ship_block);
		world.setBlock(x+4, y-1, z+8, StarTrekModBase.ship_block);
		world.setBlock(x+3, y-1, z+9, StarTrekModBase.ship_block);
		world.setBlock(x+4, y-1, z+9, StarTrekModBase.ship_block);
		world.setBlock(x+5, y-1, z+9, StarTrekModBase.ship_block);
		
		world.setBlock(x+4, y-1, z+10, StarTrekModBase.Deflector3x3);
		world.setBlockMetadataWithNotify(x+4, y-1, z+10, 3, 3);
		
		world.setBlock(x+4, y-2, z+10, Blocks.air);
		world.setBlock(x+3, y-2, z+10, Blocks.air);
		world.setBlock(x+5, y-2, z+10, Blocks.air);
		
		world.setBlock(x+5, y-1, z+10, Blocks.air);
		world.setBlock(x+3, y-1, z+10, Blocks.air);
		
		world.setBlock(x+3, y-1, z+12, StarTrekModBase.ship_block);
		world.setBlock(x+4, y-1, z+12, StarTrekModBase.ship_block);
		world.setBlock(x+5, y-1, z+12, StarTrekModBase.ship_block);
		world.setBlock(x+3, y-1, z+13, StarTrekModBase.ship_block);
		world.setBlock(x+4, y-1, z+13, StarTrekModBase.ship_block);
		world.setBlock(x+5, y-1, z+13, StarTrekModBase.ship_block);
		world.setBlock(x+4, y-1, z+14, StarTrekModBase.ship_block);
		world.setBlock(x+7, y, z+0, StarTrekModBase.ship_block);
		world.setBlock(x+7, y, z+1, StarTrekModBase.ship_block);
		world.setBlock(x+7, y, z+2, StarTrekModBase.ship_block);
		world.setBlock(x+3, y, z+4, StarTrekModBase.ship_block);
		world.setBlock(x+4, y, z+4, StarTrekModBase.ship_block);
		world.setBlock(x+5, y, z+4, StarTrekModBase.ship_block_window);
		world.setBlock(x+1, y, z+5, StarTrekModBase.ship_block);
		world.setBlock(x+3, y, z+5, StarTrekModBase.ship_block_window);
		world.setBlock(x+4, y, z+5, StarTrekModBase.ship_block);
		world.setBlock(x+5, y, z+5, StarTrekModBase.ship_block);
		world.setBlock(x+3, y, z+6, StarTrekModBase.ship_block);
		world.setBlock(x+4, y, z+6, StarTrekModBase.ship_block);
		world.setBlock(x+5, y, z+6, StarTrekModBase.ship_block);
		world.setBlock(x+3, y, z+7, StarTrekModBase.ship_block);
		world.setBlock(x+3, y, z+8, StarTrekModBase.ship_block_window);
		world.setBlock(x+4, y, z+8, StarTrekModBase.ship_block);
		world.setBlock(x+3, y, z+9, StarTrekModBase.ship_block);
		world.setBlock(x+4, y, z+9, StarTrekModBase.ship_block);
		world.setBlock(x+5, y, z+9, StarTrekModBase.ship_block);
		world.setBlock(x+2, y, z+12, StarTrekModBase.ship_block);
		world.setBlock(x+2, y, z+13, StarTrekModBase.ship_block);
		world.setBlock(x+6, y, z+13, StarTrekModBase.ship_block);
		world.setBlock(x+6, y, z+14, StarTrekModBase.ship_block);
		world.setBlock(x+1, y+1, z+5, StarTrekModBase.ship_block);
		world.setBlock(x+5, y+1, z+5, StarTrekModBase.ship_block);
		world.setBlock(x+6, y+1, z+5, StarTrekModBase.ship_block);
		world.setBlock(x+4, y+1, z+9, StarTrekModBase.ship_block);
		world.setBlock(x+4, y+1, z+10, StarTrekModBase.ship_block);
		world.setBlock(x+6, y+1, z+14, StarTrekModBase.ship_block);
		
		return false;
	}

}
