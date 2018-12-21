public class Task05 {
    public static void main(String[] args) {
        int[] array ={55,45,484,-1,248};
        int max = array[0];
        int min = array[0];
        for (int i = 0; i <array.length; i++) {
            if (array[i] > max){
                max = array[i];
            }
            if (array[i]<min){
                min = array[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
