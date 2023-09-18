import java.util.Arrays;
import java.util.Scanner;

public class _4153_직각삼각형 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int[] arr = new int[3];
            arr[0] = scanner.nextInt();
            arr[1] = scanner.nextInt();
            arr[2] = scanner.nextInt();
            Arrays.sort(arr);
            if(arr[0] == 0 && arr[1] == 0 & arr[2] == 0) break;
            else if (arr[0]*arr[0] + arr[1]*arr[1] == arr[2] * arr[2]) {
                System.out.println("right");

            }
            else
                System.out.println("wrong");
        }
    }
}
