package ct.chiikawa.item;

import net.minecraft.item.*;

public class Sasumata extends SwordItem {

    public Sasumata(ToolMaterial toolMaterial, Settings settings) {
        super(toolMaterial, settings);
    }

    //    @Override
//    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
//        user.playSound(SoundEvents.BLOCK_WOOL_BREAK, 1.0F, 1.0F);
//        return TypedActionResult.success(user.getStackInHand(hand));
//    }

//    @Override
//    public boolean postMine(ItemStack stack, World world, BlockState state, BlockPos pos, LivingEntity miner) {
//        return super.postMine(stack, world, state, pos, miner);
//    }
}
