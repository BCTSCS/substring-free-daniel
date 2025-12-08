import java.util.*;
public class ListPractice {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("syntax");
        words.add("parser");
        words.add("token");
        words.add("lexical");
        for(String word: words) {
            System.out.println(word);
        }
        for(int i = 0; i < words.size(); i++) {
            String upper = words.get(i).toUpperCase();
            System.out.println(upper);
        }
        for(String word: words) {
            if(word.length() > 5) {
                System.out.println(word);
            }
        }
    }
}

