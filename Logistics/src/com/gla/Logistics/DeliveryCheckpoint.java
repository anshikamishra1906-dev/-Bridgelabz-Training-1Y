package com.gla.Logistics;

class DeliveryCheckpoint extends Checkpoint {

    public DeliveryCheckpoint(String id, String loc, double d, int e, int a) {
        super(id, loc, d, e, a);
    }

    protected boolean isCritical() {
        return true;
    }

    protected String getType() {
        return "Delivery";
    }

    protected double calculatePenalty() {
        if (!isDelayed()) return 0;
        return (actualDuration - expectedDuration) * 2;
    }
}

