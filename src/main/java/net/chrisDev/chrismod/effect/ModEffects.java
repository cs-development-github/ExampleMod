package net.chrisDev.chrismod.effect;

import net.chrisDev.chrismod.Chrismod;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEffects {

    public static final DeferredRegister<MobEffect> MOB_EFFECT = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, Chrismod.MOD_ID);


    public static final RegistryObject<MobEffect> FREEZE = MOB_EFFECT.register("freeze", () -> new FreezeEffect(MobEffectCategory.HARMFUL, 3124687));
    public static void register(IEventBus eventBus){
        MOB_EFFECT.register(eventBus);
    }
}
