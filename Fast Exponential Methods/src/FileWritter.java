
import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors


public class FileWritter {

        public static void write(String input, String name) {
            try {
                FileWriter myWriter = new FileWriter("C:\\Users\\Krzysztof\\Desktop\\PRACA INZYNIERSKA\\"+ name +".txt");
                myWriter.write("BEGIN: " + input + "END\n");
                myWriter.close();
                System.out.println("Successfully wrote to the file.");
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }

}
