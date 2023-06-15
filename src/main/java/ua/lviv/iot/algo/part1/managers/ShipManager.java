package ua.lviv.iot.algo.part1.managers;
import ua.lviv.iot.algo.part1.models.Ship;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
public class ShipManager {
    private final List<Ship> shipList = new LinkedList<Ship>();

    public void addShip(Ship ship) {
        this.shipList.add(ship);
    }

    public List<Ship> getShipWithMaxSpeedThan(double choosenSpeed){
        return shipList.stream().
                filter(ship -> ship.getMaxSpeed() > choosenSpeed).
                collect(Collectors.toList());
    }

    public List<Ship> getShipWichAcommodateMoreThan(double choosenCapacity){
        return shipList.stream().
                filter(ship -> ship.getMaxCapacity() > choosenCapacity).
                collect(Collectors.toList());
    }

    public void addShips(List<Ship> ships) {
        this.shipList.addAll(ships);
    }
}
