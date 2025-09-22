public class Book {
    private String title;
    private String author;
    private String isbn;
    protected boolean isAvailable;
    private int yearPublished;

    public Book(String title, String author, String isbn, int yearPublished){
        setTitle(title);
        setAuthor(author);
        setIsbn(isbn);
        setYearPublished(yearPublished);
        isAvailable = true;
    }

    public void setTitle(String title){
        if (title != null && !title.trim().isEmpty()){
            this.title = title;
        } else {
            System.out.println("Invalid Title provided");
        }
    }

    public void setAuthor(String author){
        if (author != null && !author.trim().isEmpty()){
            this.author = author;
        } else {
            System.out.println("Invalid Author provided");
        }
    }

    public void setIsbn(String isbn){
        if (isbn.trim().length() != 10 && isbn.trim().length() != 13){
            System.out.println("Invalid ISBN provided");
        } else {
            this.isbn = isbn;
        }
    }

    public void setYearPublished(int year){
        if (year >= 1450 && year <= 2025){
            this.yearPublished = year;
        } else {
            System.out.println("Invalid year provided");
        }
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public String getIsbn(){
        return isbn;
    }

    public int getYearPublished(){
        return yearPublished;
    }

    public boolean getIsAvailable(){
        return isAvailable;
    }

    public void borrowBook(){
        if (isAvailable){
            isAvailable = false;
            System.out.println("Book borrowed successfully");
        } else {
            System.out.println("Book is unavailable");
        }
    }

    public void returnBook(){
        if (!isAvailable){
            isAvailable = true;
            System.out.println("Book returned successfully");
        } else {
            System.out.println("Book already returned");
        }
    }

    public void displayBookInfo(){
        System.out.println("Title: " + title + " | Author: " + author +" | ISBN: " + isbn + " | Year: " + yearPublished + " | Status: " + isAvailable);
    }
}
