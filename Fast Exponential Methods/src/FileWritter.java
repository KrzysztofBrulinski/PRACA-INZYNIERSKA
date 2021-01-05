
import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors


public class FileWritter {

        public static void write(String input, String name) {
            try {
                FileWriter myWriter = new FileWriter(".\\"+ name +".txt");
                myWriter.write(input);
                myWriter.close();
                System.out.println("Successfully wrote to the file.");
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }
}
