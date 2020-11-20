package pl.uwm.edu.wmii.po.rpg.Items.Upgrades;

import pl.uwm.edu.wmii.po.rpg.Exceptions.ImpossibleActionException;

/**
    Example of strategy design pattern.
 */
public interface IUpgradeStrategy {

    boolean isUpgradeable(IUpgradeable upgradeable);
    void upgrade(IUpgradeable upgradeable) throws ImpossibleActionException;

}
