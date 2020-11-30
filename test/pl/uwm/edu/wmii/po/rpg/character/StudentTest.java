package pl.uwm.edu.wmii.po.rpg.character;

import org.junit.jupiter.api.Test;
import pl.uwm.edu.wmii.po.rpg.Exceptions.ImpossibleActionException;
import pl.uwm.edu.wmii.po.rpg.Items.BetterPencil;
import pl.uwm.edu.wmii.po.rpg.Traits.TraitType;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {



    @Test
    void attack() {
        Student s = new Student();
        var ac = s.attack();
        assertEquals(6, ac.getBaseValue());

    }
    @Test
    void upgrade() throws ImpossibleActionException {
        Student s = new Student();
        s.upgrade();
        assertEquals(7, s.skills.getTrait(TraitType.STRENGTH).get().getValue());
        BetterPencil bp = new BetterPencil();
        s.setInventorySlot(bp);
        var ac = s.attack();
        assertEquals(8.4f, ac.getBaseValue(), 0.01f);
    }


}