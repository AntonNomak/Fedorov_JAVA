import java.util.Random;

public class Task17 {
    public static void main(String[] args) {
        Random random = new Random();
        int stepMatrix[][] = new int[random.nextInt(10)][random.nextInt(10)+1];
        int number;

        for (int i = 0; i < stepMatrix.length; i++) {
            for (int j = 0; j < stepMatrix[i].length; j++) {
                number = random.nextInt(10)+1;
                stepMatrix[i][j] = number;
            }
        }
        for (int i = 0; i < stepMatrix.length; i++) {
            for (int j = 0; j < stepMatrix[i].length; j++) {
            System.out.print(stepMatrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
