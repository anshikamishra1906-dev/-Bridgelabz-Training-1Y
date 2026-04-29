package com.gla.Logistics;
import com.gla.Logistics.Checkpoint;

public class Main {
    public static void main(String[] args) {

        Driver driver = new Driver("D2606", "Deeksha");

        driver.routeHistory.addCheckpoint(
                new DeliveryCheckpoint("CP1", "Mill A", 40, 60, 70));

        driver.routeHistory.addCheckpoint(
                new FuelCheckpoint("CP2", "Pump 12", 20, 30, 30));

        driver.routeHistory.addCheckpoint(
                new RestCheckpoint("CP3", "Hotel X", 10, 20, 35));

        driver.routeHistory.addCheckpoint(
                new DeliveryCheckpoint("CP4", "Restraint", 50, 80, 95));

        driver.printSummary();
    }
}