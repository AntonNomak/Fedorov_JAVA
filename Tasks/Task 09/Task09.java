import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       char[] array = scanner.nextLine().toCharArray();
       int x = 0;
        for (int i = 0; i <array.length ; i++) {
            System.out.println(array[i]);
            x = x + (int)array[i] - '0';
            x = x*10;
        }
        x = x/10;
        System.out.println(x);
    }
}
