import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task04 {
    public static void main(String[] args)throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int x = 0;
        int y = 0;

        for (int i = 1; i <11 ; i++) {
            int a = Integer.parseInt(reader.readLine());
            if (i != 5){
                x = x + a;
            }
            y = y + a;
        }
        System.out.println("Пропущенное число - "+ (y - x));
    }
}
