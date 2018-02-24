package com.kodilla.good.patterns.challenges.Flights;

import java.util.List;

public class FlightRequest {
    private final String flightFrom;
    private final String flightTo;
    private final String flightVia;
    List<Flight> flightList;

    public FlightRequest(String flightFrom, String flightTo, String flightVia,
                         List<Flight> flightList) {
        this.flightFrom = flightFrom;
        this.flightTo = flightTo;
        this.flightVia = flightVia;
        this.flightList = flightList;
    }

    public String getFlightFrom() {
        return flightFrom;
    }

    public String getFlightTo() {
        return flightTo;
    }

    public String getFlightVia() {
        return flightVia;
    }

    public List<Flight> getFlightList() {
        return flightList;
    }

    @Override
    public String toString() {
        return "FlightRequest{" +
                "flightFrom='" + flightFrom + '\'' +
                ", flightTo='" + flightTo + '\'' +
                ", flightVia='" + flightVia + '\'' +
                '}';
    }
}

//    private final String flight;
//    private final String flightVia;
//    List<Flight> flightList;
//
//    public FlightRequest(final String flight, List<Flight> flightList) {
//        this.flight = flight;
//        this.flightList = flightList;
//    }
//
//    public String getFlight() {
//        return flight;
//    }
//
//    public List<Flight> getFlightList() {
//        return flightList;
//    }
//
//    @Override
//    public String toString() {
//        return "List of flights for " +
//                "\'" + flight + "\':\n";
//    }
//}
