package pl.uwm.edu.wmii.po.rpg.Items.Upgrades;

import pl.uwm.edu.wmii.po.rpg.Exceptions.ImpossibleActionException;

/**
    Example of IUpgradeStrategy where upgrades are disabled and ImpossibleActionException is thrown during a try.
 */
public class UpgradesDisabledStrategy implements IUpgradeStrategy {
    @Override
    public boolean isUpgradeable(IUpgradeable upgradeable) {
        return false;
    }

    /**
    Do nothing, because it impossible to do so.
     * @param upgradeable object which we want to upgrade
     */
    @Override
    public void upgrade(IUpgradeable upgradeable) throws ImpossibleActionException {
        throw new ImpossibleActionException("You can't upgrade this kind of item!");
    }
}
