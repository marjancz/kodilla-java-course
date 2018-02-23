package com.kodilla.good.patterns.challenges.Flights;

import java.util.List;
import java.util.stream.Collectors;

public class FlightFinderService {
    FlightRequest flightRequest;

    public void processFrom(FlightRequest flightRequest) {
        String name = flightRequest.getFlight();

        List<Flight> flightsFrom = flightRequest.getFlightList().stream()
                .filter(from -> from.getDepartureAirport().equals(name))
                .collect(Collectors.toList());
        if (flightsFrom.size() == 0) {
            System.out.println("There's no flights from " + "\'" + name +
                    "\'" + " has been found");
        } else {
            System.out.println("\nThe list of flights from " + name + ":\n");
            for (int i = 0; i < flightsFrom.size(); i++) {
                System.out.println(i + 1 + ". " + flightsFrom.get(i));
            }
        }
    }

    public void processTo(FlightRequest flightRequest) {
        String name = flightRequest.getFlight();

        List<Flight> flightsTo = flightRequest.getFlightList().stream()
                .filter(to -> to.getArrivalAirport().equals(name))
                .collect(Collectors.toList());
        if (flightsTo.size() == 0) {
            System.out.println("There's no flights to " + "\'" + name +
                    "\'" + " has been found");
        } else {
            System.out.println("\nThe list of flights to " + name + ":\n");
            for (int i = 0; i < flightsTo.size(); i++) {
                System.out.println(i + 1 + ". " + flightsTo.get(i));
            }
        }
    }

    public void processVia(FlightRequest flightRequest) {
        String name = flightRequest.getFlight();

        List<Flight> flightsVia = flightRequest.getFlightList().stream()
                .filter(via -> via.getViaAirport().equals(name))
                .collect(Collectors.toList());
        if (flightsVia.size() == 0) {
            System.out.println("There's no flights via " + "\'" + name +
                    "\'" + " has been found");
        } else {
            System.out.println("\nThe list of flight via " + name + ":\n");
            for (int i = 0; i < flightsVia.size(); i++) {
                System.out.println(i + 1 + ". " + flightsVia.get(i));
            }
        }
    }
}
