package pl.uwm.edu.wmii.po.rpg.Traits;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StrengthTest {

    @Test
    void getValue() {
        Strength s = new Strength(5);
        assertEquals(5, s.getValue());
    }
}