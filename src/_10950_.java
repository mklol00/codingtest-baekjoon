import java.util.Scanner;

public class _10950_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] arr = new int[T];
        for (int i = 0; i < T; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            arr[i] = A + B;
        }


       /* for (int k :
                arr) {
            System.out.println(k);
        }*/

        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }

    }
}