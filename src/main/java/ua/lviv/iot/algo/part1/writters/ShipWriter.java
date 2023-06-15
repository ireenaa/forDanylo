package ua.lviv.iot.algo.part1.writters;

import ua.lviv.iot.algo.part1.models.Ship;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ShipWriter {
    public static void writeToFile(List<Ship> shipList) {
        boolean isHeaderNotPresent = true;
        try(FileWriter file = new FileWriter("src/main/resources/result.csv")) {
            for (Ship ship : shipList) {
                if (isHeaderNotPresent) {
                    file.write(ship.getHeader());
                    isHeaderNotPresent = false;
                }
                file.write(ship.toCSV());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
