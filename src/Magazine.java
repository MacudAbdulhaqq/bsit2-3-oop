class Magazine extends Media {
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