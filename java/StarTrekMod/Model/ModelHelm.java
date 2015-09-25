package StarTrekMod.Model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelHelm extends ModelBase
{
  //fields
    ModelRenderer Bottom;
    ModelRenderer Pylon;
    ModelRenderer Middle;
    ModelRenderer Table_right;
    ModelRenderer Table_left;
    ModelRenderer Table_middle;
    ModelRenderer Lamp;
  
  public ModelHelm()
  {
    textureWidth = 128;
    textureHeight = 128;
    
      Bottom = new ModelRenderer(this, 0, 0);
      Bottom.addBox(0F, 0F, 0F, 16, 1, 16);
      Bottom.setRotationPoint(-8F, 23F, -8F);
      Bottom.setTextureSize(128, 128);
      Bottom.mirror = true;
      setRotation(Bottom, 0F, 0F, 0F);
      Pylon = new ModelRenderer(this, 43, 68);
      Pylon.addBox(0F, 0F, 0F, 4, 12, 4);
      Pylon.setRotationPoint(-2F, 12F, 6F);
      Pylon.setTextureSize(128, 128);
      Pylon.mirror = true;
      setRotation(Pylon, -0.1745329F, 0F, 0F);
      Middle = new ModelRenderer(this, 0, 78);
      Middle.addBox(0F, 0F, 0F, 10, 10, 10);
      Middle.setRotationPoint(-5F, 13F, -5F);
      Middle.setTextureSize(128, 128);
      Middle.mirror = true;
      setRotation(Middle, 0F, 0F, 0F);
      Table_right = new ModelRenderer(this, 0, 49);
      Table_right.addBox(0F, 0F, 0F, 19, 2, 13);
      Table_right.setRotationPoint(5F, 12F, 0F);
      Table_right.setTextureSize(128, 128);
      Table_right.mirror = true;
      setRotation(Table_right, 0.0698132F, 0F, 0F);
      Table_left = new ModelRenderer(this, 0, 32);
      Table_left.addBox(0F, 0F, 0F, 19, 2, 13);
      Table_left.setRotationPoint(-24F, 12F, 0F);
      Table_left.setTextureSize(128, 128);
      Table_left.mirror = true;
      setRotation(Table_left, 0.0698132F, 0F, 0F);
      Table_middle = new ModelRenderer(this, 0, 66);
      Table_middle.addBox(0F, 0F, 0F, 10, 2, 9);
      Table_middle.setRotationPoint(-5F, 11.7F, 4F);
      Table_middle.setTextureSize(128, 128);
      Table_middle.mirror = true;
      setRotation(Table_middle, 0.0698132F, 0F, 0F);
      Lamp = new ModelRenderer(this, 65, 0);
      Lamp.addBox(0F, 0F, 0F, 2, 2, 1);
      Lamp.setRotationPoint(-1F, 9.3F, 11F);
      Lamp.setTextureSize(128, 128);
      Lamp.mirror = true;
      setRotation(Lamp, 0.0698132F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    Bottom.render(f5);
    Pylon.render(f5);
    Middle.render(f5);
    Table_right.render(f5);
    Table_left.render(f5);
    Table_middle.render(f5);
    Lamp.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, null);
  }

}
