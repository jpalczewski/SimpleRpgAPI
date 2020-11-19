package pl.uwm.edu.wmii.po.rpg.Items;

import pl.uwm.edu.wmii.po.rpg.Exceptions.ImpossibleActionException;
/*
     Interface which describe possible item actions.
 */
public interface IItem {
     String getDescription();
     boolean isUpgradeable();
     void upgrade() throws ImpossibleActionException;
}
