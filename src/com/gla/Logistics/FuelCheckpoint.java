package com.gla.Logistics;

public class FuelCheckpoint extends Checkpoint{
    public FuelCheckpoint(String checkpointId, String locationName, double distanceFromLast_km, int expectedDuration_min, int actualDuration_min) {
        super(checkpointId, locationName, distanceFromLast_km, expectedDuration_min, actualDuration_min);
    }

    public boolean isCritical() {
        return true;
    }

    public String getType() {
        return "FuelCheckpoint";
    }

    @Override
    public double CalculatePenalty() {
        return isDelayed() ? 10 : 0;
    }
}
