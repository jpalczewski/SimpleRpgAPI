package pl.uwm.edu.wmii.po.rpg.Traits;

public class Strength extends IntegerTrait {
    public Strength(Integer value) {
        super(value);

    }

    @Override
    public TraitType getType() {
        return TraitType.STRENGTH;
    }

}
