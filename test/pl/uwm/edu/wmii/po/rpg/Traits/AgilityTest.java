package pl.uwm.edu.wmii.po.rpg.Traits;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AgilityTest {
    private Agility trait1;

    @BeforeEach
    void setUp() {
        trait1 = new Agility(5);
    }

    @Test
    void setValue() {
        assertEquals(5, trait1.getValue());
        assertEquals(TraitType.AGILITY,  trait1.getType());
        trait1.setValue(52);
        assertEquals(52, trait1.getValue());
        assertThrows(IllegalArgumentException.class, () -> trait1.setValue(412));
    }
}