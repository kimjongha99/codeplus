package DFS;


import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;
import java.util.Vector;

/*
https://www.acmicpc.net/problem/1260

DFS 와 BFS

 */
public class B1260 {
       static int MAX = 1000 + 10;
        static  boolean [][] graph;
        static  ArrayList<Integer> queue;
        static  boolean [] visited;

        static int N ,M ,V;

        public static  void  dfs(int idx){
            visited[idx] =true;
            System.out.print(idx+" ");
            for (int i = 1; i <= N; i++) {
                if(visited[i]==false &&graph[idx][i]==true ){
                    dfs(i);
                }
            }
        }
        public static  void bfs(){
            visited = new boolean[MAX];
            queue = new ArrayList<>();

            queue.add(V);
            visited[V] = true;

            while (!queue.isEmpty()){
                int idx =queue.remove(0);
                System.out.print(idx+" ") ;

                for (int i = 1; i <= N; i++) {
                    if(visited[i]==false &&graph[idx][i]==true ){

                        queue.add(i);
                        visited[i]=true;
                    }
                }
            }
        }
        public static void main(String[] args) throws IOException {
            //1. 입력정보

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            StringTokenizer st = new StringTokenizer(br.readLine());

            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            V = Integer.parseInt(st.nextToken());

            graph = new boolean[MAX][MAX];
            visited = new boolean[MAX];
            //그래프 채우기
            for (int i = 0; i < M; i++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());

                graph[x][y] = graph[y][x] =true;
            }

            //dfs 출력
            dfs(V);
            System.out.println();
            bfs();
}
}
