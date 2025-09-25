public class Main {
    public static void main(String[] args) {
        Media book1 = new Book("Java Fundamentals", "B001", "Robert Martin");
        Media dvd1 = new DVD("OOP Concepts", "D001", "Tech Films");
        Media mag1 = new Magazine("Programming Weekly", "M001", 15);

        LibraryUser student = new Student("Alice Johnson", "S12345");
        LibraryUser teacher = new Teacher("Dr. Smith", "T001");
        LibraryUser librarian = new Librarian("Mary Brown", "L001");

        System.out.println("\nAvailable Media:");
        Media.displayMediaInfo(book1);
        Media.displayMediaInfo(dvd1);
        Media.displayMediaInfo(mag1);

        System.out.println("\n=== Borrowing Test ===");
        student.borrowMedia(book1);
        teacher.borrowMedia(dvd1);
        student.borrowMedia(book1);

        System.out.println("\n=== Returning Test ===");
        student.returnMedia(book1);
        librarian.borrowMedia(book1);

        System.out.println("\n=== User Information ===");
        LibraryUser.displayUserInfo(student);
        LibraryUser.displayUserInfo(teacher);
        LibraryUser.displayUserInfo(librarian);
    }
}