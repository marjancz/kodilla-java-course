package com.kodilla.good.patterns.challenges.Flights;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class FlightFinderService {

    public void processFrom(FlightRequest flightRequest) {
        String from = flightRequest.getFlightFrom();

        List<Flight> flightsFrom = flightRequest.getFlightList().stream()
                .filter(f -> f.getDepartureAirport().equals(from))
                .collect(Collectors.toList());
        if (flightsFrom.size() == 0) {
            System.out.println("There's no flights from " + "\'" + from +
                    "\'" + " has been found");
        } else {
            System.out.println("The list of flights from " + from + ":\n");
            for (int i = 0; i < flightsFrom.size(); i++) {
                System.out.println(i+1 + ". " + flightsFrom.get(i));
            }
        }
    }

    public void processTo(FlightRequest flightRequest) {
        String to = flightRequest.getFlightTo();

        List<Flight> flightsTo = flightRequest.getFlightList().stream()
                .filter(t -> t.getArrivalAirport().equals(to))
                .collect(Collectors.toList());
        if (flightsTo.size() == 0) {
            System.out.println("There's no flights to " + "\'" + to +
                    "\'" + " has been found");
        } else {
            System.out.println("The list of flights to " + to + ":\n");
            for (int i = 0; i < flightsTo.size(); i++) {
                System.out.println(i + 1 + ". " + flightsTo.get(i));
            }
        }
    }

    public void processVia(FlightRequest flightRequest) {
        String from = flightRequest.getFlightFrom();
        String to = flightRequest.getFlightTo();

        List<Flight> flightsDep = flightRequest.getFlightList().stream()
                .filter(f -> f.getDepartureAirport().equals(from))
                .filter(t -> !t.getArrivalAirport().equals(to))
                .collect(Collectors.toList());

        List<Flight> flightsArr = flightRequest.getFlightList().stream()
                .filter(t -> t.getArrivalAirport().equals(to))
                .filter(f -> !f.getDepartureAirport().equals(from))
                .collect(Collectors.toList());

        List<Flight> flightsVia = new ArrayList<>();
        for(Flight list1 : flightsDep) {
            for(Flight list2 : flightsArr) {
                if(list1.getArrivalAirport().equals(list2.getDepartureAirport())) {
                    flightsVia.add(list1);
                    flightsVia.add(list2);
                }
            }
        }

        if (flightsVia.size() == 0) {
            System.out.println("There's no flights has been found:" +
                    "\n  from: \' " + from + "\'" +
                    "\n  to: \' " + to + "\' " +
                    "\n  with intermediate airport");
        } else {
            System.out.println("The list of flights " +
                    "\n  from: \'" + from + "\'" +
                    "\n  to: \'" + to + "\' " +
                    "\n  with intermediate airport");
            for (int i = 0; i < flightsVia.size(); i++) {
                System.out.println(i+1 + ". " + flightsVia.get(i));
            }
        }
    }
}