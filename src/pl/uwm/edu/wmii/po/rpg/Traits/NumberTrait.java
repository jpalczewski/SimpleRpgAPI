package pl.uwm.edu.wmii.po.rpg.Traits;

import java.util.Optional;

public abstract class NumberTrait<N extends  Number & Comparable<N>> extends  Trait<N> {
    protected N maximalValue;
    protected N minimalValue;

    @Override
    public void setValue(N value) {
        if(this.isValid(value))
            super.setValue(value);
        else
            throw  new IllegalArgumentException("Trait value is out of bonds");
    }

    public NumberTrait(N value) {
        super(value);
    }

    /**
     * Checks if value is between limits.
     * @param value
     * @return
     */
    private boolean isValid(N value) {
        return value.compareTo(maximalValue) <= 0 && value.compareTo(minimalValue) >= 0;
    }


    public N getMaximalValue() {
        return maximalValue;
    }

    public void setMaximalValue(N maximalValue) {
        this.maximalValue = maximalValue;
    }

    public N getMinimalValue() {
        return minimalValue;
    }

    public void setMinimalValue(N minimalValue) {
        this.minimalValue = minimalValue;
    }
}
