package StarTrekMod.Render;

import java.util.Random;

import StarTrekMod.Entity.EntityTribble;
import StarTrekMod.Model.ModelTribble;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.util.ResourceLocation;

public class RenderTribble extends RenderLiving
{
protected ModelTribble model;

public RenderTribble (ModelTribble modelMech, float f)
{
super(modelMech, f);
model = ((ModelTribble)mainModel);
}

public void renderTutorial(EntityTribble par1EntityLiving, double par2, double par4, double par6, float par8, float par9)
    {
        super.doRender(par1EntityLiving, par2, par4, par6, par8, par9);
    }

public void doRenderLiving(EntityLiving par1EntityLiving, double par2, double par4, double par6, float par8, float par9)
    {
        renderTutorial((EntityTribble)par1EntityLiving, par2, par4, par6, par8, par9);
    }

public void doRender(Entity par1Entity, double par2, double par4, double par6, float par8, float par9)
    {
        renderTutorial((EntityTribble)par1Entity, par2, par4, par6, par8, par9);
    }

private static final ResourceLocation brown = new ResourceLocation("startrekmod", "textures/entity/Tribble.png");
private static final ResourceLocation grey = new ResourceLocation("startrekmod", "textures/entity/Tribble_grey.png");
private static final ResourceLocation grey_dark = new ResourceLocation("startrekmod", "textures/entity/Tribble_grey_dark.png");

/**
protected ResourceLocation getWhichEntityTexture(EntityTribble tribble)
{
    switch (tribble.WhichTexture())
    {
    case 0:
    default:
    return brown;
    case 1:
    return grey;
    case 2:
    return grey_dark;
    case 3:
    return brown;
    }
}
**/

@Override
protected ResourceLocation getEntityTexture(Entity entity)
{
	//return this.getWhichEntityTexture((EntityTribble)entity);
	return brown;
}
}