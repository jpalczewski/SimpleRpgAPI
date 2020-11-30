package pl.uwm.edu.wmii.po.rpg.Traits;

import java.util.Optional;
import java.util.function.Predicate;

public class IntegerTraitSet extends TraitSet<Integer> {

    @Override
    public boolean add(Trait<Integer> integerTrait) {
        return super.add(integerTrait);
    }

    public Optional<Trait<Integer>> getTrait(TraitType type) {
        return this.stream()
                .filter(integerTrait -> integerTrait.getType() == type)
                .findAny();
    }
    /**
     * Tests set given any conditions(f.e. provided by an item)
     */
    public boolean checkCondition(Predicate<IntegerTraitSet> predicate) {
        return predicate.test(this);
    }
    public void upgradeIfExists(TraitType type) {
        getTrait(type).ifPresent(integerTrait -> ((IntegerTrait) integerTrait).incrementValue());
    }
}
