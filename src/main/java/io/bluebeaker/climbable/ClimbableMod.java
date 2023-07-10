package io.bluebeaker.climbable;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file

@Mod(modid = ClimbableMod.MODID, name = ClimbableMod.NAME, version = ClimbableMod.VERSION)
public class ClimbableMod
{
    public static final String MODID = "climbable";
    public static final String NAME = "Climbable";
    public static final String VERSION = "1.0";

    private static Logger logger;

    public ClimbableMod() {
        MinecraftForge.EVENT_BUS.register(this);
    }
}
