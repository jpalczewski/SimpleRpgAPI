package pl.uwm.edu.wmii.po.rpg.Traits;

/**
 * Example of a trait which will be well described by discrete points.
 */
abstract  public class IntegerTrait extends Trait<Integer>{
    @Override
    public void setValue(Integer value) {
        if (value > maximalValue || value< minimalValue)
            throw new IllegalArgumentException("Wrong trait value");
        super.setValue(value);
    }

    public IntegerTrait(Integer value) {
        setValue(value);
    }

    static Integer minimalValue = 0;
    static Integer maximalValue = 100;

    public static Integer getMinimalValue() {
        return minimalValue;
    }

    public static Integer getMaximalValue() {
        return maximalValue;
    }

}
