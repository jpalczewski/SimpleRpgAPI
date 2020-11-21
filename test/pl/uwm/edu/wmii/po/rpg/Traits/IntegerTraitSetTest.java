package pl.uwm.edu.wmii.po.rpg.Traits;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntegerTraitSetTest {
    IntegerTraitSet traitSet;

    @BeforeEach
    void setUp() {
        traitSet = new IntegerTraitSet();
        var trait1 = new Strength(5);
        //var trait2 = new Agility(8);
        traitSet.add(trait1);
    }

    @Test
    void getTrait() {
        var check = traitSet.getTrait(TraitType.STRENGTH);
        assertTrue(check.isPresent());
        assertEquals(5,check.get().value );
    }
}