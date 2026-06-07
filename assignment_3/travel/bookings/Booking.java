package assignment_3.travel.bookings;

import assignment_3.travel.flights.Flight;
import assignment_3.travel.hotels.Hotel;

public class Booking {
    public void bookFlight(Flight f) {
        System.out.println("Flight Booked");
        f.getDetails();
    }

    public void bookHotel(Hotel h) {
        System.out.println("Hotel Booked");
        h.getDetails();
    }
}
