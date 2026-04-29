package com.gla.Logistics;

class FuelCheckpoint extends Checkpoint {

    public FuelCheckpoint(String id, String loc, double d, int e, int a) {
        super(id, loc, d, e, a);
    }

    protected boolean isCritical() {
        return true;
    }

    protected String getType() {
        return "Fuel";
    }

    protected double calculatePenalty() {
        return isDelayed() ? 10 : 0;
    }
}