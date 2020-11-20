package pl.uwm.edu.wmii.po.rpg.Items.Upgrades;

import pl.uwm.edu.wmii.po.rpg.Exceptions.ImpossibleActionException;

/**
 * It's an abstraction of thing/place/person that can be upgraded.
 */
public interface IUpgradeable {

    boolean isUpgradeable();
    void upgrade() throws ImpossibleActionException;
}
