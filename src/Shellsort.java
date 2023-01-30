import java.util.Random;

public class Shellsort {

    public static void sort(int[] array) {
        int n = array.length;

        int h = 1;
        while (h < n/3) h = 3*h + 1;

        while (h >= 1) {
            for (int i = h; i < n; i++){
                for (int j = i; j >= h && (array[j] < array[j-h]); j -= h) {
                    int swap = array[j-h];
                    array[j-h] = array[j];
                    array[j] = swap;
                }
            }
            h = h/3;
        }

    }

    public static void main(String[] args) {
        int n = 100000;
        int[] a = new int[n];
        for (int i = 0; i <n; i++){
            Random random = new Random();
            a[i] = random.nextInt(n*10);
        }
        long startTime = System.nanoTime();
//        Shellsort.sort(a3);
        Shellsort.sort(a);
//        System.out.println(Arrays.toString(a1));
        long stopTime = System.nanoTime();
        System.out.println("Shellsort sort time: " + (stopTime - startTime) + "ns");
    }
}
