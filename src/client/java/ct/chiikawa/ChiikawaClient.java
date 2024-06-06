package ct.chiikawa;

import ct.chiikawa.render.RegisterEntityRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

public class ChiikawaClient implements ClientModInitializer {

	@Override
	public void onInitializeClient() {
		// This entrypoint is suitable for setting up client-specific logic, such as rendering.
		RegisterEntityRenderer.init();
	}
}