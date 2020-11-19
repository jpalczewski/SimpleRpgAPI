package pl.uwm.edu.wmii.po.rpg.Items;

import pl.uwm.edu.wmii.po.rpg.Exceptions.ImpossibleActionException;

/**
    Example of strategy design pattern.
 */
public interface IUpgradeStrategy {

    boolean isUpgradeable(Item item);
    void upgrade(Item item) throws ImpossibleActionException;

}
