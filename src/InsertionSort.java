import java.util.Arrays;
import java.util.Random;

public class InsertionSort {

    public static void sort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n; i++){
            for (int j = i; j > 0; j--) {
                if (array[j] < array[j-1]){
                    int swap = array[j-1];
                    array[j-1] = array[j];
                    array[j] = swap;
                }
            }

        }
    }

    public static void main(String[] args) {
        int n = 10;
        int[] array = new int[n];
        for (int i = 0; i <n; i++){
            Random random = new Random();
            array[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(array));
        sort(array);
        System.out.println(Arrays.toString(array));
    }
}
