package net.silvertide.pmmo_classes.events;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.network.simple.SimpleChannel;
import net.silvertide.pmmo_classes.PMMOClasses;
import net.silvertide.pmmo_skill_books.network.PacketHandler;

import java.lang.reflect.Field;

@Mod.EventBusSubscriber(modid = PMMOClasses.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModBusEvents {

    @SubscribeEvent
    public static void onCommonSetup(FMLCommonSetupEvent event) {
        try {
            // Intenta acceder al channel para ver si ya existe
            Field channelField = PacketHandler.class.getDeclaredField("CHANNEL");
            channelField.setAccessible(true);
            SimpleChannel channel = (SimpleChannel) channelField.get(null);

            if (channel == null) {
                PacketHandler.register();
            }
        } catch (Exception e) {
            PMMOClasses.LOGGER.error("Failed to check packet handler registration", e);
        }
    }
}