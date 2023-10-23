package jonghaDFSBFS;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

/*
https://www.acmicpc.net/problem/1012
유기농 배추
 */
public class B1012 {
    static int max= 2500+10;
    static  int T ,M, N, K;
    static boolean[][]  map ;
    static  boolean [][] visited;
    static  int count;

    static int [] dirY = {1,-1 ,0,0};
    static int [] dirX = {0 , 0,1,-1};

    static void dfs(int y, int x ) {
        visited[y][x] =true;

        for (int i = 0; i < 4; i++) {
            int newY = y + dirY[i];
            int newX = x + dirX[i];

            if(newY < 0 || newY >= N || newX < 0 || newX >= M)continue;
            if (visited[newY][newX] == false && map[newY][newX] == true) {
                dfs(newY,newX);
            }

        }
    }

    public static void main(String[] args) throws IOException {
        BufferedRead`er br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        T = Integer.parseInt(st.nextToken());

        for (int t = 0; t < T; t++) {
            st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());

            map= new boolean [max][max];
            visited = new boolean[max][max];
            count=0;
            for (int i = 0; i < K; i++) {
                st = new StringTokenizer(br.readLine());
                int x= Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                map[y][x]=true;
            }

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (visited[i][j] == false && map[i][j] == true) {

                        dfs(i,j);
                        count++;
                    }

                }
            }

            System.out.println(count);



        }


    }
}
