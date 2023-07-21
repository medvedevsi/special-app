// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Book book = new Book("Ulysses", "James Joys", 600, "3456GH");
        System.out.println("Bookname: " + book.getAuthor() + " " + book.getName());
        Book book = new Book("Fifth Heart", "Dan Simmons", 500, "11GH89H");
        System.out.println("Bookname: " + book.getAuthor() + " " + book.getName());
    }
}