import java.util.Scanner;

public class _11720_ {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String sNum = sc.next();
        char[] cNum = sNum.toCharArray();
        int sum = 0;
        for (int i = 0; i < sNum.length(); i++) {
            sum += cNum[i] - '0';
        }
        System.out.println(sum);


    }

}
/*

import java.util.Scanner;

public class Main {

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
*/
