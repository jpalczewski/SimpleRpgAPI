package pl.uwm.edu.wmii.po.rpg.command;

public class AttackCommand {
    private float baseValue;

    public AttackCommand(float baseValue) {
        this.baseValue = baseValue;
    }

    public float getBaseValue() {
        return baseValue;
    }

    public void setBaseValue(float baseValue) {
        this.baseValue = baseValue;
    }

    public void multiplyBaseValue(float multiplier) {
        this.baseValue = baseValue*multiplier;
    }
}
