package pl.uwm.edu.wmii.po.rpg.Traits;

public class Health  extends FloatTrait{


    public Health(Float value, Float maximalValue) {
        super(value);
        setMaximalValue(maximalValue);
    }

    @Override
    public TraitType getType() {
        return TraitType.HEALTH;
    }
}
