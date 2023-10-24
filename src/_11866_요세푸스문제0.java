import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _11866_요세푸스문제0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();
        int N = sc.nextInt();
        int K = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }
        StringBuilder sb = new StringBuilder();
        sb.append('<');
        while(queue.size() > 1){
            for (int i = 0; i < K - 1; i++) {
                int val = queue.poll();
                queue.offer(val);
            }
            sb.append(queue.poll()).append(", ");
        }
        sb.append(queue.poll()).append('>');
        System.out.println(sb);

    }
}
