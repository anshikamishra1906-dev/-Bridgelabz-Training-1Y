package com.gla.Logistics;
public class DeliveryCheckpoint extends Checkpoint {
    public DeliveryCheckpoint(String checkpointId,String locationName,double distanceFromLast_km,int expectedDuration_min,int actualDuration_min) {
        super(checkpointId,locationName,distanceFromLast_km,expectedDuration_min,actualDuration_min);
    }
    public boolean isCritical() {
        return true;
    }

    public String getType() {
        return "DeliveryCheckpoint";
    }

    public double CalculatePenalty() {
        if(!isDelayed()) return 0;
        return (actualDuration_min -expectedDuration_min )*2;
    }
}

