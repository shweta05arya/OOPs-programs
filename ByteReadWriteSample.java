import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteReadWriteSample {
    public static void main(String[] args) {
        
        try (FileInputStream fis = new FileInputStream("Sample1.txt");
             FileOutputStream fos = new FileOutputStream("Sample1Copy.txt")) {

            int i;
            while ((i = fis.read()) != -1) {
                System.out.print((char) i); 
               fos.write(i);               
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}