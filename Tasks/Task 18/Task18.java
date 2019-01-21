import java.util.Random;

public class Task18 {
    public static void main(String[] args) {

        int matrix1[][] = new int[4][4];
        int matrix2[][] = new int[4][4];
        Random random = new Random();
        int number = random.nextInt(10);
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                matrix1[i][j] = number;
                matrix2[i][j] = number;
                number++;
            }
        }
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        MatrixWorker matrixWorker = new MatrixWorker();
        matrixWorker.sum(matrix1,matrix2);
        System.out.println();
        matrixWorker.mult(matrix1,matrix2);


    }
}
