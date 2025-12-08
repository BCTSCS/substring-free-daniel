import java.util.ArrayList;

public class ListPractice {
    public static void main(String[] args) {
        
        ArrayList<String> wordList = new ArrayList<>();
        wordList.add("syntax");
        wordList.add("parser");
        wordList.add("token");
        wordList.add("lexical");

        System.out.println("SON!");
        for (String word : wordList) {
            System.out.println(word);
        }

        System.out.println("loop");
        for (int i = 0; i < wordList.size(); i++) {
            String upperWord = wordList.get(i).toUpperCase();
            System.out.println(i + ": " + upperWord);
        }

        System.out.println("disk manager");
        for (String word : wordList) {
            if (word.length() > 5) {
                System.out.println(word);
            }
        }
    }
}