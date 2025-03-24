// Interface for items that can be reserved
interface Reservable {
    void reserveItem();
    boolean checkAvailability();
}

// Abstract class for library items
abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;

    // Constructor
    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    // Getter for itemId
    public String getItemId() {
        return itemId;
    }

    // Getter for title
    public String getTitle() {
        return title;
    }

    // Getter for author
    public String getAuthor() {
        return author;
    }

    // Getter for item details
    public void getItemDetails() {
        System.out.println("Item ID: " + getItemId());
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
    }

    // Abstract method for getting loan duration
    public abstract int getLoanDuration();
}

// Book class extending LibraryItem
class Book extends LibraryItem implements Reservable {
    private boolean isAvailable;

    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
        this.isAvailable = true;  // Assuming the book is available initially
    }

    @Override
    public int getLoanDuration() {
        return 14; // Books can be loaned for 14 days
    }

    @Override
    public void reserveItem() {
        if (isAvailable) {
            System.out.println(getTitle() + " has been reserved.");
            isAvailable = false; // Once reserved, it's no longer available
        } else {
            System.out.println(getTitle() + " is currently unavailable.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }
}

// Magazine class extending LibraryItem
class Magazine extends LibraryItem implements Reservable {
    private boolean isAvailable;

    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
        this.isAvailable = true; // Assuming the magazine is available initially
    }

    @Override
    public int getLoanDuration() {
        return 7; // Magazines can be loaned for 7 days
    }

    @Override
    public void reserveItem() {
        if (isAvailable) {
            System.out.println(getTitle() + " has been reserved.");
            isAvailable = false; // Once reserved, it's no longer available
        } else {
            System.out.println(getTitle() + " is currently unavailable.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }
}

// DVD class extending LibraryItem
class DVD extends LibraryItem implements Reservable {
    private boolean isAvailable;

    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
        this.isAvailable = true; // Assuming the DVD is available initially
    }

    @Override
    public int getLoanDuration() {
        return 3; // DVDs can be loaned for 3 days
    }

    @Override
    public void reserveItem() {
        if (isAvailable) {
            System.out.println(getTitle() + " has been reserved.");
            isAvailable = false; // Once reserved, it's no longer available
        } else {
            System.out.println(getTitle() + " is currently unavailable.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }
}

// Main class to test the library system
public class LibraryManagementSystem {
    public static void main(String[] args) {
        // Creating different items
        LibraryItem book = new Book("B001", "Java Programming", "James Gosling");
        LibraryItem magazine = new Magazine("M001", "Tech Monthly", "John Doe");
        LibraryItem dvd = new DVD("D001", "The Matrix", "Wachowski Brothers");

        // Display details and loan duration for each item
        System.out.println("Book Details:");
        book.getItemDetails();
        System.out.println("Loan Duration: " + book.getLoanDuration() + " days");

        System.out.println("\nMagazine Details:");
        magazine.getItemDetails();
        System.out.println("Loan Duration: " + magazine.getLoanDuration() + " days");

        System.out.println("\nDVD Details:");
        dvd.getItemDetails();
        System.out.println("Loan Duration: " + dvd.getLoanDuration() + " days");

        // Checking availability and reserving items
        if (book instanceof Reservable) {
            Reservable reservableBook = (Reservable) book;
            reservableBook.reserveItem();
            System.out.println("Availability: " + reservableBook.checkAvailability());
        }

        if (magazine instanceof Reservable) {
            Reservable reservableMagazine = (Reservable) magazine;
            reservableMagazine.reserveItem();
            System.out.println("Availability: " + reservableMagazine.checkAvailability());
        }

        if (dvd instanceof Reservable) {
            Reservable reservableDVD = (Reservable) dvd;
            reservableDVD.reserveItem();
            System.out.println("Availability: " + reservableDVD.checkAvailability());
        }
    }
}
