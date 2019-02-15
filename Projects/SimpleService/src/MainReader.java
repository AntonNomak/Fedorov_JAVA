import java.io.FileReader;
import java.io.Reader;
import java.lang.reflect.Array;
import java.util.Arrays;

public class MainReader {
    public static void main(String[] args)throws Exception {
        Reader reader = new FileReader("input_2.txt");
   //     char letter = (char)reader.read();
     //   System.out.println(letter);
        char text[] = new char[100];
        int length = reader.read(text);//ставим переменную для того чтобы заработал Arrays.toString
        //System.out.println(Arrays.toString(text));
        String textOutput = new String(text);
        System.out.println(textOutput);
    }
}
