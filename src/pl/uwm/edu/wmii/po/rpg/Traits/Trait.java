package pl.uwm.edu.wmii.po.rpg.Traits;

import java.util.Objects;

public abstract class Trait<T> implements ITrait {
    protected T value;
    protected TraitType type;

    protected Trait() {
    }

    public T getValue() {
        return value;
    }
    public void setValue(T value) {
        this.value = value;
    }
    public Trait(T value) {
        this.value = value;
    }

    public String getName() {
        return getType().toString();
    }

    public String getDescription() {
        return getType().getDescription();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Trait)) return false;
        Trait<?> trait = (Trait<?>) o;
        return getValue().equals(trait.getValue()) &&
                getType() == trait.getType();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getValue(), getType());
    }
}
