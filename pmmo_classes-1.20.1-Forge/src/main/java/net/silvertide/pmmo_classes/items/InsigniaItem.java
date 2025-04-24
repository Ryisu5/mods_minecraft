package net.silvertide.pmmo_classes.items;

import net.minecraft.world.item.Item;
import net.silvertide.pmmo_skill_books.items.components.SkillGrantData;
import net.silvertide.pmmo_skill_books.utils.SkillGrantUtil;

public class InsigniaItem extends Item {
    private final SkillGrantData skillGrantData;

    public InsigniaItem(Properties properties, SkillGrantData skillGrantData) {
        super(properties);
        this.skillGrantData = skillGrantData;
    }

    public SkillGrantData getSkillGrantData() {
        return skillGrantData;
    }
}