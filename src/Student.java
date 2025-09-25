class Student implements LibraryUser {
    protected String name;
    protected String studentId;

    public Student(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
    }

    @Override
    public String getUserType() {
        return ("Student");
    }

    @Override
    public int getMaxBorrowLimit() {
        return 3;
    }

    @Override
    public void borrowMedia(Media media) {
        if (media.isAvailable) {
            media.borrowItem();
            System.out.println(name + " (" + getUserType() + ") borrowed: " + media.getTitle());
        } else {
            System.out.println("Sorry, " + media.getTitle() + " is not available");
        }
    }

    @Override
    public void returnMedia(Media media) {
        media.returnItem();
    }
}