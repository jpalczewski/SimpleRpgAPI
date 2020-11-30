package pl.uwm.edu.wmii.po.rpg.Items.Upgrades;

import pl.uwm.edu.wmii.po.rpg.Exceptions.ImpossibleActionException;

public class UpgradesDiscreteStrategy implements IUpgradeStrategy {
    @Override
    public boolean isUpgradeable(IUpgradeable upgradeable) {
        return upgradeable.isUpgradeable();
    }

    @Override
    public void upgrade(IUpgradeable upgradeable) throws ImpossibleActionException {
        if(upgradeable instanceof  IDiscreteUpgradeable)
            ((IDiscreteUpgradeable) upgradeable).discreteUpgrade();
    }
}
