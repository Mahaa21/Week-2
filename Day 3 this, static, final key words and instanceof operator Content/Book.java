public class Book {

    private static String libraryName = "Central Library";
    private final int isbn;
    private String title;
    private String author;

    public Book(int isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    public static String displayLibraryName(){
        return libraryName;
    }

    public void display() {
        System.out.println("Library Name: " + displayLibraryName());
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
        System.out.println("-----------------------------------------------");
    }

    public static void main(String[] args) {
        Book acc1 = new Book(101, "Nax", "Java Programming");
        if (acc1 instanceof Book) {
            System.out.println("acc1 is an instance of Book.");
        }
        acc1.display();

        Book acc2 = new Book(100, "Navaneethan", "Python Programming");
        if (acc2 instanceof Book) {
            System.out.println("acc2 is an instance of Book.");
        }
        acc2.display();
    }
}
