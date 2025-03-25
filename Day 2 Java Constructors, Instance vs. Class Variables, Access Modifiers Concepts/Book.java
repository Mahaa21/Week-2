public class Book {

    public int ISBN;
    protected String title;
    private String author;

    public Book (int ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public String gerAuthor() {
        return author;
    }

    public void setAuthor (String newName) {
        author = newName;
    }

    public void display() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("-----------------------------------");
    }


}

class EBook extends Book {

    public EBook(int ISBN, String title, String author) {
        super(ISBN, title, author);
    }

    public void displayDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + gerAuthor());
        System.out.println("-----------------------------------");
    }

}

class LibrarySystem {

    public static void main(String[] args) {
        Book b1 = new Book(100, "Java Programming", "Nax");
        System.out.println("Before updating Author name in Main class:");
        b1.display();
        b1.setAuthor("Elon Musk");
        System.out.println("After updating Author name in Main class:");
        b1.display();

        EBook eb1 = new EBook(200, "Python Programming" , "Nick");
        System.out.println("Before updating Author name in subclass:");
        eb1.displayDetails();
        eb1.setAuthor("Melendiz");
        System.out.println("After updating Author name in subclass:");
        eb1.displayDetails();
    }
}
