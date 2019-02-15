import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class MainBufferedWriter {
    public static void main(String[] args) throws Exception{

        BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
        writer.newLine();
        writer.write("Привет");
        writer.newLine();
        writer.close();

    }
}
