import library.Book;

public class MainBook {
    public static void main(String[] args) {

        Book b = new Book(
            101,
            "Java Programming",
            "James Gosling",
            599.00
        );

        b.displayBook();
    }
}