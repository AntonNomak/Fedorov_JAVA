import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;

public class MainBufferReader {
    public static void main(String[] args)throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("input3.txt"));

        String surname = bufferedReader.readLine();
        String name = bufferedReader.readLine();
        int age = Integer.parseInt(bufferedReader.readLine());
        System.out.println(surname);
        System.out.println(name);
        System.out.println(age);
    }
}
