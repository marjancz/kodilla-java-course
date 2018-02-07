package com.kodilla.exception.test;

public class RouteRunner {
    public static void main(String[] args) {
        Flight flight = new Flight("Warsaw Airport", "Athens Airport");
        RouteFinder routeFinder = new RouteFinder();

        try {
            routeFinder.findFlight(flight);
        } catch (RouteNotFoundException e) {
            System.out.println("\nThere's no " + flight.toString());
        } finally {
            System.out.println("\nEnd of searching flights.");
        }
    }
}
