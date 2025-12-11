import java.util.ArrayList;


public class SocialMedia {
    private ArrayList<String> posts;

    public SocialMedia(String filename) {
        posts = FileOperator.getStringData(filename);
    }

    public int postsWithLength(int minLength) {
        int totalCount = 0; 
        for (String post : posts) {
            if (post.length() >= minLength) {
                totalCount++;
            }
        }
        return totalCount;
    }

    public ArrayList<String> postsWithHashtag(String hashtag) {
        ArrayList<String> result = new ArrayList<>(); 
        for (String post : posts) {
            if (post.contains(hashtag)) {
                result.add(post);
            }
        }
        return result;
    }
}