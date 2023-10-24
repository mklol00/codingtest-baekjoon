import java.io.*;
import java.util.*;

public class _10866_덱 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String state = st.nextToken();

            if (state.equals("push_front")) {
                int num = Integer.parseInt(st.nextToken());
                deque.addFirst(num);
            } else if (state.equals("push_back")) {
                int num = Integer.parseInt(st.nextToken());
                deque.add(num);
            } else if (state.equals("pop_front")) {
                if (deque.size() == 0)
                    bw.append(-1 + "\n");
                else {
                    int num = deque.poll();
                    bw.append(num + "\n");
                }
            } else if (state.equals("pop_back")) {
                if (deque.size() == 0)
                    bw.append(-1 + "\n");
                else {
                    int num = deque.pollLast();
                    bw.append(num + "\n");
                }
            } else if (state.equals("size"))
                bw.append(deque.size() + "\n");
            else if (state.equals("empty")) {
                if (deque.size() == 0)
                    bw.append(1 + "\n");
                else
                    bw.append(0 + "\n");
            } else if (state.equals("front")) {
                if (deque.size() == 0)
                    bw.append(-1 + "\n");
                else {
                    int num = deque.getFirst();
                    bw.append(num + "\n");
                }
            } else if (state.equals("back")) {
                if (deque.size() == 0)
                    bw.append(-1 + "\n");
                else {
                    int num = deque.getLast();
                    bw.append(num + "\n");
                }
            }
        }

        bw.flush();

    }
}