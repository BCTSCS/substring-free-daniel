import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<String> data = FileOperator.getStringData("yourtextfile.txt");

        for (String line : data) {
            System.out.println(line);
        }
    }
}
