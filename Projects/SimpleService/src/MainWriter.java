import java.io.FileWriter;
import java.io.Writer;
import java.util.Scanner;

public class MainWriter {
    public static void main(String[] args)throws Exception {
        Writer writer = new FileWriter("output2.txt");
       // writer.write('Ф');
       // writer.close();
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        char charIsText[] = text.toCharArray();
        writer.write(text);
        writer.close();
    }
}
