import java.io.*;
import java.util.*;

public class _10845_큐 {
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Queue<Integer> queue = new LinkedList<Integer>();
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());
        int bottomValue = 0;
        for (int i = 0; i < N; i++) {
            String command = br.readLine();
            if (command.equals("pop")) {
                if (queue.isEmpty()) bw.write("-1\n");
                else bw.write(queue.poll() + "\n");
            } else if (command.equals("size"))
                bw.write(queue.size() + "\n");
            else if (command.equals("empty"))
                bw.write((queue.isEmpty() ? 1 : 0) + "\n");
            else if (command.equals("front")) {
                bw.write((queue.isEmpty() ? -1 : queue.peek()) + "\n");
            } else if (command.equals("back")) {
                bw.write((queue.isEmpty() ? -1 : bottomValue) + "\n");
            } else {
                st = new StringTokenizer(command, " ");
                String temp = st.nextToken();
                int num = Integer.parseInt(st.nextToken());
                bottomValue = num;
                queue.add(num);
            }
        }
        bw.flush();
    }
}