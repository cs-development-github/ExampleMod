package com.example.examplemod.init;
import com.example.examplemod.ExampleMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ItemInit {

    //Enregistre l'item dans le mod
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ExampleMod.MOD_ID);

    //Crée l'item et le range dans le bon menu on donne le nom et la proprièter ici par exemple ou il est ranger
    public static final RegistryObject<Item> EXAMPLE_ITEM = register("example_item", () -> new Item(new Item.Properties()
            .tab(ExampleMod.TUTORIAL_TAB)));

    //On précise que c'est un item et qu'on l'enregistre comme tel
    private static <T extends Item> RegistryObject<T> register(final String name, final Supplier<T> item){
        return ITEMS.register(name,item);
    }
}
