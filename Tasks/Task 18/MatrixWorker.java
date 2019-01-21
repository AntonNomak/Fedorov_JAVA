public class MatrixWorker {

    int a[][];
    int b[][];

    public int[][] sum(int a [][], int b[][]) {
         int sum[][] = new int[a.length][a.length];

        for (int i = 0; i < a.length ; i++) {
            for (int j = 0; j < a.length ; j++) {
                sum[i][j] = a[i][j]+b[i][j];
            }
        }
        for (int i = 0; i < sum.length ; i++) {
            for (int j = 0; j <sum.length ; j++) {
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }
        return sum;

    }
    public int[][] mult(int a[][], int b[][]) {
           int mult [][] = new int[a.length][b.length];

        for (int i = 0; i < a.length ; i++) {
            for (int j = 0; j < a.length ; j++) {
               if (a[i][j] ==  0){
                   a[i][j]  = +1;
               }
               if (b[i][j] == 0){
                   b[i][j] = +1;
               }
               mult[i][j] =  a[i][j] * b[i][j];

            }
        }
        for (int i = 0; i < mult.length ; i++) {
            for (int j = 0; j <mult[i].length ; j++) {
                System.out.print(mult[i][j] + " ");
            }
            System.out.println();

        }
        return mult;
    }


}
