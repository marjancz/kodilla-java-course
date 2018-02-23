package com.kodilla.good.patterns.challenges.Flights;

import java.util.List;

public class FlightRequestRetriever {

    public FlightRequest retrieve() {
        String flight = "Lodz";
        List<Flight> flightList = new DataBaseFlights().getFlightList();
        DataBaseFlights dataBaseFlights = new DataBaseFlights();


        return new FlightRequest(flight, flightList);
    }
}
