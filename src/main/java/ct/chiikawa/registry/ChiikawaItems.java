package ct.chiikawa.registry;

import ct.chiikawa.item.Sasumata;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterials;

import java.util.LinkedList;
import java.util.List;

public class ChiikawaItems {

    public record ItemInfo(String type, String name, Item item) {
    }

    public static List<ItemInfo> itemInfos = new LinkedList<>();

    public static void init() {

        Item nice_x3 = new Item(new Item.Settings());
        Item hachiwareSticker = new Item(new Item.Settings());
        Item chiikawaSticker = new Item(new Item.Settings());
        Item usagiSticker = new Item(new Item.Settings());

        Sasumata hachiwareSasumata3D = new Sasumata(
                ToolMaterials.IRON,
                new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.IRON, 10, -2.0f)));
        Sasumata chiikawaSasumata3D = new Sasumata(
                ToolMaterials.IRON,
                new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.IRON, 10, -2.0f)));

        itemInfos.add(new ItemInfo("sticker", "nice_x3", nice_x3));
        itemInfos.add(new ItemInfo("sticker", "hachiware_sticker", hachiwareSticker));
        itemInfos.add(new ItemInfo("sticker", "chiikawa_sticker", chiikawaSticker));
        itemInfos.add(new ItemInfo("sticker", "usagi_sticker", usagiSticker));
        itemInfos.add(new ItemInfo("weapon", "hachiware_sasumata_3d", hachiwareSasumata3D));
        itemInfos.add(new ItemInfo("weapon", "chiikawa_sasumata_3d", chiikawaSasumata3D));
    }
}
