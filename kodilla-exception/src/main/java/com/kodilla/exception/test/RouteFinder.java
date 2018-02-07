package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class RouteFinder {

    public Boolean findFlight(Flight flight) throws RouteNotFoundException {

        Map<String, Boolean> finder = new HashMap<>();
        finder.put("Berlin Airport", true);
        finder.put("Paris Airport", true);
        finder.put("Rome Airport", false);
        finder.put("London Airport", true);
        finder.put("Barcelona Airport", false);
        finder.put("Moscow Airport", true);
        finder.put("Stockholm Airport", false);
        finder.put("Athens Airport", true);

        Boolean result  = finder.get(flight.getArrivalAirport());
        if(result !=null) {
            return result;
        }
        throw new RouteNotFoundException("There's no " + flight.toString());
    }
}
