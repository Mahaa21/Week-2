import java.util.Scanner;

public class MovieTicket {

    private String movieName;
    private int seatNumber;
    private int price;
    private boolean isBooked;

    public MovieTicket (String movieName) {
        this.movieName = movieName;
        this.isBooked = false;
    }

    public void BookTicket (int seatNumber, int price) {
        if (!isBooked) {
            this.seatNumber = seatNumber;
            this.price = price;
            this.isBooked = true;
            System.out.println("The movie ticket is booked for " + movieName + " at seat #" + seatNumber + " at price " + price);
        }
        else {
            System.out.println("Ticket Already Booked!");
        }
    }

    public void display () {
        if (isBooked) {
            System.out.println("Movie Details:");
            System.out.println("Movie Name: " + movieName);
            System.out.println("Seat Number: " + seatNumber);
            System.out.println("Price: " + price);
        }
        else {
            System.out.println("Ticket Not Booked!");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Movie Name: ");
        String name = input.nextLine();
        MovieTicket ticket = new MovieTicket(name);
        System.out.print("Enter the Seat Number: ");
        int seat = input.nextInt();
        System.out.print("Enter the Ticket Price: ");
        int price = input.nextInt();
        ticket.BookTicket(seat, price);
        ticket.display();
        input.close();
    }
}
