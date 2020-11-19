package pl.uwm.edu.wmii.po.rpg.Items;

import pl.uwm.edu.wmii.po.rpg.Exceptions.ImpossibleActionException;
/**
    Example of IUpgradeStrategy where upgrades are disabled and ImpossibleActionException is thrown during a try.
 */
public class UpgradesDisabledStrategy implements IUpgradeStrategy {
    @Override
    public boolean isUpgradeable(Item item) {
        return false;
    }

    /**
    Do nothing, because it impossible to do so.
     */
    @Override
    public void upgrade(Item item) throws ImpossibleActionException {
        throw new ImpossibleActionException("You can't upgrade this kind of item!");
    }
}
