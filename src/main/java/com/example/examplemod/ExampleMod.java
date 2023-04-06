package com.example.examplemod;

import com.example.examplemod.init.BlockInit;
import com.example.examplemod.init.ItemInit;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("examplemod")
public class ExampleMod
{
    //Identifiant du mod
    public static  final String MOD_ID="examplemod";

    //Permet de crée sa propre créative menu dans le mod
    //Le param de creativeModTab doit etre unique si on en rajoute un, et c'est le nom du mod en gros
    //Rajoute le menu nommer par le mod_id ici examplemod
    public static final CreativeModeTab TUTORIAL_TAB = new CreativeModeTab(MOD_ID) {
        @Override
        @OnlyIn(Dist.CLIENT)
        public ItemStack makeIcon() {
            return new ItemStack(ItemInit.EXAMPLE_ITEM.get());
        }
    };
    //Permet de build le mod
    public ExampleMod()
    {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        ItemInit.ITEMS.register(bus);
        BlockInit.BLOCKS.register(bus);

        MinecraftForge.EVENT_BUS.register(this);
    }
}
