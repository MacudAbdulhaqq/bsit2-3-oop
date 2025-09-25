interface LibraryUser {
    String getUserType();
    void borrowMedia(Media media);
    void returnMedia(Media media);
    int getMaxBorrowLimit();
    public static void displayUserInfo(LibraryUser user) {
        System.out.println(user.getUserType() + " - Max borrow limit: " + user.getMaxBorrowLimit() + " items");
    }
}