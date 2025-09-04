import java.util.*;

public class Book {
    private String title;
    private String author;
    private ArrayList<Integer> ratings;
    private static int totalBooks = 0;

    public Book(String title, String author){
        String bookTitle;
        String bookAuthor;
        ratings = new ArrayList<>();
        totalBooks++;
    }

    public void addRating(int rating) throws IllegalArgumentException{
        try {
            if (rating < 1 || rating > 5) {
                throw new IllegalArgumentException("Invalid rating: must be 1-5 stars");
            }
            ratings.add(rating);
            System.out.println("Rating " + rating + " added successfully");
        } catch (IllegalArgumentException e){
            e.getMessage();
        }
    }

    public double getAverageRating(){
        double totalRating = 0;
        for (double rating : ratings){
            totalRating += rating;
        }
        return totalRating / ratings.size();
    }

    public String getPopularityLevel(){
        String popularityLevel;
        if (getAverageRating() >= 4.5){
            popularityLevel = "Excellent";
        } else if (getAverageRating() >= 3.5){
            popularityLevel = "Good";
        } else if (getAverageRating() >= 2.5){
            popularityLevel = "Average";
        } else if (getAverageRating() >= 1.5){
            popularityLevel = "Poor";
        } else {
            popularityLevel = "Terrible";
        }

        if (ratings.isEmpty()){
            System.out.println("No ratings");
        }
        return popularityLevel;
    }

    public void addMultipleRatings(int... ratings) throws IllegalArgumentException{
        try {
            for (int rating : ratings) {
                addRating(rating);
            }
        } catch (IllegalArgumentException e){
            System.out.println("Invalid rating: must be 1-5 stars");
        }
        System.out.println("Rating " + Arrays.toString(ratings) + " added successfully");
    }

    public static int getTotalBooks(){
        System.out.println("Total books created: " + totalBooks);
        return totalBooks;
    }

    public String getTitle(){
        System.out.println(title);
        return title;
    }

    public String getAuthor(){
        System.out.println(author);
        return author;
    }

    public void displayBook(){
        System.out.println("Book: " + title + " by " + author + ", Average Rating: " + getAverageRating() + ", Level: " + getPopularityLevel());
    }
}