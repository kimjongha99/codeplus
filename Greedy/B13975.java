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
        int tc = Integer.parseInt(br.readLine());

        for (int t = 0; t < tc; t++) {
            int n = Integer.parseInt(br.readLine());
            PriorityQueue<Long> queue = new PriorityQueue<>();
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                queue.offer(Long.parseLong(st.nextToken()));
            }
            int ans =0;
            for (int i = 0; i < n - 1; i++) {
                long a = queue.poll();
                long b = queue.poll();
                ans+=a+b;
                queue.add(a+b);
            }
            System.out.println(ans);
        }



    }

}
