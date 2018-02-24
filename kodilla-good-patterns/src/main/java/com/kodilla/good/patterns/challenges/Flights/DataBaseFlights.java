package com.kodilla.good.patterns.challenges.Flights;

import java.util.Arrays;
import java.util.List;

public class DataBaseFlights {
    private final List<Flight> flightList;

    public DataBaseFlights() {
        flightList = Arrays.asList(new Flight("Warsaw", "Gdansk", "direct"),
                new Flight("Warsaw", "Cacow", "Lodz"),
                new Flight("Radom", "Gdansk", "Warsaw"),
                new Flight("Gdansk", "Cracow", "direct"),
                new Flight("Gdansk", "Lodz", "direct"),
                new Flight("Lodz", "Cracow", "Warsaw"),
                new Flight("Warsaw", "Poznan", "direct"),
                new Flight("Cracow", "Poznan", "Gdansk"),
                new Flight("Cracow", "Radom", "Lodz"),
                new Flight("Radom", "Cracow", "Lodz"),
                new Flight("Poznan", "Radom", "Lodz"),
                new Flight("Poznan", "Gdansk", "Radom"));
    }

    public List<Flight> getFlightList() {
        return flightList;
    }
}
