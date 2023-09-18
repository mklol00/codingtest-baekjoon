import java.util.Scanner;

public class _1978_소수찾기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int cnt = 0;
        for (int i = 0; i < T; i++) {
            int S = sc.nextInt();
            boolean isPrime = true;

            if (S == 1) {
                continue;
            }
            for (int j = 2; j <= Math.sqrt(S); j++) {
                if (S % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime == true)
                cnt++;
        }
        System.out.println(cnt);
    }
}