class Book extends Media {
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