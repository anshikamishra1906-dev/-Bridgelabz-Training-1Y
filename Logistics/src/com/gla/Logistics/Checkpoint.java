package com.gla.Logistics;
abstract class Checkpoint {
    String checkpointId;
    String locationName;
    double distanceFromLast;
    int expectedDuration;
    int actualDuration;

    public Checkpoint(String id, String location, double distance, int expected, int actual) {
        this.checkpointId = id;
        this.locationName = location;
        this.distanceFromLast = distance;
        this.expectedDuration = expected;
        this.actualDuration = actual;
    }

    boolean isDelayed() {
        return actualDuration > expectedDuration;
    }

    protected abstract boolean isCritical();
    protected abstract String getType();
    abstract double calculatePenalty();
}
