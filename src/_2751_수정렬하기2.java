import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class _2751_수정렬하기2 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            arrayList.add(sc.nextInt());
        }
        Collections.sort(arrayList);

        for (Integer c :
                arrayList) {
            sb.append(c).append("\n");
        }
        System.out.println(sb);






        /*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        for (int j : arr) {
            System.out.println(j);
        }

        @@@@@@@@@이렇게 하면 시간초과난다 @@@@@@@@@@@
*/
    }
}
