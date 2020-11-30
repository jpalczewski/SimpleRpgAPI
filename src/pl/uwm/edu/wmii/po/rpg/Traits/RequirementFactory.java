package pl.uwm.edu.wmii.po.rpg.Traits;

import java.util.function.Predicate;

/*
    Simple
 */
public class RequirementFactory {
    public static Predicate<IntegerTraitSet> createRequirement(TraitType type, Integer value)
    {
        return r -> {
            var trait = r.getTrait(type);
            return trait.filter(integerTrait -> integerTrait.getValue() >= value).isPresent();
        };
    }
}
