package ct.chiikawa.registry;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;

public class ItemGroupBuilder {

    public static ItemGroup ITEM_GROUP = null;

    public static void build(){
        ITEM_GROUP = FabricItemGroup.builder()
                .icon(() -> new ItemStack(ChiikawaItems.itemInfos.get(0).item()))
                .displayName(Text.translatable("itemGroup.chiikawa.group"))
                .entries((context, entries) -> {
                    for (ChiikawaItems.ItemInfo item : ChiikawaItems.itemInfos) {
                        entries.add(item.item());
                    }
                })
                .build();
    }
}
