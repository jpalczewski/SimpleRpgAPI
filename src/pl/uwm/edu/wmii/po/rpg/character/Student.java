package pl.uwm.edu.wmii.po.rpg.character;

import pl.uwm.edu.wmii.po.rpg.Exceptions.ImpossibleActionException;
import pl.uwm.edu.wmii.po.rpg.Items.Upgrades.IDiscreteUpgradeable;
import pl.uwm.edu.wmii.po.rpg.Items.Upgrades.IUpgradeable;
import pl.uwm.edu.wmii.po.rpg.Traits.*;
import pl.uwm.edu.wmii.po.rpg.command.AttackCommand;

public class Student extends Character implements IDiscreteUpgradeable {

    public Student() {
        health  = new Health(5f,5f);
        health.setMinimalValue(-100f);
        skills = new IntegerTraitSet();
        skills.add(new Strength(6));
        skills.add(new Agility(2));
    }

    @Override
    public AttackCommand attack() {
        AttackCommand ac = new AttackCommand(skills.getTrait(TraitType.STRENGTH).get().getValue());
        if(getInventorySlot() != null)
            return getInventorySlot().parse(ac);
        else
            return ac;
    }

    @Override
    public void discreteUpgrade() {
        skills.upgradeIfExists(TraitType.STRENGTH);
        skills.upgradeIfExists(TraitType.AGILITY);
    }

    @Override
    public boolean isUpgradeable(IUpgradeable upgradeable) {
        return true;
    }

    public void upgrade(IUpgradeable upgradeable) throws ImpossibleActionException {
        upgradeStrategy.upgrade(this);
    }

    @Override
    public boolean isUpgradeable() {
        return true;
    }
}
