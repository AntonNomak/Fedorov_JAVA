import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task01 {
    public static void main(String[] args)throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = Integer.parseInt(reader.readLine());
        int fiveThousand = sum / 5000;
        sum %= 5000;
        int twoThousand = sum/2000;
        sum %= 2000;
        int oneThousand  = sum/1000;
        sum %= 1000;
        int fiveHundred = sum/500;
        sum %= 500;
        int hundred = sum/100;
        sum %= 100;
        int fifty = sum/50;
        int smallСhange = sum%50;
        System.out.println("5000 - " + fiveThousand);
        System.out.println("2000 - " + twoThousand);
        System.out.println("1000 - " + oneThousand);
        System.out.println("500 - " + fiveHundred);
        System.out.println("100 - " + hundred);
        System.out.println("50 - " + fifty);
        System.out.println("small change - " + smallСhange);
    }
}

