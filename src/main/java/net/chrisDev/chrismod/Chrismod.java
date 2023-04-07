package net.chrisDev.chrismod;

import net.chrisDev.chrismod.item.ModItems;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(Chrismod.MOD_ID)
public class Chrismod
{
    public static  final String MOD_ID="chrismod";

    private static final Logger LOGGER = LogManager.getLogger();
    public Chrismod()
    {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();;

        ModItems.ITEMS.register(eventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }
}
