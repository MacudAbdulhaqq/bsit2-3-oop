public class Book{
    String title;
    String author;
    int pages;
    boolean isAvailable;

    public Book(String Title, String Author, int Pages){
        title = Title;
        author = Author;
        pages = Pages;
        isAvailable = true;
        System.out.println("A new book " + title + " by " + author + " has been added to the library!");
    }

    public void displayInfo(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
        System.out.println("Available: " + isAvailable);
    }

    public void borrowBook(){
        if (!isAvailable){
            System.out.println("Book is unavailable");
        } else {
            isAvailable = false;
            System.out.println("Book Borrowed");
        }
    }

    public void returnBook(){
        isAvailable = true;
        System.out.println("Book Returned");
    }

    public static void main(String[] args){
        Book book1 = new Book("Book 1", "Me", 100);
        Book book2 = new Book("Book 2", "Myself", 200);
        Book book3 = new Book("Book 3", "I", 300);
    }
}
