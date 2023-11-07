package boj1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
https://www.acmicpc.net/problem/11945
뜨거운 붕어빵

 */
public class B11945 {

    static int N,M;
    static  int [][] map;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new int[N][M];

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < M; j++) {
                map[i][j] = str.charAt(j)-'0';
            }
        }


        // 모든 행에 대해 이진수를 좌우로 뒤집습니다.
        for(int i = 0; i < map.length; i++) {
            int start = 0;
            int end = map[i].length - 1;
            while(start < end) {
                int temp = map[i][start];
                map[i][start] = map[i][end];
                map[i][end] = temp;
                start++;
                end--;
            }
        }

        // Printing the flipped binary numbers
        for(int i = 0; i < map.length; i++) {
            for(int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j]);
            }
            System.out.println();
        }
    }


}
