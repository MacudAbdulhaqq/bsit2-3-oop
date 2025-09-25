public abstract class Media {
    protected String title;
    protected String itemId;
    protected boolean isAvailable;

    public Media(String title, String itemId) {
        this.title = title;
        this.itemId = itemId;
        isAvailable = true;
    }

    public String getTitle() {
        return title;
    }

    public String getItemId() {
        return itemId;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void borrowItem(){
        isAvailable = false;
        System.out.println(title + " has been borrowed");
    }

    public void returnItem(){
        isAvailable = true;
        System.out.println(title + " has been returned");
    }

    public abstract String getMediaType();
    public abstract void displayInfo();
    public static void displayMediaInfo(Media media) {
        media.displayInfo();
    }
}

class Book extends Media{
    protected String author;

    public Book(String title, String itemId, String author) {
        super(title, itemId);
        this.isAvailable = true;
        this.author = author;
    }

    @Override
    public String getMediaType() {
        return ("Book");
    }

    @Override
    public void displayInfo() {
        System.out.println("Title: " + title + " | Author: " + author + " | ItemId: " + itemId);
    }
}

class DVD extends Media{
    protected String director;

    public DVD(String title, String itemId, String director) {
        super(title, itemId);
        this.isAvailable = true;
        this.director = director;
    }

    @Override
    public String getMediaType() {
        return ("DVD");
    }

    @Override
    public void displayInfo() {
        System.out.println("Title: " + title + " | Director: " + director + " | ItemId: " + itemId);
    }
}

class Magazine extends Media{
    protected int issueNumber;

    public Magazine(String title, String itemId, int issueNumber) {
        super(title, itemId);
        this.isAvailable = true;
        this.issueNumber = issueNumber;
    }

    @Override
    public String getMediaType() {
        return ("Magazine");
    }

    @Override
    public void displayInfo() {
        System.out.println("Title: " + title + " | Issue: #" + issueNumber + " | ItemId: " + itemId);
    }
}