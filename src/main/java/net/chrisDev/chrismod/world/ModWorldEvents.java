package net.chrisDev.chrismod.world;

import net.chrisDev.chrismod.Chrismod;
import net.chrisDev.chrismod.world.gen.ModFlowerGeneration;
import net.chrisDev.chrismod.world.gen.ModOreGeneration;
import net.chrisDev.chrismod.world.gen.ModTreeGeneration;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Chrismod.MOD_ID)
public class ModWorldEvents {
    @SubscribeEvent
    public static void biomeLoadingEvent(final BiomeLoadingEvent event){
        ModOreGeneration.generateOres(event);
        ModTreeGeneration.generateTrees(event);
        ModFlowerGeneration.generateFlower(event);
    }
}
