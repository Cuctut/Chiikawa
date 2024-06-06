package ct.chiikawa.registry;

import ct.chiikawa.Chiikawa;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import java.util.HashMap;
import java.util.Map;

public class MainRegistry {
  public final static Map<Integer, Item> registeredItems = new HashMap<>();

  public static void init() {

    Registry.register(Registries.ITEM_GROUP, new Identifier(Chiikawa.MOD_ID, "group"), ItemGroupBuilder.ITEM_GROUP);

    int x = 0;
    for (ChiikawaItems.ItemInfo itemInfo : ChiikawaItems.itemInfos) {
      registeredItems.put(x, registerItem(itemInfo.name(), itemInfo.item()));
      x += 1;
    }

//    ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(content -> {
//      content.addAfter(Items.NETHERITE_AXE, registeredItems.get(0));
//      for (int i = 1; i < registeredItems.size(); i++) {
//        content.addAfter(registeredItems.get(i - 1), registeredItems.get(i));
//      }
//    });
  }

  public static Item registerItem(String name, Item item) {
    return Registry.register(Registries.ITEM, new Identifier(Chiikawa.MOD_ID, name), item);
  }

}