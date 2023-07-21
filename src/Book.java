public class Book {
    private final String name;
    private final String author;
    private final int countPages;
    private final String ISBN;

    public Book(String name, String author, int countPages, String ISBN) {
        this.name = name;
        this.author = author;
        this.countPages = countPages;
        this.ISBN = ISBN;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getCountPages() {
        return countPages;
    }

    public String getISBN() {
        return ISBN;
    }


}
