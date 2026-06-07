package assignment_3.travel.hotels;

public class Hotel {
    String hotelName;
    String location;
    double price;

    public Hotel(String hotelName, String location, double price) {
        this.hotelName = hotelName;
        this.location = location;
        this.price = price;
    }

    public void getDetails() {
        System.out.println("Hotel Name: " + hotelName);
        System.out.println("Location: " + location);
        System.out.println("Price: " + price);
    }
}
