package ua.lviv.iot.algo.part1.models;
import org.junit.Test;
import ua.lviv.iot.algo.part1.models.CruiseShip;

import static junit.framework.TestCase.assertEquals;

public class CruiseShipTest {
   CruiseShip ship = new CruiseShip("Titanyk", "Signapore", 250.0, 456.0, 500.0, 3000, 300, 200);

   @Test
   public void testGetTotalPeopleCount(){
      assertEquals(3500, ship.getTotalPeopleCount());
   }

   @Test
   public void testCalculateLoadTime()
   {
      assertEquals(17500, ship.calculateLoadTime());
   }

}