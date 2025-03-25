import javax.print.attribute.HashPrintJobAttributeSet;

public class HotelBooking {

    String guestName;
    String roomType;
    int nights;

    public HotelBooking(){
        guestName = "Alex";
        roomType = "Double Suite";
        nights = 3;
    }

    public HotelBooking (String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    public HotelBooking (HotelBooking previousBooking) {
        this.guestName = previousBooking.guestName;
        this.roomType = previousBooking.roomType;
        this.nights = previousBooking.nights;
    }

    void display () {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
    }

    public static void main(String[] args) {

        HotelBooking booking1 = new HotelBooking();
        System.out.println("Default Constructor:");
        booking1.display();
        System.out.println(" ");

        HotelBooking booking2 = new HotelBooking("Melendiz", "Deluxe", 5);
        System.out.println("Parameterized Constructor:");
        booking2.display();
        System.out.println(" ");

        HotelBooking booking3 = new HotelBooking(booking1);
        System.out.println("Copy Constructor:");
        booking3.display();
    }
}
