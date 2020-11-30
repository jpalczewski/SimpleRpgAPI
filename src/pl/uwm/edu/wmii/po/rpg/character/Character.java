package pl.uwm.edu.wmii.po.rpg.character;

import pl.uwm.edu.wmii.po.rpg.Exceptions.ImpossibleActionException;
import pl.uwm.edu.wmii.po.rpg.Items.IItem;
import pl.uwm.edu.wmii.po.rpg.Items.Item;
import pl.uwm.edu.wmii.po.rpg.Items.Upgrades.IUpgradeStrategy;
import pl.uwm.edu.wmii.po.rpg.Items.Upgrades.IUpgradeable;
import pl.uwm.edu.wmii.po.rpg.Items.Upgrades.UpgradesDiscreteStrategy;
import pl.uwm.edu.wmii.po.rpg.Traits.Health;
import pl.uwm.edu.wmii.po.rpg.Traits.IntegerTraitSet;
import pl.uwm.edu.wmii.po.rpg.command.AttackCommand;

public abstract class Character implements IUpgradeable {
    protected IntegerTraitSet skills;
    protected Health health;
    protected IUpgradeStrategy upgradeStrategy;
    private Item inventorySlot;

    public Character(IntegerTraitSet skills, Health health) {
        this.skills = skills;
        this.health = health;
        this.upgradeStrategy = new UpgradesDiscreteStrategy();
    }

    protected Character() {
        this.upgradeStrategy = new UpgradesDiscreteStrategy();
    }

    public Item getInventorySlot() {
        return inventorySlot;
    }

    public void setInventorySlot(Item inventorySlot) {
        if (this.skills.checkCondition(inventorySlot.getItemRequirements()))
            this.inventorySlot = inventorySlot;
    }

    public abstract AttackCommand attack();


    @Override
    public void upgrade() throws ImpossibleActionException {
        if(upgradeStrategy.isUpgradeable(this))
            upgradeStrategy.upgrade(this);

    }
}
