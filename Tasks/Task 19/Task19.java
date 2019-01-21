import java.util.Scanner;

public class Task19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int matrix[][] = new int[4][4];
        int top;
        int bottom;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
       }
        for (int i = 0; i < matrix.length; i++) {
            top = i;
            bottom = matrix.length-i;
            for (int j = 0; j < matrix[i].length; j++) {
                if (top < matrix.length -1) {
                    top = top + 1;
                    matrix[i][top] = matrix[i][top] * 2;
                }
                if (bottom <= matrix.length-1){
                    matrix[i][bottom - (matrix.length-i)] = matrix[i][bottom - (matrix.length-i)] / 2;
                    bottom = bottom + 1;
                }
            }
        }

            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }

    }
}
