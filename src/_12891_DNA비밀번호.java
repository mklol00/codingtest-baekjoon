import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _12891_DNA비밀번호 {
    static int[] checkArr;
    static int[] mykArr;
    static int checkSecret;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int S = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        int result = 0;
        checkArr = new int[4];
        mykArr = new int[4];
        char[] A = new char[S];
        checkSecret = 0;

        A = br.readLine().toCharArray();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) {
            checkArr[i] = Integer.parseInt(st.nextToken());
            if (checkArr[i] == 0) {
                checkSecret++;
            }
        }
        for (int i = 0; i < P; i++) {
            Add(A[i]);
        }
        if(checkSecret == 4){
            result++;
        }
        for (int i = P; i < S; i++) {
            int j = i -P;
            Add(A[i]);
            Remove(A[j]);
            if(checkSecret == 4){
                result++;
            }
        }
        System.out.println(result);
    }
    private static void Add(char c){
        switch (c){
            case 'A':
                mykArr[0]++;
                if(mykArr[0]==checkArr[0]) checkSecret++;
                break;
            case 'C':
                mykArr[1]++;
                if(mykArr[1]==checkArr[1]) checkSecret++;
                break;
            case 'G':
                mykArr[2]++;
                if(mykArr[2]==checkArr[2]) checkSecret++;
                break;
            case 'T':
                mykArr[3]++;
                if(mykArr[3]==checkArr[3]) checkSecret++;
                break;

        }
    }
    private static void Remove(char c){
        switch (c){
            case 'A':
                if(mykArr[0]==checkArr[0]) checkSecret--;
                mykArr[0]--;
                break;
            case 'C':
                if(mykArr[1]==checkArr[1]) checkSecret--;
                mykArr[1]--;
                break;
            case 'G':
                if(mykArr[2]==checkArr[2]) checkSecret--;
                mykArr[2]--;
                break;
            case 'T':
                if(mykArr[3]==checkArr[3]) checkSecret--;
                mykArr[3]--;
                break;

        }
    }
}
