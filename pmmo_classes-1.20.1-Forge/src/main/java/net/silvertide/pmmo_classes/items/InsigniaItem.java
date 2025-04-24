package net.silvertide.pmmo_classes.items;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.silvertide.pmmo_skill_books.items.components.SkillGrantData;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class InsigniaItem extends Item {
    private final SkillGrantData skillGrantData;

    public InsigniaItem(Properties properties, SkillGrantData skillGrantData) {
        super(properties);
        this.skillGrantData = skillGrantData;
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level,
                                List<Component> tooltip, TooltipFlag flag) {
        // Añadir tooltip con información de la insignia
        tooltip.add(Component.translatable("tooltip.pmmo_classes.insignia.class",
                Component.translatable("class.pmmo_classes." + skillGrantData.skills().get(0))));
        tooltip.add(Component.translatable("tooltip.pmmo_classes.insignia.rank",
                Component.translatable("rank.pmmo_classes." + skillGrantData.rank())));
    }

    public SkillGrantData getSkillGrantData() {
        return skillGrantData;
    }
}