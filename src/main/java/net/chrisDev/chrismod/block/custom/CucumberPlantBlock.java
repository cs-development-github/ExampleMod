package net.chrisDev.chrismod.block.custom;

import net.chrisDev.chrismod.item.ModItems;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.IntegerProperty;

public class CucumberPlantBlock extends CropBlock {

    public static final IntegerProperty AGE = BlockStateProperties.AGE_5;
    public CucumberPlantBlock(Properties properties) {
        super(properties);
    }


    @Override
    public int getMaxAge() {
        return 5;
    }

    @Override
    protected ItemLike getBaseSeedId() {
        return ModItems.CUCUMBER_SEEDS.get();
    }
}
