package pl.uwm.edu.wmii.po.rpg.Traits;

import java.util.Optional;

public abstract class NumberTrait<N extends  Number> extends  Trait<N> {
    public NumberTrait(N value) {
        super(value);
    }

}
