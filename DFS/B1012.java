package DFS;

import java.io.*;
import java.util.StringTokenizer;

/*
유기농 배추


https://www.acmicpc.net/problem/1072

 */
public class B1012 {
    static  int MAX = 50+10;
    static  boolean map [][];
    static  boolean visited [][];

    static  int T,M,N, K;
    static  int answer =0;
    static int[] dirX = {-1, 1, 0, 0};
    static int[] dirY = {0, 0, -1, 1};

       static void dfs(int k, int j) {  //k는 가로 j는 세로
           visited[j][k] = true;
           for (int i = 0; i < 4; i++) {
           int  newY = j+ dirY[i];
           int  newX = k+ dirX[i];


           if(map[newY][newX]&&visited[newY][newX]==false)
               dfs(newY, newX);
           }
           }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        T = Integer.parseInt(st.nextToken());
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());

            map = new boolean[MAX][MAX];
            visited = new boolean[MAX][MAX];

            //1. 맵정보 반영
            for (int j = 0; j < K; j++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                map[x + 1][y + 1] = true;

            }
            //2. dfs 수정
            for (int k = 1; k <= N; k++) {
                for (int j = 1; j <= M; j++) {
                    if (map[i][j] == true && visited[i][j] == false) {
                        answer++;
                        dfs(k, j);
                    }
                }

            }
            bw.write(String.valueOf(answer));
            bw.newLine();
        }
    }}