package pl.uwm.edu.wmii.po.rpg.Traits;

public abstract class Trait<T> implements ITrait {
    private T value;

    public T getValue() {
        return value;
    }

    public Trait(T value) {
        this.value = value;
    }
}
