import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] array1 = scanner.nextLine().toCharArray();
        char[] array2 = scanner.nextLine().toCharArray();
        int countArray1;
        int countIndex = 0;

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == array2[0]){
                countArray1 = i;
                for (int j = 0; j <array2.length ; j++) {
                    if(array2[j] == array1[countArray1]) {
                        countIndex++;
                        countArray1++;
                        if (countIndex == array2.length){
                            System.out.println(countArray1 - countIndex);
                            return;
                        }
                    }
                    else {
                        countIndex = 0;
                        countArray1 = 0;
                    }
                }
            }
        }
        System.out.println(-1);
    }
}
