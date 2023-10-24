import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1259_팰린드롬수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String s = br.readLine();
            StringBuffer sb = new StringBuffer(s);
            String reverse = sb.reverse().toString();
            if (s.equals("0")) break;
            if (s.equals(reverse)) {
                System.out.println("yes");
            }
            else System.out.println("no");


        }

    }
}
