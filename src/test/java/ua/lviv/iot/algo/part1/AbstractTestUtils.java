package ua.lviv.iot.algo.part1;

import ua.lviv.iot.algo.part1.models.*;

import java.util.ArrayList;
import java.util.List;

public class AbstractTestUtils {

    public static List<Ship> getTestShips() {
        List<Ship> ships = new ArrayList<Ship>();
        ships.add(new Warship("Irenia", "Odessa", 250.0, 4500.0, 650.0, "artillery", "aviation", "Nimitz"));
        ships.add(new Warship("Velox", "Tokyo", 350.0, 5000, 574.0, "rocket", "marines", "Nimitz"));
        ships.add(new Tanker("Knock Nevis", "LA", 325.0, 800.0, 670.0, 450.0f, 1200.0f));
        ships.add(new Tanker("Nina", "LA", 470.0, 674.0, 580.0, 560.0f, 765.0f));
        ships.add(new CargoShip("Joseph", "LA", 530.0, 1000.0, 800.0, 750, "cars"));
        ships.add(new CargoShip("Shelters", "Busan", 570.0, 487.0, 549.0, 600, "tractors"));
        ships.add(new CruiseShip("Titanyk", "Signapore", 250.0, 456.0, 500.0, 3000, 300, 200));
        ships.add(new CruiseShip("Alaska", "Ambarli", 300.0, 475.0, 670.0, 1500, 150, 80));
        return ships;
    }
}
