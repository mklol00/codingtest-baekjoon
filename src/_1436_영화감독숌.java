import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class _1436_영화감독숌 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int cnt = 1;
        int num = 666;
        while(cnt != N){
            num++;
            if(String.valueOf(num).contains("666")){
                cnt++;
            }
        }
        System.out.println(num);
    }
}
