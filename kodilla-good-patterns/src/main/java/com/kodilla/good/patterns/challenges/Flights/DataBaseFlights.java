package com.kodilla.good.patterns.challenges.Flights;

import java.util.Arrays;
import java.util.List;

public class DataBaseFlights {
    private final List<Flight> flightList;

    public DataBaseFlights() {
        flightList = Arrays.asList(new Flight("Warsaw", "Gdansk"),
                new Flight("Warsaw", "Cracow"),
                new Flight("Radom", "Gdansk"),
                new Flight("Gdansk", "Cracow"),
                new Flight("Gdansk", "Lodz"),
                new Flight("Lodz", "Cracow"),
                new Flight("Warsaw", "Poznan"),
                new Flight("Cracow", "Poznan"),
                new Flight("Cracow", "Radom"),
                new Flight("Radom", "Cracow"),
                new Flight("Poznan", "Radom"),
                new Flight("Poznan", "Gdansk"));
    }

    public List<Flight> getFlightList() {
        return flightList;
    }
}
