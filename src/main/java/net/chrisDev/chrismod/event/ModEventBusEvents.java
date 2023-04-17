package net.chrisDev.chrismod.event;

import net.chrisDev.chrismod.Chrismod;
import net.chrisDev.chrismod.event.loot.CoalCokeFromCreeperAdditionModifier;
import net.chrisDev.chrismod.event.loot.CucumberSeedsFromGrassAdditionModifier;
import net.chrisDev.chrismod.event.loot.DowsingRodInIglooAdditionModifier;
import net.minecraftforge.fml.common.Mod;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import javax.annotation.Nonnull;

@Mod.EventBusSubscriber(modid = Chrismod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void registerModifierSerializers(@Nonnull final RegistryEvent.Register<GlobalLootModifierSerializer<?>>
                                                           event) {
        event.getRegistry().registerAll(
                new CucumberSeedsFromGrassAdditionModifier.Serializer().setRegistryName(new ResourceLocation(Chrismod.MOD_ID,"cucumber_seeds_from_grass")),
                new DowsingRodInIglooAdditionModifier.Serializer().setRegistryName(new ResourceLocation(Chrismod.MOD_ID,"dowsing_rod_in_igloo")),
                new CoalCokeFromCreeperAdditionModifier.Serializer().setRegistryName(new ResourceLocation(Chrismod.MOD_ID,"coal_coke_from_creeper"))
        );
    }
}
