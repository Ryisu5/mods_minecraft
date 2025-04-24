package net.silvertide.pmmo_classes.registry;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.silvertide.pmmo_classes.PMMOClasses;
import net.silvertide.pmmo_classes.data.ClassGroup;
import net.silvertide.pmmo_classes.data.PrimaryClassSkill;
import net.silvertide.pmmo_classes.items.ClassGrantItem;
import net.silvertide.pmmo_classes.items.InsigniaItem;
import net.silvertide.pmmo_classes.utils.ClassUtil;
import net.silvertide.pmmo_skill_books.items.components.SkillGrantData;

import java.util.List;

public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, PMMOClasses.MOD_ID);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    public static final RegistryObject<Item> CLASS_GRANT = ITEMS.register("class_grant", ClassGrantItem::new);

    // Metodo helper para registrar insignias
    private static RegistryObject<Item> registerInsignia(String name, List<String> skills, String applicationType,
                                                         Long value, int experienceCost, String rank, String color) {
        SkillGrantData skillGrantData = new SkillGrantData(
                "pmmo_classes.insignia." + rank + "." + name.split("_")[1], // pmmo_classes.insignia.iron.warrior
                skills,
                applicationType,
                value,
                experienceCost,
                "insignia",
                rank,
                color
        );

        return ITEMS.register(name + "_insignia", () -> new InsigniaItem(
                new Item.Properties().stacksTo(1),
                skillGrantData
        ));
    }

    // Registro de todas las insignias
    // Clases principales
    public static final RegistryObject<Item> IRON_WARRIOR_INSIGNIA = registerInsignia(
            "warrior", ClassUtil.getPrimaryClassSkills(ClassGroup.WARRIOR), "set", 1L, 20, "iron", "red");
    public static final RegistryObject<Item> GOLD_WARRIOR_INSIGNIA = registerInsignia(
            "warrior", ClassUtil.getPrimaryClassSkills(ClassGroup.WARRIOR), "set", 2L, 25, "gold", "red");
    public static final RegistryObject<Item> EMERALD_WARRIOR_INSIGNIA = registerInsignia(
            "warrior", ClassUtil.getPrimaryClassSkills(ClassGroup.WARRIOR), "set", 3L, 30, "emerald", "red");
    public static final RegistryObject<Item> DIAMOND_WARRIOR_INSIGNIA = registerInsignia(
            "warrior", ClassUtil.getPrimaryClassSkills(ClassGroup.WARRIOR), "set", 4L, 40, "diamond", "red");

    public static final RegistryObject<Item> IRON_PRIEST_INSIGNIA = registerInsignia(
            "priest", ClassUtil.getPrimaryClassSkills(ClassGroup.PRIEST), "set", 1L, 20, "iron", "white");
    public static final RegistryObject<Item> GOLD_PRIEST_INSIGNIA = registerInsignia(
            "priest", ClassUtil.getPrimaryClassSkills(ClassGroup.PRIEST), "set", 2L, 25, "gold", "white");
    public static final RegistryObject<Item> EMERALD_PRIEST_INSIGNIA = registerInsignia(
            "priest", ClassUtil.getPrimaryClassSkills(ClassGroup.PRIEST), "set", 3L, 30, "emerald", "white");
    public static final RegistryObject<Item> DIAMOND_PRIEST_INSIGNIA = registerInsignia(
            "priest", ClassUtil.getPrimaryClassSkills(ClassGroup.PRIEST), "set", 4L, 40, "diamond", "white");

    public static final RegistryObject<Item> IRON_MAGE_INSIGNIA = registerInsignia(
            "mage", ClassUtil.getPrimaryClassSkills(ClassGroup.MAGE), "set", 1L, 20, "iron", "purple");
    public static final RegistryObject<Item> GOLD_MAGE_INSIGNIA = registerInsignia(
            "mage", ClassUtil.getPrimaryClassSkills(ClassGroup.MAGE), "set", 2L, 25, "gold", "purple");
    public static final RegistryObject<Item> EMERALD_MAGE_INSIGNIA = registerInsignia(
            "mage", ClassUtil.getPrimaryClassSkills(ClassGroup.MAGE), "set", 3L, 30, "emerald", "purple");
    public static final RegistryObject<Item> DIAMOND_MAGE_INSIGNIA = registerInsignia(
            "mage", ClassUtil.getPrimaryClassSkills(ClassGroup.MAGE), "set", 4L, 40, "diamond", "purple");

    public static final RegistryObject<Item> IRON_EXPERT_INSIGNIA = registerInsignia(
            "expert", ClassUtil.getPrimaryClassSkills(ClassGroup.EXPERT), "set", 1L, 20, "iron", "teal");
    public static final RegistryObject<Item> GOLD_EXPERT_INSIGNIA = registerInsignia(
            "expert", ClassUtil.getPrimaryClassSkills(ClassGroup.EXPERT), "set", 2L, 25, "gold", "teal");
    public static final RegistryObject<Item> EMERALD_EXPERT_INSIGNIA = registerInsignia(
            "expert", ClassUtil.getPrimaryClassSkills(ClassGroup.EXPERT), "set", 3L, 30, "emerald", "teal");
    public static final RegistryObject<Item> DIAMOND_EXPERT_INSIGNIA = registerInsignia(
            "expert", ClassUtil.getPrimaryClassSkills(ClassGroup.EXPERT), "set", 4L, 40, "diamond", "teal");



    // Subclases
    public static final RegistryObject<Item> PLAIN_ARTIFICER_INSIGNIA = registerInsignia(
            "artificer", ClassUtil.getSubClassSkills(PrimaryClassSkill.ARTIFICER), "set", 1L, 30, "plain", "teal");
    public static final RegistryObject<Item> PLAIN_BARBARIAN_INSIGNIA = registerInsignia(
            "barbarian", ClassUtil.getSubClassSkills(PrimaryClassSkill.BARBARIAN), "set", 1L, 30, "plain", "orange");
    public static final RegistryObject<Item> PLAIN_BARD_INSIGNIA = registerInsignia(
            "bard", ClassUtil.getSubClassSkills(PrimaryClassSkill.BARD), "set", 1L, 30, "plain", "light_purple");
    public static final RegistryObject<Item> PLAIN_CLERIC_INSIGNIA = registerInsignia(
            "cleric", ClassUtil.getSubClassSkills(PrimaryClassSkill.CLERIC), "set", 1L, 30, "plain", "white");
    public static final RegistryObject<Item> PLAIN_DRUID_INSIGNIA = registerInsignia(
            "druid", ClassUtil.getSubClassSkills(PrimaryClassSkill.DRUID), "set", 1L, 30, "plain", "green");
    public static final RegistryObject<Item> PLAIN_FIGHTER_INSIGNIA = registerInsignia(
            "fighter", ClassUtil.getSubClassSkills(PrimaryClassSkill.FIGHTER), "set", 1L, 30, "plain", "red");
    public static final RegistryObject<Item> PLAIN_MONK_INSIGNIA = registerInsignia(
            "monk", ClassUtil.getSubClassSkills(PrimaryClassSkill.MONK), "set", 1L, 30, "plain", "blue");
    public static final RegistryObject<Item> PLAIN_PALADIN_INSIGNIA = registerInsignia(
            "paladin", ClassUtil.getSubClassSkills(PrimaryClassSkill.PALADIN), "set", 1L, 30, "plain", "yellow");
    public static final RegistryObject<Item> PLAIN_RANGER_INSIGNIA = registerInsignia(
            "ranger", ClassUtil.getSubClassSkills(PrimaryClassSkill.RANGER), "set", 1L, 30, "plain", "light_green");
    public static final RegistryObject<Item> PLAIN_ROGUE_INSIGNIA = registerInsignia(
            "rogue", ClassUtil.getSubClassSkills(PrimaryClassSkill.ROGUE), "set", 1L, 30, "plain", "black");
    public static final RegistryObject<Item> PLAIN_SORCERER_INSIGNIA = registerInsignia(
            "sorcerer", ClassUtil.getSubClassSkills(PrimaryClassSkill.SORCERER), "set", 1L, 30, "plain", "pink");
    public static final RegistryObject<Item> PLAIN_WARLOCK_INSIGNIA = registerInsignia(
            "warlock", ClassUtil.getSubClassSkills(PrimaryClassSkill.WARLOCK), "set", 1L, 30, "plain", "purple");
    public static final RegistryObject<Item> PLAIN_WIZARD_INSIGNIA = registerInsignia(
            "wizard", ClassUtil.getSubClassSkills(PrimaryClassSkill.WIZARD), "set", 1L, 30, "plain", "light_blue");


}