package 다시풀어보기_Challenge;

import java.io.*;
import java.util.*;

//https://www.acmicpc.net/problem/1920
//수 찾기
// 실4
public class B1920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n1 = Integer.parseInt(br.readLine());
        Set<Integer> set1 = new HashSet<>();
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n1; i++) {
            set1.add(Integer.parseInt(st.nextToken()));
        }
        System.out.println(set1);

        int n2 = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n2; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (set1.contains(num)) {
                bw.write("1");
                bw.newLine();
            }else{
                bw.write("0");
                bw.newLine();
            }
        }

        br.close();
        bw.flush();
        bw.close();



        }
    }
