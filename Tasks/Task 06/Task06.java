public class Task06 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int x;
        for (int i = 0; i < array.length / 2; i++) {
            x = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1-i] = x;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}

