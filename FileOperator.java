import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public final class FileOperator {

    private static File myFile;          // The File containing the data
    private static Scanner fileReader;
  
  
   
   public static void createFile(String filename){
    try{
        myFile=new File(filename);
        fileReader = new Scanner(myFile);


   }catch(IOException e){
    System.out.println("There aint nothing");
   }finally{
    System.out.println("continue?");
   }

   
   }

   public ArrayList<String> getStringData(String filename){
    createFile(filename);
    ArrayList<String> result = new ArrayList<String>();
    while (fileReader.hasNextLine()) { 
        result.add(fileReader.nextLine());
    }
    return result;
   }

  }
