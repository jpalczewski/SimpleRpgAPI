package pl.uwm.edu.wmii.po.rpg.Traits;

public class Strength extends Trait<Integer> {
    public Strength(Integer value) {
        super(value);
    }

    @Override
    public String getName() {
        return "Strength";
    }

    @Override
    public String getDescription() {
        return "That which does not kill us makes us stronger.";
    }
}
