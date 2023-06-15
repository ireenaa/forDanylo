package ua.lviv.iot.algo.part1.models;
import static junit.framework.TestCase.assertEquals;
import org.junit.Test;
import ua.lviv.iot.algo.part1.models.Warship;

public class WarshipTest {
    Warship ship = new Warship("Velox", "Tokyo", 350.0, 5000, 574.0, "rocket", "marines", "Nimitz");
    @Test
    public void testGetTotalPeopleCount(){
        assertEquals(0, ship.getTotalPeopleCount());
    }

    @Test
    public void testCalculateLoadTime(){
        ship.toString();
        assertEquals(0,ship.calculateLoadTime());
    }

}

