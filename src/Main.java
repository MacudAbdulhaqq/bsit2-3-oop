public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Book1","Author1", "0000000001", 2020);
        Book book2 = new Book("Book2","Author2", "0000000002", 2020);
        Book book3 = new Book("Book3","Author3", "0000000003", 2020);
        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.displayAllBooks();
        library.borrowBook("0000000001");
        library.borrowBook("0000000001");
        library.returnBook("0000000001");
        library.displayAvailableBooks();
        Book book4 = new Book("Book4","Author4", "0000000004", 100);
    }
}