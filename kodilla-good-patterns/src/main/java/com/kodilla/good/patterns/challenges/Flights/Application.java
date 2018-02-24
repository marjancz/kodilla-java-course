package com.kodilla.good.patterns.challenges.Flights;

public class Application {
    public static void main(String[] args) {

        FlightRequestRetriever flightRequestRetriever = new FlightRequestRetriever();
        FlightRequest result = flightRequestRetriever.retrieve();
        FlightFinderService flightFinderService = new FlightFinderService();
        flightFinderService.processFrom(result);
        System.out.println("\n=============================================\n");
        flightFinderService.processTo(result);
        System.out.println("\n=============================================\n");
        flightFinderService.processVia(result);
    }
}
