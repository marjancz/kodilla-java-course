package com.kodilla.good.patterns.challenges.Flights;

import java.util.List;

public class FlightRequestRetriever {

    public FlightRequest retrieve() {
        String flightFrom = "Cracow";
        String flightTo = "Gdansk";

        List<Flight> flightList = new DataBaseFlights().getFlightList();

        return new FlightRequest(flightFrom, flightTo, flightList);
    }
}
