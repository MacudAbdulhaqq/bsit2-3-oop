import java.util.*;

public class PostManager {
    public static int calculateEngagement(int... interactions){
        int engagementScore = 0;
        for (int interaction : interactions){
            engagementScore += interaction;
        }
        return engagementScore;
    }

    public String getCategoryRating(int engagementScore){
        String categoryRating = "";
        if (engagementScore >= 1000){
            categoryRating = "Viral";
        } else if (engagementScore >= 500){
            categoryRating = "Popular";
        } else if (engagementScore >= 100){
            categoryRating = "Good";
        } else if (engagementScore >= 50){
            categoryRating = "Low";
        } else {
            categoryRating = "Poor";
        }
        return categoryRating;
    }

    public void displayPostStats(String postTitle, int engagementScore){
        System.out.printf("Post: " + postTitle);
        System.out.printf("Engagement Score: " + engagementScore);
    }

    public void displayPostStats(String postTitle, int engagementScore, String Category){
        System.out.println("Post: " + postTitle);
        System.out.println("Engagement Score: " + engagementScore);
        System.out.println("Category: " + Category);
    }

    public static void manageHashtags(String[] hashtags){
        String[] fixedHashtags = new String[5];
        for (int i = 0; i < 5; i++) {
            if (i < hashtags.length) {
                fixedHashtags[i] = hashtags[i];
            } else {
                fixedHashtags[i] = null;
            }
        }
        Set<String> uniqueHashtags = new LinkedHashSet<>(Arrays.asList(fixedHashtags));
        System.out.println("Unique Hashtags: " + uniqueHashtags);
    }

    public static void findTrendingPosts(){
        LinkedList<String> trendingPosts = new LinkedList<>();

        ArrayList<String> posts = new ArrayList<>();
        posts.add("Harry Potter");
        posts.add("Lord of the Rings");

        HashMap<String, Integer> postEngagement = new HashMap<>();
        postEngagement.put("Harry Potter", 501);
        postEngagement.put("Lord of the Rings", 600);

        for (String post : posts) {
            if (postEngagement.containsKey(post) && postEngagement.get(post) > 500) {
                trendingPosts.add(post);
            }
        }
        System.out.println("Trending Posts: " + trendingPosts);
    }

    public static void getUniqueAuthors(String... authors){
        Set<String> uniqueAuthors = new LinkedHashSet<>(Arrays.asList(authors));
        System.out.println("Unique Authors: " + uniqueAuthors);
    }
}