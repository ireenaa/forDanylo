package ua.lviv.iot.algo.part1.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.stream.Stream;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@ToString
public abstract class Ship {
    private static final double ID = 10.4;

    private String name;

    private String currentPort;

    private double maxSpeed;

    private double maxCapacity;

    private double currentLoad;
    public static final String HEADER = "currentPort,currentLoad,name,maxCapacity,maxSpeed";

    public abstract int getTotalPeopleCount();

    public abstract int calculateLoadTime();

    public String getHeader() {
        return HEADER+"\n";
    }

    public String toCSV() {
        return this.currentPort + "," + this.currentLoad + "," + this.name + "," + this.maxCapacity + "," + this.maxSpeed + "\n";
    }
}

