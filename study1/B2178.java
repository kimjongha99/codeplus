package study1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
https://www.acmicpc.net/problem/2178
미로 탐색
 */
public class B2178 {
    static  int N ,M;
    static  int max = 10000+10;
    static  int map[][];
    static  boolean visited[][];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map= new int[max][max];
        visited = new boolean[max][max];

        for (int i = 1; i <= N; i++) {
            String s = br.readLine();
            for (int j = 1; j <= M; j++) {
                map[i][j]= s.charAt(j-1)-'0';
            }
        }


        String x = "9";
        System.out.println(x.charAt(0)-'0'); // 문자로표현된 숫자를 정수로바ㅆ뀔떄

// Print the map
        printMap();

    }
    public static void printMap() {
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= M; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }
}
