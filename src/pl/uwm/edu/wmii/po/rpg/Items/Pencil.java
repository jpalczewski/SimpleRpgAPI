package pl.uwm.edu.wmii.po.rpg.Items;

import pl.uwm.edu.wmii.po.rpg.Traits.IntegerTraitSet;
import pl.uwm.edu.wmii.po.rpg.Traits.RequirementFactory;
import pl.uwm.edu.wmii.po.rpg.Traits.TraitType;
import pl.uwm.edu.wmii.po.rpg.command.AttackCommand;

import java.util.function.Predicate;

public class Pencil extends Item {
    public Pencil() {
        setDescription("Just a plain pencil.");
    }

    @Override
    public Predicate<IntegerTraitSet> getItemRequirements() {
        return RequirementFactory.createRequirement(TraitType.STRENGTH, 5);
    }

    @Override
    public AttackCommand parse(AttackCommand attackCommand) {
        return attackCommand;
    }
}
