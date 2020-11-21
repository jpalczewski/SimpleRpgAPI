package pl.uwm.edu.wmii.po.rpg.Traits;

import java.util.Optional;

public class IntegerTraitSet extends TraitSet<Integer> {

    @Override
    public boolean add(Trait<Integer> integerTrait) {
        return super.add(integerTrait);
    }

    public Optional<Trait<Integer>> getTrait(TraitType type) {
        return this.stream()
                .filter(integerTrait -> integerTrait.type == type)
                .findAny();
    }
}
