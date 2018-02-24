package com.kodilla.good.patterns.challenges.Flights;

import java.util.List;

public class FlightRequestRetriever {

    public FlightRequest retrieve() {
        String flightFrom = "Lodz";
        String flightTo = "Cracow";
        String flightVia = "Warsaw";

        List<Flight> flightList = new DataBaseFlights().getFlightList();
        flightList.toString();

        return new FlightRequest(flightFrom, flightTo, flightVia, flightList);
    }
}
