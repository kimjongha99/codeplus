package Greedy;


//https://www.acmicpc.net/problem/13975
//파일 합치기3

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class B13975 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine().trim());

        for (int t = 0; t < tc; t++) {
            int n = Integer.parseInt(br.readLine().trim());
            PriorityQueue<Long> file = new PriorityQueue<>();

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                file.add(Long.parseLong(st.nextToken()));
            }

            long ans = 0;
            while (file.size() > 1) {
                long a = file.poll();
                long b = file.poll();
                ans += a + b;
                file.add(a + b);
            }
            System.out.println(ans);
        }

    }
}