package assignment_3.travel.flights;

public class Flight {
    String flightNumber;
    String destination;
    double price;

    public Flight(String flightNumber, String destination, double price) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.price = price;
    }

    public void getDetails() {
        System.out.println("Flight Number: " + flightNumber);
        System.out.println("Destination: " + destination);
        System.out.println("Price: " + price);
    }
}
