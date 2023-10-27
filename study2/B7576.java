package study2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
https://www.acmicpc.net/problem/7576

토마토
 */
public class B7576 {
    static  int [][] map;
    static  boolean [][] visited;
    static  int M,N;

    static  int count;

    static void dfs(int i, int j) {
        if (visited[i][j] || map[i][j] == -1) return;


        visited[i][j]=true;

        //상
        if (i-1>=0 && map[i - 1][j] == 0) {
            map[i - 1][j] = 1;
        }
        //좌
        if (j-1>=0 && map[i][j-1] == 0) {
            map[i][j-1] = 1;
        }
        //하
        if (i+1<N&& map[i + 1][j] == 0) {
            map[i + 1][j] = 1;
        }
        //으
        if (j+1<M &&map[i][j+1] == 0) {
            map[i][j+1] = 1;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken());//가로칸
        N = Integer.parseInt(st.nextToken());

        map =new int[N][M];
        visited = new boolean[N][M];
        count=0;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }


        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (map[i][j] == 1) {
                    dfs(i,j);
                }
            }
        }


    }

}
