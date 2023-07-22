// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Book Ulysses = new Book("Ulysses", "James Joys", 600, "3456GH");
        System.out.println("Bookname: " + Ulysses.getAuthor() + " " + Ulysses.getName());
        Book FHeart = new Book("Fifth Heart", "Dan Simmons", 500, "11GH89H");
        System.out.println("Bookname: " + FHeart.getAuthor() + " " + FHeart.getName());
        Book Alice = new Book("Путешествие Алисы", "Кир Булычев", 211, "1WV4566");
        System.out.println("Bookname: " + Alice.getAuthor() + " " + Alice.getName());
        Book Tom = new Book("Приключения Тома Сойера", "Марк Твен", 349, "FFG1234H");
        System.out.println("Bookname: " + Tom.getAuthor() + " " + Tom.getName());
        Book Gomer = new Book("Илиада и Одиссея", "Гомер", 980, "NNM45fh7");
        System.out.println("Bookname: " + Gomer.getAuthor() + " " + Gomer.getName());
        Book Zhivago = new Book("Доктор Живаго", "Пастернак", 456, "VVVT67");
        System.out.println("Bookname: " + Zhivago.getAuthor() + " " + Zhivago.getName());

    }
}
