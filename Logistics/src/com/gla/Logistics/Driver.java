package com.gla.Logistics;
class Driver {
    String driverId;
    String name;
    RouteLinkedList<Checkpoint> routeHistory;

    Driver(String id, String name) {
        this.driverId = id;
        this.name = name;
        this.routeHistory = new RouteLinkedList<>();
    }

    void printSummary() {
        System.out.println("Driver: " + driverId + " – " + name);

        routeHistory.printRoute();

        double distance = routeHistory.computeTotalDistance();
        double penalty = routeHistory.computeTotalPenalty();
        double score = distance - penalty;

        System.out.println("Total Distance: " + distance);
        System.out.println("Total Penalty: " + penalty);
        System.out.println("Route Score: " + score);

        System.out.println("Critical Route Check: " +
                (routeHistory.checkCritical()
                        ? "All required checkpoints present"
                        : "Missing critical checkpoints"));
    }
}