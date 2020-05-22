import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * App
 */
public class App {

    public static void main(String[] args) throws FileNotFoundException {
        
        File file = new File ("test.txt");

        FileReader fr = new FileReader(file);
    }
}
