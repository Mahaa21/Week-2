import java.util.ArrayList;
import java.util.List;

class Book {

    private String title;
    private String author;

    public Book (String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}

class Library {

    private String libraryName;
    private List<Book> books;

    public Library (String libraryName) {
        this.libraryName = libraryName;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("The book " + "\"" + book.getTitle() + "\"" + " written by " + "\"" + book.getAuthor() + "\"" + " is added to " + libraryName);
    }

    public void displayLibraryDetails() {
        System.out.println("The books in the " + libraryName + " are:");
        for (Book book : books) {
            System.out.println("-Title: " + book.getTitle() + " \n-Author: " + book.getAuthor());
        }
    }
}

class LibraryManagement {

    public static void main(String[] args) {

        Library library1 = new Library("Central Library");
        Library library2 = new Library("Main Library");

        Book book1 = new Book("Java Programming", "Navaneethan");
        Book book2 = new Book("Python Programming", "Nax");
        Book book3 = new Book("Harry Potter", "J.K.Rowling");
        Book book4 = new Book("Alchemist", "Jack The Ripper");

        library1.addBook(book1);
        library1.addBook(book3);
        library2.addBook(book2);
        library2.addBook(book4);
        System.out.println();

        library1.displayLibraryDetails();
        System.out.println();
        library2.displayLibraryDetails();

    }
}