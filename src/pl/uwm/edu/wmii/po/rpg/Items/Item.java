package pl.uwm.edu.wmii.po.rpg.Items;

import pl.uwm.edu.wmii.po.rpg.Exceptions.ImpossibleActionException;
import pl.uwm.edu.wmii.po.rpg.Items.Upgrades.IUpgradeStrategy;
import pl.uwm.edu.wmii.po.rpg.Items.Upgrades.IUpgradeable;
import pl.uwm.edu.wmii.po.rpg.Items.Upgrades.UpgradesDisabledStrategy;
import pl.uwm.edu.wmii.po.rpg.command.IAttackCommandModifier;

/**
    Abstract class describing most basic item behaviour.
 */
public abstract class Item implements IItem, IUpgradeable, IAttackCommandModifier {
    private String description;
    protected IUpgradeStrategy upgradeStrategy;

    public Item() {
        upgradeStrategy = new UpgradesDisabledStrategy();
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public boolean isUpgradeable() {
        return upgradeStrategy.isUpgradeable(this);
    }

    @Override
    public void upgrade() throws ImpossibleActionException {
        upgradeStrategy.upgrade(this);
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
