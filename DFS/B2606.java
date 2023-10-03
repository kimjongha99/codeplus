package DFS;


import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

/*
https://www.acmicpc.net/problem/2606

바이러스

 */
public class B2606 {
    final  static  int MAX =100+10;

    static  boolean [][] map;
    static  boolean [] visited;
    static  int N,M;
    static  int answer;

    static  void  dfs(int idx) {
        visited[idx] =true;
        answer++;

        for (int i = 1; i <= N; i++) {
            if (map[idx][i] && visited[i] == false) {
                dfs(i);
            }
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N= Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());

        map= new boolean[MAX][MAX];
        visited = new boolean[MAX];

        for (int i = 0; i < M; i++) {
            StringTokenizer st  = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            map[x][y] = map[y][x] =true;

        }

        dfs(1);


        bw.write(String.valueOf(answer-1));

        bw.close();
        br.close();

    }
}
