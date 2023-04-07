package net.chrisDev.chrismod.item;

import net.chrisDev.chrismod.Chrismod;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModItemGroup {

    public static final CreativeModeTab ChrisModTab = new CreativeModeTab(Chrismod.MOD_ID) {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.AMETHYST.get());
        }
    };
}
