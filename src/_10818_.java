import java.util.Arrays;
import java.util.Scanner;

public class _10818_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);
        System.out.println(arr[0] + " " + arr[N - 1]);

    }
}
