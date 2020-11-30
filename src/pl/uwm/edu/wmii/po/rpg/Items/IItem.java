package pl.uwm.edu.wmii.po.rpg.Items;

import pl.uwm.edu.wmii.po.rpg.Exceptions.ImpossibleActionException;
import pl.uwm.edu.wmii.po.rpg.Traits.IntegerTraitSet;

import java.util.function.Predicate;

/*
     Interface which describe possible item actions.
 */
public interface IItem {
     String getDescription();
     Predicate<IntegerTraitSet> getItemRequirements();
}
