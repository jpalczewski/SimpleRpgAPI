package pl.uwm.edu.wmii.po.rpg.Traits;

public enum TraitType {
    STRENGTH("Strength", "That which does not kill us makes us stronger."),
    AGILITY("Agility", "Agility within and of itself is a strategy."),
    HEALTH("Health", "Generic health description.");
    private final String name;
    private final String description;

    TraitType(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public String toString() {
        return this.name;
    }

    public String getDescription() {
        return description;
    }
}

