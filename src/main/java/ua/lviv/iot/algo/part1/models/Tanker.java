package ua.lviv.iot.algo.part1.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import ua.lviv.iot.algo.part1.models.Ship;

@Getter
@Setter
@NoArgsConstructor
@ToString(callSuper = true)
public class Tanker extends Ship {
    private float lengthOfShip;
    private float volume;

    public Tanker(
            final String name,
            final String currentPort,
            final double maxSpeed,
            final double maxCapacity,
            final double currentLoad,
            final float lengthOfShip,
            final float volume) {

        super(name, currentPort, maxSpeed, maxCapacity, currentLoad);
        this.lengthOfShip = lengthOfShip;
        this.volume = volume;
    }

    @Override
    public int getTotalPeopleCount() {
        return 0;
    }

    @Override
    public int calculateLoadTime() {
        return 0;
    }
}
