package ct.chiikawa;

import ct.chiikawa.registry.ChiikawaItems;
import ct.chiikawa.registry.ItemGroupBuilder;
import ct.chiikawa.registry.MainRegistry;
import ct.chiikawa.registry.RegisterEntity;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Chiikawa implements ModInitializer {
	public static final String MOD_ID = "chiikawa";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Chiikawa!");
		ChiikawaItems.init();
		ItemGroupBuilder.build();
		MainRegistry.init();

		RegisterEntity.init();
	}
}