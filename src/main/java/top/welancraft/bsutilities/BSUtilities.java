package top.welancraft.bsutilities;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.world.ExplosionEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod(BSUtilities.MODID)
public class BSUtilities {
    public static final String MODID = "bsutilities";

    public BSUtilities() {
        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public void preExplosion(ExplosionEvent.Start e) {
        e.setCanceled(true);
    }
}
