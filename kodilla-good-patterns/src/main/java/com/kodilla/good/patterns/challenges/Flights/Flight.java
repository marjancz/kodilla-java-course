package com.kodilla.good.patterns.challenges.Flights;

public class Flight {
    private final String departureAirport;
    private final String arrivalAirport;
    private final String viaAirport;

    public Flight(String departureAirport, String arrivalAirport, String viaAirport) {
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.viaAirport = viaAirport;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    public String getViaAirport() {
        return viaAirport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flight)) return false;

        Flight flight = (Flight) o;

        if (!departureAirport.equals(flight.departureAirport)) return false;
        if (!arrivalAirport.equals(flight.arrivalAirport)) return false;
        return viaAirport.equals(flight.viaAirport);
    }

    @Override
    public int hashCode() {
        int result = departureAirport.hashCode();
        result = 31 * result + arrivalAirport.hashCode();
        result = 31 * result + viaAirport.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Flight:\n" +
                "   " + " departureAirport='" + departureAirport + '\'' +
                "\n   " + " arrivalAirport='" + arrivalAirport + '\'' +
                "\n   " + " viaAirport='" + viaAirport + '\'';
    }
}

