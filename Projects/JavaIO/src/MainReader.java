import java.io.FileReader;
import java.io.Reader;

public class MainReader {
    public static void main(String[] args)throws Exception {
        Reader reader = new FileReader("input.txt");
        char letter =(char) reader.read();
        System.out.println(letter);
    }
}
