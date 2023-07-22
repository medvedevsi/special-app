// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Ulysses", "James Joys", 600, "3456GH");
        System.out.println("Bookname: " + book1.getAuthor() + " " + book1.getName());
        Book book2 = new Book("Fifth Heart", "Dan Simmons", 500, "11GH89H");
        System.out.println("Bookname: " + book2.getAuthor() + " " + book2.getName());
        Book book3 = new Book("Путешествие Алисы", "Кир Булычев", 211, "1WV4566");
        System.out.println("Bookname: " + book3.getAuthor() + " " + book3.getName());
        Book book4 = new Book("Приключения Тома Сойера", "Марк Твен", 349, "FFG1234H");
        System.out.println("Bookname: " + book4.getAuthor() + " " + book4.getName());
        Book book5 = new Book("Доктор Живаго", "Пастернак", 456, "VVVT67");
        System.out.println("Bookname: " + book5.getAuthor() + " " + book5.getName());
    }
}
