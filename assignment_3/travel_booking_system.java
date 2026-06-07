/* 7. Travel Booking System 
Problem Statement: 
A travel company wants to manage flight and hotel bookings. 
Package Structure: 
- Package: travel.flights  
    o Class: Flight  
        - Attributes: flightNumber, destination, price 
        - Methods: getDetails() 
- Package: travel.hotels  
    o Class: Hotel  
        - Attributes: hotelName, location, price 
        - Methods: getDetails() 
- Package: travel.bookings  
    o Class: Booking  
        - Methods: bookFlight(Flight f), bookHotel(Hotel h) 

Task: 
1. Implement the package structure and define the classes. 
2. Book a flight and a hotel. 
3. Display the booking details. */

package assignment_3;

import assignment_3.travel.bookings.Booking;
import assignment_3.travel.flights.Flight;
import assignment_3.travel.hotels.Hotel;

public class travel_booking_system {
    public static void main(String[] args) {

        Flight f = new Flight("AI101", "Delhi", 5000);

        Hotel h = new Hotel("Taj Hotel", "Delhi", 7000);

        Booking b = new Booking();

        b.bookFlight(f);
        b.bookHotel(h);
    }
}
