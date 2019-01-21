public class Task08 {
    public static void main(String[] args) {
        int [] array = {24,56,12,63,98,34};
        int x;
        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j <array.length ; j++) {
                if(array[j] > array[i]){
                    x = array [j];
                    array[j] = array[i];
                    array[i] = x;
                }
            }
        }
        for (int i = 0; i <array.length ; i++) {
            System.out.println(array[i]);
        }
    }
}
