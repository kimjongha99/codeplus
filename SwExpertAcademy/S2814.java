package SwExpertAcademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
최장경로

https://swexpertacademy.com/main/code/problem/problemDetail.do?problemLevel=3&contestProbId=AV7GOPPaAeMDFAXB&categoryId=AV7GOPPaAeMDFAXB&categoryType=CODE&problemTitle=&orderBy=RECOMMEND_COUNT&selectCodeLang=JAVA&select-1=3&pageSize=10&pageIndex=2


 */
public class S2814 {
    static int [][] map;
    static  boolean []visited;

    static  int N , M;
    static int max = 0;

    static void dfs(int v, int cnt) {
//더 이상 방문할 노드가 없음
        max = Math.max(max , cnt);
        //모든 노드 중에 나와 간선이 존재하고, 아직 방문하지 않은 노드라면 방문
        for(int i = 1; i <= N; i++) {
            if(map[v][i] == 1 && !visited[i]) {
                visited[i] = true;
                dfs(i, cnt + 1);
                visited[i] = false;
            }
        }
    }



        public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int tc = Integer.parseInt(br.readLine());
            for(int t = 1; t <= tc; t++) {
                StringTokenizer st = new StringTokenizer(br.readLine(), " "); // Tokenize the first line

                N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());


        map = new int[N+1][N+1];
        visited = new boolean[N+1];
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " "); // Tokenize each subsequent line
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            map[x][y]=map[y][x]=1;
        }

        for(int i = 1; i <= N; i++) {
            visited[i] = true;
            dfs(i, 1);
            visited[i] = false;
        }
        System.out.println("#" + t + " " + max);

    }

}
}