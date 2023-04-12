package net.chrisDev.chrismod.painting;

import net.chrisDev.chrismod.Chrismod;
import net.minecraft.world.entity.decoration.Motive;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModPaintings {

    public static final DeferredRegister<Motive> PAINTING_MOVTIES =
            DeferredRegister.create(ForgeRegistries.PAINTING_TYPES, Chrismod.MOD_ID);

    public static final RegistryObject<Motive> HABON = PAINTING_MOVTIES.register("ahbon", () -> new Motive(64,64));

    public static final RegistryObject<Motive> FAMILY = PAINTING_MOVTIES.register("family", () -> new Motive(64,64));


    public static void register(IEventBus eventBus){
        PAINTING_MOVTIES.register(eventBus);
    }
}
