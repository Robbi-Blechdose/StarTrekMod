package StarTrekMod.TileEntity.Deflector;

import org.lwjgl.opengl.GL11;

import StarTrekMod.Model.ModelDeflector3x3;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

@SideOnly(Side.CLIENT)
public class RenderDeflector3x3 extends TileEntitySpecialRenderer
{
    private final ModelDeflector3x3 model;
   
    public RenderDeflector3x3()
    {
            this.model = new ModelDeflector3x3();
    }
   
    private void adjustRotatePivotViaMeta(World world, int x, int y, int z)
    {
            int meta = world.getBlockMetadata(x, y, z);
            GL11.glPushMatrix();
            GL11.glRotatef(meta * (-90), 0.0F, 0.0F, 1.0F);
            GL11.glPopMatrix();
    }
   
    @Override
    public void renderTileEntityAt(TileEntity te, double x, double y, double z, float scale)
    {
            GL11.glPushMatrix();
            GL11.glTranslatef((float) x + 0.5F, (float) y + 1.5F, (float) z + 0.5F);
            final ResourceLocation RESOURCE_PNG = new ResourceLocation("startrekmod", "textures/blocks/Deflector3x3.png");

            bindTexture(RESOURCE_PNG);
            GL11.glPushMatrix();
            GL11.glRotatef(180F, 0.0F, 0.0F, 1.0F);
            
            
            	
            int rotation = 0;
            switch (te.getBlockMetadata() % 4)
            {
            	case 0:
            		rotation = 270;
            		break;
            	case 1:
            		rotation = 0;
            		break;
            	case 2:
            			rotation = 90;
            			break;
            	case 3:
            		rotation = 180;
            		break;
            }
            GL11.glRotatef(rotation, 0.0F, 1.0F, 0.0F);
            this.model.render(null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
            GL11.glPopMatrix();
            GL11.glPopMatrix();
    }
   
    private void adjustLightFixture(World world, int i, int j, int k, Block block)
    {
            Tessellator tess = Tessellator.instance;
            float brightness = block.getLightOpacity(world, i, j, k);
            int skyLight = world.getLightBrightnessForSkyBlocks(i, j, k, 0);
            int modulousModifier = skyLight % 65536;
            int divModifier = skyLight / 65536;
            tess.setColorOpaque_F(brightness, brightness, brightness);
            OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit,  (float) modulousModifier,  divModifier);
    }
}
