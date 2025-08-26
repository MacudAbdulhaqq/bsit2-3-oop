public class Main {
    public static void main(String[] args) {
        PostManager pm = new PostManager();
        System.out.println("===Social Media Post Manager===");
        pm.displayPostStats("Java Programming Tips",
                pm.calculateEngagement(150,75,25),
                pm.getCategoryRating(pm.calculateEngagement(150,75,25)));
        System.out.println(" ");
        pm.manageHashtags(new String[]{"#java", "#coding", "#programming", "#java", "#tips"});
        pm.findTrendingPosts();
        pm.getUniqueAuthors("Alice", "Bob", "Alice", "Charlie", "Bob");
    }
}