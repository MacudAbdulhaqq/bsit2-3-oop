public class Main {
    public static void main(String[] args) {
        LibraryManager lm = new LibraryManager();
        System.out.println("=== Library Management System ===");
        System.out.println(" ");
        lm.showBooks();
        lm.addBook();
        lm.removeBook();
    }
}