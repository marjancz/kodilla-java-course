package com.kodilla.good.patterns.challenges.Flights;

public class Application {
    public static void main(String[] args) {

        FlightRequestRetriever flightRequestRetriever = new FlightRequestRetriever();
        FlightFinderService flightFinderService = new FlightFinderService();
        FlightRequest result = flightRequestRetriever.retrieve();
        flightFinderService.processFrom(result);
    }
}
