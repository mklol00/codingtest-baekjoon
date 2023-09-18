import java.util.Arrays;
import java.util.Scanner;

public class _1546_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];
        int sum = 0;
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        Arrays.sort(arr);
        int M = arr[N - 1];
        float average = (float) sum * 100 / M / N;
        System.out.println(average);
    }
}
