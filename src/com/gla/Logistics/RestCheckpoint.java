package com.gla.Logistics;

public class RestCheckpoint extends Checkpoint{
    public RestCheckpoint(String checkpointId, String locationName, double distanceFromLast_km, int expectedDuration_min, int actualDuration_min) {
        super(checkpointId, locationName, distanceFromLast_km, expectedDuration_min, actualDuration_min);
    }

    public boolean isCritical() {
        return false;
    }

    public String getType() {
        return "RestCheckpoint";
    }

    public double CalculatePenalty() {
        if (!isDelayed()) return 0;
        int delay = actualDuration_min - expectedDuration_min;
        if(delay > 30) return delay *0.5;

        return 0;
    }
}
