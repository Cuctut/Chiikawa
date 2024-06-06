package ct.chiikawa.render;


import ct.chiikawa.Chiikawa;
import ct.chiikawa.model.CubeEntityModel;
import ct.chiikawa.registry.RegisterEntity;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

public class RegisterEntityRenderer {

    public static void init() {
        /*
         * Registers our Cube Entity's renderer, which provides a model and texture for the entity.
         * Entity Renderers can also manipulate the model before it renders based on entity context (EndermanEntityRenderer#render).
         */
        EntityRendererRegistry.register(RegisterEntity.CUBE, CubeEntityRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(CubeEntityModel.MODEL_CUBE_LAYER, CubeEntityModel::getTexturedModelData);
    }
}
