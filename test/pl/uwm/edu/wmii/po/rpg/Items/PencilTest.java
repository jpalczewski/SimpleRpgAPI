package pl.uwm.edu.wmii.po.rpg.Items;

import org.junit.jupiter.api.Test;
import pl.uwm.edu.wmii.po.rpg.Exceptions.ImpossibleActionException;

import static org.junit.jupiter.api.Assertions.*;

class PencilTest {

    @Test
    void upgrade() {
        Pencil p = new Pencil();
        assertThrows(ImpossibleActionException.class, p::upgrade);
    }
}