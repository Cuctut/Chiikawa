package ct.chiikawa.render;

import ct.chiikawa.ChiikawaClient;
import ct.chiikawa.entity.CubeEntity;
import ct.chiikawa.model.CubeEntityModel;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class CubeEntityRenderer extends MobEntityRenderer<CubeEntity, CubeEntityModel> {
 
    public CubeEntityRenderer(EntityRendererFactory.Context context) {
        super(context, new CubeEntityModel(context.getPart(CubeEntityModel.MODEL_CUBE_LAYER)), 0.5f);
    }
 
    @Override
    public Identifier getTexture(CubeEntity entity) {
        return new Identifier("chiikawa", "textures/entity/cube/cube.png");
    }
}