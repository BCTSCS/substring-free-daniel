import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.ArrayList;

// public final class FileOperator{
//     private static File myFile;
//     private static Scanner fileReader;

//     public static ArrayList<String> getStringData(String filename) {
//         ArrayList<String> list = new ArrayList<>();
//         try{
//             myFile = new File(filename);
//             fileReader = new Scanner(myFile);

//             while(fileReader.hasNextLine()){
//                 list.add(fileReader.nextLine());
//             }
//         }catch(FileNotFoundException e){
//             System.out.println("Error");
//         }finally{
//         //     if (fileReader != null) {
//         //         fileReader.close();
//         //     }
//         System.out.println("continue");
//         }
//         return list;
//     }
// }

public final class FileOperator{
    private static File myFile;
    private static Scanner fileReader;

    public static void createFile(String filename) {
        public ArrayList<String> getStringData(String filename) {
            createFile(filename);
            ArrayList<String> list = new ArrayList<>();
    
            while(fileReader.hasNextLine()){
                list.add(fileReader.nextLine());
            }
        //     if (fileReader != null) {
        //         fileReader.close();
        //     }
        return list;
    }
}