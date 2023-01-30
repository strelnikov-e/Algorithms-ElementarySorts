import java.util.Arrays;
import java.util.Random;

public class SelectionSort {

    public static void sort(int[] array) {
        int n = array.length;
        int min;
        for (int i = 0; i < n; i++){
            min = i;
            for (int j = i + 1; j<n; j++) {
                if (array[j] < array[min]) min = j;
            }
            int swap = array[i];
            array[i] = array[min];
            array[min] = swap;
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
