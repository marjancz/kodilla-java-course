package com.kodilla.good.patterns.challenges.Flights;

import java.util.List;

public class FlightRequest {
    private final String flightFrom;
    private final String flightTo;
    List<Flight> flightList;

    public FlightRequest(String flightFrom, String flightTo,
                         List<Flight> flightList) {
        this.flightFrom = flightFrom;
        this.flightTo = flightTo;
        this.flightList = flightList;
    }

    public String getFlightFrom() {
        return flightFrom;
    }

    public String getFlightTo() {
        return flightTo;
    }

    public List<Flight> getFlightList() {
        return flightList;
    }

    @Override
    public String toString() {
        return "FlightRequest{" +
                "flightFrom='" + flightFrom + '\'' +
                ", flightTo='" + flightTo + '\'' +
                '}';
    }
}
