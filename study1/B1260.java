package study1;


/*
https://www.acmicpc.net/problem/1260

DFS와 BFS

 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class B1260 {
    static  int max = 1000+10;

    static  boolean [][] graph;
    static  boolean [] visited;
    static  int N, M, V;

    static ArrayList<Integer> queue;


    static  void dfs(int start){
        visited[start]=true;
        System.out.print(start+" ");

        for (int i = 1; i <= N; i++) {
//            if(graph[start][i]&&visited[i]==false){    이렇게 써도되지만. graph[start][i]==true 이라고하면 시간이 단축
            if(graph[start][i]==true&&visited[i]==false){
                dfs(i);
            }
        }
    }

    static  void bfs(){
        queue = new ArrayList<>();
        visited = new boolean[max];  // dfs에서 먼저 썻으니 초기화

        queue.add(V);
        visited[V]=true;

        while (queue.isEmpty()==false){
             int idx = queue.remove(0);
            System.out.print(idx+" ");

            for (int i = 1; i <= N; i++) {
                if(visited[i]==false&&graph[idx][i]==true){
                    queue.add(i);
                    visited[i]=true;
                }

            }
        }


    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());

        graph = new boolean[max][max];
        visited = new boolean[max];
        for (int i = 1; i <= M; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            graph[x][y]= graph[y][x]= true;

        }
        dfs(V);
        System.out.println();
        bfs();


        // 배열 값 출력
        printGraph();

    }

    private static void printGraph() {
        for (int i = 0; i <= N; i++) {
            for (int j = 0; j <= N; j++) {
                System.out.print(graph[i][j] ? 1 : 0);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
