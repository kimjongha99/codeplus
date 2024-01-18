package 다시풀어보기_Challenge.day2;


//비밀번호 찾기 


//https://www.acmicpc.net/problem/17219
import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class B17219 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashMap<String ,String > hashMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String key = st.nextToken();
            String value = st.nextToken();
            hashMap.put(key,value);
        }

        for (int i = 0; i < m; i++) {
            String key = br.readLine();
            bw.write(hashMap.get(key));
            bw.newLine();
        }

        bw.close();
        br.close();
    }
}
