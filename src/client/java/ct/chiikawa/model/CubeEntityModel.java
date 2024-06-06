package ct.chiikawa.model;

import ct.chiikawa.entity.CubeEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.render.entity.model.EntityModelPartNames;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import org.spongepowered.include.com.google.common.collect.ImmutableList;

public class CubeEntityModel extends EntityModel<CubeEntity> {

    public static final EntityModelLayer MODEL_CUBE_LAYER = new EntityModelLayer(new Identifier("chiikawa", "cube"), "main");

    private final ModelPart base;
 
    public CubeEntityModel(ModelPart modelPart) {
        this.base = modelPart.getChild(EntityModelPartNames.CUBE);
    }

    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        modelPartData.addChild(EntityModelPartNames.CUBE, ModelPartBuilder.create().uv(0, 0).cuboid(-6F, 12F, -6F, 12F, 12F, 12F), ModelTransform.pivot(0F, 0F, 0F));
        return TexturedModelData.of(modelData, 64, 64);

//        ModelData modelData = new ModelData();
//        ModelPartData modelPartData = modelData.getRoot();
//        ModelPartData bb_main = modelPartData.addChild("bb_main", ModelPartBuilder.create().uv(0, 0).cuboid(-4.0F, -12.0F, -4.0F, 8.0F, 8.0F, 8.0F, new Dilation(0.0F))
//                .uv(6, 1).cuboid(1.0F, -10.0F, 4.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.15F))
//                .uv(6, 0).cuboid(-2.0F, -10.0F, 4.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.15F))
//                .uv(0, 6).cuboid(-2.0F, -7.0F, 4.0F, 4.0F, 1.0F, 0.0F, new Dilation(0.15F))
//                .uv(0, 1).cuboid(1.0F, -8.0F, 4.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.15F))
//                .uv(0, 0).cuboid(-2.0F, -8.0F, 4.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.15F))
//                .uv(17, 21).cuboid(-2.0F, -4.0F, -1.0F, 1.0F, 4.0F, 1.0F, new Dilation(0.0F))
//                .uv(0, 21).cuboid(1.0F, -4.0F, -1.0F, 1.0F, 4.0F, 1.0F, new Dilation(0.0F))
//                .uv(4, 22).cuboid(1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
//                .uv(21, 20).cuboid(-2.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
//                .uv(0, 0).cuboid(-1.0F, -16.0F, -1.0F, 2.0F, 4.0F, 2.0F, new Dilation(0.0F))
//                .uv(0, 16).cuboid(-3.0F, -12.25F, -3.0F, 6.0F, 1.0F, 6.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 24.0F, 0.0F));
//
//        ModelPartData cube_r1 = bb_main.addChild("cube_r1", ModelPartBuilder.create().uv(0, 16).cuboid(-1.0F, -1.0F, -1.0F, 1.0F, 4.0F, 1.0F, new Dilation(0.0F))
//                .uv(18, 16).cuboid(8.0F, -1.0F, -1.0F, 1.0F, 4.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-4.0F, -8.0F, 0.0F, 0.6545F, 0.0F, 0.0F));
//        return TexturedModelData.of(modelData, 32, 32);
    }

    @Override
    public void setAngles(CubeEntity entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {

    }

    /**
     * Renders the model.
     *
     * @param matrices
     * @param vertices
     * @param light    the lightmap coordinates used for this model rendering
     * @param overlay
     * @param red
     * @param green
     * @param blue
     * @param alpha
     */
    @Override
    public void render(MatrixStack matrices, VertexConsumer vertices, int light, int overlay, float red, float green, float blue, float alpha) {
        ImmutableList.of(this.base).forEach((modelRenderer) -> {
            modelRenderer.render(matrices, vertices, light, overlay, red, green, blue, alpha);
        });
    }
}