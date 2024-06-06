package ct.chiikawa.registry;

import ct.chiikawa.entity.CubeEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class RegisterEntity {

    public static final EntityType<CubeEntity> CUBE = Registry.register(
            Registries.ENTITY_TYPE,
            new Identifier("chiikawa", "cube"),
            EntityType.Builder.create(CubeEntity::new, SpawnGroup.CREATURE).dimensions(0.75f, 0.75f).build()
    );

    public static void init(){
        FabricDefaultAttributeRegistry.register(CUBE, CubeEntity.createMobAttributes());
    }


//    public static final EntityType<CubeEntity> CUBE = Registry.register(
//            Registries.ENTITY_TYPE,
//            new Identifier("entitytesting", "cube"),
//            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, CubeEntity::new).dimensions(EntityDimensions.fixed(0.75f, 0.75f)).build()
//    );

}
