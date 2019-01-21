/*
Пусть есть число в диапазоне 0 ... 255


        ```
int number = 137;
```

        Необходимо вывести в двоичном представлении.
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task02 {
    public static void main(String[] args)throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число в дипазоне от 0 до 255");
        int x = Integer.parseInt(reader.readLine());
        System.out.println(Integer.toBinaryString(x));

    }
}
