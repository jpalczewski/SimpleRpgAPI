package pl.uwm.edu.wmii.po.rpg.Items;

import pl.uwm.edu.wmii.po.rpg.Exceptions.ImpossibleActionException;
import pl.uwm.edu.wmii.po.rpg.Items.Upgrades.IUpgradeable;
import pl.uwm.edu.wmii.po.rpg.Items.Upgrades.UpgradesDiscreteStrategy;
import pl.uwm.edu.wmii.po.rpg.Traits.IntegerTraitSet;
import pl.uwm.edu.wmii.po.rpg.Traits.RequirementFactory;
import pl.uwm.edu.wmii.po.rpg.Traits.TraitType;

import java.util.function.Predicate;

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
    public Predicate<IntegerTraitSet> getItemRequirements() {
        return RequirementFactory.createRequirement(TraitType.STRENGTH, 5).and(
                RequirementFactory.createRequirement(TraitType.AGILITY, 2)
        );
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
