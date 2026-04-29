package com.gla.Logistics;
import com.gla.Logistics.Checkpoint;

class RestCheckpoint extends Checkpoint {

    public RestCheckpoint(String id, String loc, double d, int e, int a) {
        super(id, loc, d, e, a);
    }

    protected boolean isCritical() {
        return false;
    }

    protected String getType() {
        return "Rest";
    }

    double calculatePenalty() {
        if (!isDelayed()) return 0;

        int delay = actualDuration - expectedDuration;

        if (delay > 30) {
            return delay * 0.5;
        }

        return 0;
    }
}