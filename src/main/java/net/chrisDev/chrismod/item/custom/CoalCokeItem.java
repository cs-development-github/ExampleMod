package net.chrisDev.chrismod.item.custom;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import javax.annotation.Nullable;

public class CoalCokeItem extends Item {
    public CoalCokeItem(Properties properties) {
        super(properties);
    }
        @Override
        public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType ){
            return 3200;
        }
}
