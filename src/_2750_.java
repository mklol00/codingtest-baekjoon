import java.util.Arrays;
import java.util.Scanner;

public class _2750_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        for (int j : arr) {
            System.out.println(j);
        }
        /*for (int j = 1; j <= arr.length; j++) {
            System.out.println(j);
        }*/

        /*int[]arr2 = {1,2,3,4,5};
        for (int k = 0; k < arr2.length; k++) {
            System.out.println(arr2[k]);
        }*/

    }
}
