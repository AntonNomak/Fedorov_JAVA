public class Task07 {
    public static void main(String[] args) {
        int [] arrays = {56,123,23,542,234,653,1245,786,5467,23};
        int sum = 0;

        for (int i = 1; i <arrays.length-1 ; i++) {
            if (arrays[i-1]<arrays[i] && arrays[i] > arrays[i+1]){
                sum++;
            }
        }
        System.out.println(sum);
    }
}
