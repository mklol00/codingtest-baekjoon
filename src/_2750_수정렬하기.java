import java.util.Arrays;
import java.util.Scanner;

public class _2750_수정렬하기 {
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
    }
}
