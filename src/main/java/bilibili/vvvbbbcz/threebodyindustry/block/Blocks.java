package bilibili.vvvbbbcz.threebodyindustry.block;

import bilibili.vvvbbbcz.threebodyindustry.ThreebodyIndustry;
import net.minecraft.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Blocks {
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, ThreebodyIndustry.MODID);

    private static Block register(String name, Block block) {
        BLOCKS.register(name, () -> block);
        return block;
    }
}
