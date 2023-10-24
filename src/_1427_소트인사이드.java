import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class _1427_소트인사이드 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        Integer[] result = new Integer[n.length()];
        for (int i = 0; i < result.length; i++) {
            result[i] = n.charAt(i) - '0';
        }
        Arrays.sort(result,Collections.reverseOrder());
        for (int i :
                result) {
            System.out.print(i);
        }

    }
}

