package pl.uwm.edu.wmii.po.rpg.Items;

import org.junit.jupiter.api.Test;
import pl.uwm.edu.wmii.po.rpg.Exceptions.ImpossibleActionException;

import static org.junit.jupiter.api.Assertions.*;

class BetterPencilTest {

    @Test
    void upgrade() {
        BetterPencil bp = new BetterPencil();
        assertTrue(bp.isUpgradeable());
        try {
            bp.upgrade();
        } catch (ImpossibleActionException e) {
            fail("Something went really wrong");
        }
        assertFalse(bp.isUpgradeable());
        assertThrows(ImpossibleActionException.class,bp::upgrade);

    }
}