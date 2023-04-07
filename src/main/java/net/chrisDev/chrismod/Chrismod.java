package net.chrisDev.chrismod;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

@Mod(Chrismod.MOD_ID)
public class Chrismod
{
    public static  final String MOD_ID="chrismod";
    public Chrismod()
    {


        MinecraftForge.EVENT_BUS.register(this);
    }
}
