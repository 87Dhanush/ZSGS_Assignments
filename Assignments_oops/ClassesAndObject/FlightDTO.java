import java.util.*;

public class FlightDTO {
    public static void main(String[] args) {
        List<Flight> list=new ArrayList<>();
        Flight flight1 = new Flight("AI202", "New York", "Delhi", 1800);
        Flight flight2 = new Flight("AI203", "New York", "Chennai", 2000);
        list.add(flight1);
        list.add(flight2);
        showDetails(list);
    }

    public static void showDetails(List<Flight> list) {
        for (Flight flight : list) {
         System.out.println("Flight Number: " + flight.getFlightNumber() + ", From: " + flight.getSource() + ", To: " + flight.getDestination() + ", Price (Rs): " + flight.getPrice());
    }
}
}

class Flight {
    private String flightNumber;
    private String source;
    private String destination;
    private int price;

    public Flight(String flightNumber, String source, String destination, int price) {
        this.flightNumber = flightNumber;
        this.source = source;
        this.destination = destination;
        this.price = price;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }
    public void setSource(String source) {
        this.source = source;
    }
    public void setDestination(String destination) {
        this.destination = destination;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    public String getFlightNumber() {
        return flightNumber;
    }
    public String getSource() {
        return source;
    }
    public String getDestination() {
        return destination;
    }
    public int getPrice() {
        return price;
    }
}
