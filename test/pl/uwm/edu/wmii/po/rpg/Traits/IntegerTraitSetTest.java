package pl.uwm.edu.wmii.po.rpg.Traits;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pl.uwm.edu.wmii.po.rpg.Items.BetterPencil;
import pl.uwm.edu.wmii.po.rpg.Items.Pencil;

import static org.junit.jupiter.api.Assertions.*;

class IntegerTraitSetTest {
    IntegerTraitSet traitSet;
    IntegerTraitSet betterTraitSet;

    @BeforeEach
    void setUp() {
        traitSet = new IntegerTraitSet();
        betterTraitSet = new IntegerTraitSet();
        var trait1 = new Strength(10);
        var trait2 = new Agility(8);
        traitSet.add(trait1);
        betterTraitSet.add(trait1);
        betterTraitSet.add(trait2);
    }

    @Test
    void getTrait() {
        var check = traitSet.getTrait(TraitType.STRENGTH);
        assertTrue(check.isPresent());
        assertEquals(10,check.get().value );
    }
    @Test
    void testRequirements() {
        var pencil = new Pencil();
        var betterp = new BetterPencil();
        assertTrue(traitSet.checkCondition(pencil.getItemRequirements()));
        assertTrue(betterTraitSet.checkCondition(pencil.getItemRequirements()));
        assertFalse(traitSet.checkCondition(betterp.getItemRequirements()));
        assertTrue(betterTraitSet.checkCondition(betterp.getItemRequirements()));
    }

}