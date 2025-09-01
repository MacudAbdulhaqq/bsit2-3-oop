import java.util.*;

public class LibraryManager {
    ArrayList<String> books = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    {books.add("Java Programming");
    books.add("Web Development");
    books.add("Database Design");}

    public void showBooks() throws IllegalStateException{
        try {
            if (books.isEmpty()){
                throw new IllegalStateException("There are no books in the library");
            }
            System.out.println("--- Current Books ---");
            int i = 0;
            for (String book : books) {
                i++;
                System.out.println(i + ". " + book);
            }
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Display operation completed");
        }
        System.out.println(" ");
    }

    public void addBook() throws IllegalArgumentException{
        System.out.print("Enter book title to add: ");
        String title = scanner.nextLine();
        try {
            if (title.isBlank()){
                throw new IllegalArgumentException("Title cannot be empty");
            }
            if (title.length() < 3){
                throw new IllegalArgumentException("Title must be at least 3 characters long");
            }
            books.add(title);
            System.out.println("Book '" + title + "' added successfully");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Add book operation completed");
            System.out.println(" ");
            showBooks();
        }
    }

    public void  removeBook() throws NumberFormatException, ArrayIndexOutOfBoundsException, IllegalArgumentException{
        if (books.isEmpty()) {
            System.out.println("Library is empty");
            return;
        }
        System.out.print("Enter book number to remove (1-" +  books.size() + "): ");
        try {
            String input = scanner.next();
            int numInput = Integer.parseInt(input);
            int bookNum = numInput - 1;
            if (numInput < 0) {
                throw new IllegalArgumentException();
            }
            if (bookNum >= books.size() || bookNum < 0){
                throw new ArrayIndexOutOfBoundsException();
            }
            String removedBook = books.get(bookNum);
            System.out.println("Book '" + removedBook + "' removed successfully");
            books.remove(bookNum);
        } catch (NumberFormatException e){
            System.out.println("Please enter a valid number");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Please enter a number from 1 to " + books.size());
        } catch (IllegalArgumentException e) {
            System.out.println("Please enter a positive number");
        } finally {
            System.out.println("Remove book operation completed");
            System.out.println(" ");
            showBooks();
        }
    }
}