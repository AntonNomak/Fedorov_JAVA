
import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int position = 0;
        int composition = 1;
        int currentDigit;
        int candidate = 0;
        int  x = 0;
        while (number !=-1) {
            while (number != 0) {
                currentDigit = number % 10;
                number = number / 10;
                candidate = candidate + currentDigit;
            }
           int divider = 2;
            while (divider * divider <= candidate ){
                if(candidate % divider == 0){
                    break;
                }
                else {
                    x = 1;
                }
                divider++;
            }
            if (x == 1) {
                if (composition == 0) {
                    composition = composition + 1;
                }
                System.out.println(position);
                composition = composition * position;
            }
            position++;
            candidate = 0;
            x = 0;
            number = scanner.nextInt();
        }
        System.out.println(composition);
    }
}