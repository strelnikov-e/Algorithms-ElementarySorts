import java.util.Arrays;
import java.util.Random;

public class Shuffle {
    static Random random = new Random();

    public static void shuffle(int[] a) {
        int n = a.length;
        for (int i  = 0; i < n; i++) {
            int r = random.nextInt(i+1);
            exch(a,i,r);
        }
    }

    private static void exch(int[] array, int k, int l) {
        int swap = array[k];
        array[k] = array[l];
        array[l] = swap;
    }

    public static void main(String[] args) {
        int n = 10;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = i;
        }
        System.out.println(Arrays.toString(a));
        shuffle(a);
        System.out.println(Arrays.toString(a));
    }
}
