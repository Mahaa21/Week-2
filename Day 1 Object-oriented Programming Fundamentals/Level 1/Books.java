import java.security.PrivateKey;

public class Books {

    private String title;
    private String author;
    private int price;

    public Books (String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayBooks() {
        System.out.println("Books Details:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

    public static void main (String[] Args) {
        Books book = new Books("Harry Potter and The Half Blood Prince", "J.K.Rowling", 350);
        book.displayBooks();
    }
}
