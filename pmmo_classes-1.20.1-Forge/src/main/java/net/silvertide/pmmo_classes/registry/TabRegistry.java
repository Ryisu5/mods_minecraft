package net.silvertide.pmmo_classes.registry;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.silvertide.pmmo_classes.PMMOClasses;
import net.silvertide.pmmo_classes.data.ClassGroup;
import net.silvertide.pmmo_classes.data.PrimaryClassSkill;
import net.silvertide.pmmo_classes.utils.ClassUtil;

import java.util.List;

public class TabRegistry {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, PMMOClasses.MOD_ID);

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

    public static final RegistryObject<CreativeModeTab> MOD_TAB = CREATIVE_MODE_TABS.register("pmmo_class_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ItemRegistry.CLASS_GRANT.get()))
                    .title(Component.translatable("creative_tab.pmmo_classes.classes"))
                    .displayItems((displayParameters, output) -> {
                        // Mostrar todas las insignias registradas
                        output.accept(ItemRegistry.IRON_WARRIOR_INSIGNIA.get());
                        output.accept(ItemRegistry.GOLD_WARRIOR_INSIGNIA.get());
                        output.accept(ItemRegistry.EMERALD_WARRIOR_INSIGNIA.get());
                        output.accept(ItemRegistry.DIAMOND_WARRIOR_INSIGNIA.get());

                        output.accept(ItemRegistry.IRON_PRIEST_INSIGNIA.get());
                        output.accept(ItemRegistry.GOLD_PRIEST_INSIGNIA.get());
                        output.accept(ItemRegistry.EMERALD_PRIEST_INSIGNIA.get());
                        output.accept(ItemRegistry.DIAMOND_PRIEST_INSIGNIA.get());

                        output.accept(ItemRegistry.IRON_MAGE_INSIGNIA.get());
                        output.accept(ItemRegistry.GOLD_MAGE_INSIGNIA.get());
                        output.accept(ItemRegistry.EMERALD_MAGE_INSIGNIA.get());
                        output.accept(ItemRegistry.DIAMOND_MAGE_INSIGNIA.get());

                        output.accept(ItemRegistry.IRON_EXPERT_INSIGNIA.get());
                        output.accept(ItemRegistry.GOLD_EXPERT_INSIGNIA.get());
                        output.accept(ItemRegistry.EMERALD_EXPERT_INSIGNIA.get());
                        output.accept(ItemRegistry.DIAMOND_EXPERT_INSIGNIA.get());

                        output.accept(ItemRegistry.PLAIN_ARTIFICER_INSIGNIA.get());
                        output.accept(ItemRegistry.PLAIN_BARBARIAN_INSIGNIA.get());
                        output.accept(ItemRegistry.PLAIN_BARD_INSIGNIA.get());
                        output.accept(ItemRegistry.PLAIN_CLERIC_INSIGNIA.get());
                        output.accept(ItemRegistry.PLAIN_DRUID_INSIGNIA.get());
                        output.accept(ItemRegistry.PLAIN_FIGHTER_INSIGNIA.get());
                        output.accept(ItemRegistry.PLAIN_MONK_INSIGNIA.get());
                        output.accept(ItemRegistry.PLAIN_PALADIN_INSIGNIA.get());
                        output.accept(ItemRegistry.PLAIN_RANGER_INSIGNIA.get());
                        output.accept(ItemRegistry.PLAIN_ROGUE_INSIGNIA.get());
                        output.accept(ItemRegistry.PLAIN_SORCERER_INSIGNIA.get());
                        output.accept(ItemRegistry.PLAIN_WARLOCK_INSIGNIA.get());
                        output.accept(ItemRegistry.PLAIN_WIZARD_INSIGNIA.get());


                        // ... Mostrar todas las demás subclases
                    })
                    .withTabsBefore(CreativeModeTabs.SPAWN_EGGS)
                    .build());
}