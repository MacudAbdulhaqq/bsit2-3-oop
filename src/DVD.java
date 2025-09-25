class DVD extends Media {
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