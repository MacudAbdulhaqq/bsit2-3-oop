public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("title1", "author1");
        Book book2 = new Book("title2", "author2");
        Book book3 = new Book("title3", "author3");

        book1.addRating(4);
        book2.addMultipleRatings(5,4,3,5);
        book2.addRating(6);
        book1.getAuthor();
        Book.getTotalBooks();
    }
}