package pl.uwm.edu.wmii.po.rpg.Traits;

public class Agility extends IntegerTrait {
    public Agility(Integer value) {
        super(value);
    }

    @Override
    public TraitType getType() {
        return TraitType.AGILITY;
    }
}
