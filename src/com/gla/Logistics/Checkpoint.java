package com.gla.Logistics;

public abstract class Checkpoint {
    String checkpointId;
    String locationName;
    double distanceFromLast_km;
    int expectedDuration_min;
    int actualDuration_min;

    public Checkpoint(String checkpointId,String locationName,double distanceFromLast_km,int expectedDuration_min,int actualDuration_min){
        this.checkpointId = checkpointId;
        this.locationName = locationName;
        this.distanceFromLast_km = distanceFromLast_km;
        this.expectedDuration_min = expectedDuration_min;
        this.actualDuration_min = actualDuration_min;
    }
    public boolean isDelayed(){
        return actualDuration_min > expectedDuration_min;
    }
    public abstract boolean isCritical();
    public abstract String getType();
    public abstract double CalculatePenalty();

}
