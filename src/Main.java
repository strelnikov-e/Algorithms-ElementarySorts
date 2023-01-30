
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int n = 10000;
        int[] a1 = new int[n];
        for (int i = 0; i <n; i++){
            Random random = new Random();
            a1[i] = random.nextInt(n*10);
        }
        int[] a2 = Arrays.copyOf(a1,n);
        int[] a3 = Arrays.copyOf(a1,n);

        long startTime = System.nanoTime();
        SelectionSort.sort(a1);
        long stopTime = System.nanoTime();
        System.out.println("Selection sort time: " + (stopTime - startTime) + "ns");

        startTime = System.nanoTime();
        InsertionSort.sort(a2);
        stopTime = System.nanoTime();
        System.out.println("Insertion sort time: " + (stopTime - startTime) + "ns");

        startTime = System.nanoTime();
        Shellsort.sort(a3);
        stopTime = System.nanoTime();
        System.out.println("Shellsort sort time: " + (stopTime - startTime) + "ns");
    }

    /*
    Selection sort time: 3524550708ns
    Insertion sort time: 5607375334ns
    Shellsort sort time: 7551689083ns
     */

}