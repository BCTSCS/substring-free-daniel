public class BlogRunner {
  public static void main(String[] args) {
      
      // 1. Instantiate a new Blog object with a title and date
      Blog myPost = new Blog("My First Java Program", "05/20/2024");

      // 2. Call the getYear() method
      String year = myPost.getYear();

      // 3. Print the result
      System.out.println("The blog was published in: " + year);
      
      // Optional: Print the full blog details
      System.out.println(myPost.toString());
  }
}