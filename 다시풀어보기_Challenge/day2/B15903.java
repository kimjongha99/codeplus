package 다시풀어보기_Challenge.day2;


//https://www.acmicpc.net/problem/15903

// 카드 합체


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class B15903{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        PriorityQueue<Long> pq = new PriorityQueue<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            pq.add(Long.parseLong(st.nextToken()));
        }


        for (int i = 0; i < m; i++) {
            long n1 = pq.poll();
            long n2 = pq.poll();
            long combined = n1 + n2;
            pq.add(combined);
            pq.add(combined);
        }

        long sum = 0;
        for (Long num : pq) {
            sum += num;
        }
        System.out.println(sum);
    }
}
