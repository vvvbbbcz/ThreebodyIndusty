package bilibili.vvvbbbcz.threebodyindustry.item;

import bilibili.vvvbbbcz.threebodyindustry.ThreebodyIndustry;
import net.minecraft.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Items {
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, ThreebodyIndustry.MODID);

    private static Item register(String name, Item item) {
        ITEMS.register(name, () -> item);
        return item;
    }
}
