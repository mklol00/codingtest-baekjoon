import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.Arrays;

public class _11650_좌표정렬 {
    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int N = Integer.parseInt(br.readLine());

            int arr[][] = new int[N][2];

            for (int i = 0; i < N; i++) {
                String text[] = br.readLine().split(" ");
                arr[i][0] = Integer.parseInt(text[0]);
                arr[i][1] = Integer.parseInt(text[1]);
            }

            Arrays.sort(arr, (x, y) -> {
                if (x[0] == y[0]) {
                    return x[1] - y[1];
                } else {
                    return x[0] - y[0];
                }
            });

            for (int j = 0; j < N; j++) {
                System.out.println(arr[j][0] + " " + arr[j][1]);
            }

        } catch (IOException e) {
            System.out.println("error");
        }
    }
}
