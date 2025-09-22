import java.util.Arrays;

public class Library {
    private Book[] books;
    private int bookCount;

    public Library(){
        books = new Book[10];
        bookCount = 0;
    }

    public void addBook(Book book){
        if (bookCount >= 10){
            System.out.println("Library is full");
        } else {
            books[bookCount] = book;
            bookCount++;
            System.out.println("Book successfully added");
        }
    }

    public void removeBook(String isbn){
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getIsbn().equals(isbn)) {
                for (int j = i; j < bookCount - 1; j++) {
                    books[j] = books[j + 1];
                }
                books[bookCount - 1] = null;
                bookCount--;
                System.out.println("Book successfully removed");
                return;
            }
        }
    }

    public Book findBook(String isbn) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getIsbn().equals(isbn)) {
                return books[i];
            }
        }
        return null;
    }

    public void borrowBook(String isbn){
        Book book = findBook(isbn);
        if (book != null) {
            book.borrowBook();
        } else {
            System.out.println("Book not found");
        }
    }

    public void returnBook(String isbn){
        Book book = findBook(isbn);
        if (book != null) {
            book.returnBook();
        } else {
            System.out.println("Book not found");
        }
    }

    public void displayAvailableBooks(){
        System.out.println("Available Books: ");
        for (int i = 0; i < bookCount; i++) {
            if (books[i].isAvailable) {
                System.out.println(books[i].getTitle());
            }
        }
    }

    public void displayAllBooks(){
        System.out.println("All Books: ");
        for (int i = 0; i < bookCount; i++) {
            System.out.println(books[i].getTitle());
        }
    }

    public int getBookCount(){
        return bookCount;
    }
}
