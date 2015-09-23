package StarTrekMod.Model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelDeflector3x3 extends ModelBase
{
  //fields
    ModelRenderer plate;
    ModelRenderer stick;
    ModelRenderer leftside;
    ModelRenderer rightside;
    ModelRenderer topside;
    ModelRenderer bottomside;
    ModelRenderer frontplate;
    ModelRenderer frontleft;
    ModelRenderer frontright;
    ModelRenderer fronttop;
    ModelRenderer frontbottom;
  
  public ModelDeflector3x3()
  {
    textureWidth = 128;
    textureHeight = 128;
    
      plate = new ModelRenderer(this, 0, 0);
      plate.addBox(0F, 0F, 0F, 32, 32, 1);
      plate.setRotationPoint(-16F, 0F, 7F);
      plate.setTextureSize(128, 128);
      plate.mirror = true;
      setRotation(plate, 0F, 0F, 0F);
      stick = new ModelRenderer(this, 66, 0);
      stick.addBox(0F, 0F, 0F, 2, 2, 14);
      stick.setRotationPoint(-1F, 16F, -7F);
      stick.setTextureSize(128, 128);
      stick.mirror = true;
      setRotation(stick, 0F, 0F, 0F);
      leftside = new ModelRenderer(this, 0, 39);
      leftside.addBox(0F, 0F, 0F, 1, 34, 4);
      leftside.setRotationPoint(-17F, -1F, 3F);
      leftside.setTextureSize(128, 128);
      leftside.mirror = true;
      setRotation(leftside, 0F, 0F, 0F);
      rightside = new ModelRenderer(this, 0, 39);
      rightside.addBox(0F, 0F, 0F, 1, 34, 4);
      rightside.setRotationPoint(16F, -1F, 3F);
      rightside.setTextureSize(128, 128);
      rightside.mirror = true;
      setRotation(rightside, 0F, 0F, 0F);
      topside = new ModelRenderer(this, 6, 33);
      topside.addBox(0F, 0F, 0F, 32, 1, 4);
      topside.setRotationPoint(-16F, -1F, 3F);
      topside.setTextureSize(128, 128);
      topside.mirror = true;
      setRotation(topside, 0F, 0F, 0F);
      bottomside = new ModelRenderer(this, 6, 33);
      bottomside.addBox(0F, 0F, 0F, 32, 1, 4);
      bottomside.setRotationPoint(-16F, 32F, 3F);
      bottomside.setTextureSize(128, 128);
      bottomside.mirror = true;
      setRotation(bottomside, 0F, 0F, 0F);
      frontplate = new ModelRenderer(this, 14, 39);
      frontplate.addBox(0F, 0F, 0F, 16, 16, 1);
      frontplate.setRotationPoint(-8F, 9F, -3F);
      frontplate.setTextureSize(128, 128);
      frontplate.mirror = true;
      setRotation(frontplate, 0F, 0F, 0F);
      frontleft = new ModelRenderer(this, 0, 85);
      frontleft.addBox(0F, 0F, 0F, 1, 18, 2);
      frontleft.setRotationPoint(-9F, 8F, -5F);
      frontleft.setTextureSize(128, 128);
      frontleft.mirror = true;
      setRotation(frontleft, 0F, 0F, 0F);
      frontright = new ModelRenderer(this, 0, 85);
      frontright.addBox(0F, 0F, 0F, 1, 18, 2);
      frontright.setRotationPoint(8F, 8F, -5F);
      frontright.setTextureSize(128, 128);
      frontright.mirror = true;
      setRotation(frontright, 0F, 0F, 0F);
      fronttop = new ModelRenderer(this, 17, 62);
      fronttop.addBox(0F, 0F, 0F, 16, 1, 2);
      fronttop.setRotationPoint(-8F, 8F, -5F);
      fronttop.setTextureSize(128, 128);
      fronttop.mirror = true;
      setRotation(fronttop, 0F, 0F, 0F);
      frontbottom = new ModelRenderer(this, 17, 62);
      frontbottom.addBox(0F, 0F, 0F, 16, 1, 2);
      frontbottom.setRotationPoint(-8F, 25F, -5F);
      frontbottom.setTextureSize(128, 128);
      frontbottom.mirror = true;
      setRotation(frontbottom, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    plate.render(f5);
    stick.render(f5);
    leftside.render(f5);
    rightside.render(f5);
    topside.render(f5);
    bottomside.render(f5);
    frontplate.render(f5);
    frontleft.render(f5);
    frontright.render(f5);
    fronttop.render(f5);
    frontbottom.render(f5);
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
