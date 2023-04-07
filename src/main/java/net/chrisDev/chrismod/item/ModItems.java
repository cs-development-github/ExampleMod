package net.chrisDev.chrismod.item;

import net.chrisDev.chrismod.Chrismod;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Chrismod.MOD_ID);

    public static final RegistryObject<Item> AMETHYST = register("amethyst",
            () -> new Item(new Item.Properties().tab(ModItemGroup.ChrisModTab)) );

    private static <T extends Item> RegistryObject<T> register(final String name, final Supplier<T> item){
        return ITEMS.register(name,item);
    }
}
