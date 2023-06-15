package ua.lviv.iot.algo.part1.managers;

import junit.framework.TestCase;
import org.junit.Test;
import ua.lviv.iot.algo.part1.AbstractTestUtils;
import ua.lviv.iot.algo.part1.models.*;

import java.util.List;

public class ShipManagerTest extends TestCase {
    ShipManager shipManager = new ShipManager();

    @Test
    public void testGetWithSpeedHigherThan() {
        shipManager.addShips(AbstractTestUtils.getTestShips());
        List<Ship> result = shipManager.getShipWithMaxSpeedThan(400.0);
        assertEquals(3, result.size());

        for (Ship ship : result) {
            assertTrue(ship.getMaxSpeed() >= 400);
        }

    }

    @Test
    public void testGetWithSpeedHigherThanReturnsAll() {
        shipManager.addShips(AbstractTestUtils.getTestShips());
        assertEquals(8, shipManager.getShipWithMaxSpeedThan(200.0).size());
    }

    @Test
    public void testGetWithSpeedHigherThanReturnsNothing() {
        shipManager.addShips(AbstractTestUtils.getTestShips());
        assertEquals(0, shipManager.getShipWithMaxSpeedThan(20000.0).size());
    }

    @Test
    public void testGetShipWichAcommodateMoreThan() {
        shipManager.addShips(AbstractTestUtils.getTestShips());
        assertEquals(5, shipManager.getShipWichAcommodateMoreThan(500.0).size());
    }

    @Test
    public void testGetEmptyListOfSipsWithCapacity() {
        shipManager.addShips(AbstractTestUtils.getTestShips());
        List<Ship> result = shipManager.getShipWichAcommodateMoreThan(5.0);
        assertEquals(AbstractTestUtils.getTestShips().size(), result.size());

        for (Ship ship : result) {
            assertTrue(ship.getMaxCapacity() > 5);
        }
    }

    @Test
    public void testAddShip() {
        assertEquals(8, AbstractTestUtils.getTestShips().size());
    }

}