package pl.uwm.edu.wmii.po.rpg.Items;

import pl.uwm.edu.wmii.po.rpg.Exceptions.ImpossibleActionException;
import pl.uwm.edu.wmii.po.rpg.Items.Upgrades.IUpgradeable;
import pl.uwm.edu.wmii.po.rpg.Items.Upgrades.UpgradesDiscreteStrategy;

/**
 *  Example of a object where upgrades are allowed and supported.
 */
public class BetterPencil extends Item implements IUpgradeable {
    private boolean isUpgraded;

    public BetterPencil() {
        isUpgraded = false;
        this.upgradeStrategy = new UpgradesDiscreteStrategy();
    }

    @Override
    public String getDescription() {
        return "just a pencil";
    }

    @Override
    public boolean isUpgradeable() {
        return !isUpgraded;
    }

    @Override
    public void upgrade() throws ImpossibleActionException {
        if(isUpgradeable())
        {
            isUpgraded = true;
            return;
        }
        throw  new ImpossibleActionException("You have upgraded this pencil once!");
    }
}
