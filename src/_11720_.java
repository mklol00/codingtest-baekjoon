import java.util.Scanner;

public class _11720_ {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String number = scanner.next();

        int result = 0;
        for (int i = 0; i < N; i++) {
            result += number.charAt(i) - '0';
        }
        System.out.println(result);
    }
}
