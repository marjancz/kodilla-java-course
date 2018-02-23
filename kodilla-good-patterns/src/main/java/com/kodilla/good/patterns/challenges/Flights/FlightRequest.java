package com.kodilla.good.patterns.challenges.Flights;

import java.util.List;

public class FlightRequest {
    private final String flight;
    List<Flight> flightList;

    public FlightRequest(final String flight, List<Flight> flightList) {
        this.flight = flight;
        this.flightList = flightList;
    }

    public String getFlight() {
        return flight;
    }

    public List<Flight> getFlightList() {
        return flightList;
    }

    @Override
    public String toString() {
        return "List of flights for " +
                "\'" + flight + "\':\n";
    }
}
