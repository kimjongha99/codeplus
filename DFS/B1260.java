package DFS;


import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

/*
https://www.acmicpc.net/problem/1260

DFS 와 BFS

 */
public class B1260 {

        static  int MAX = 1000+10;
        static  boolean[][] graph;
        static  boolean[]  visited;
        static  int N, M ,V;

        static  ArrayList<Integer> queue;;



         static  void  dfs(int idx){
            visited[idx] =true;
            System.out.print(idx+" ");
            for (int i = 1; i <= N; i++) {
                if(visited[i]==false && graph[idx][i]==true)
                dfs(i);
            }

        }
         static  void bfs(){
            visited = new boolean[MAX];
            queue = new ArrayList<>();
            queue.add(V);
            visited[V] =true;

            while (!queue.isEmpty()){
                int idx =   queue.remove(0);
                System.out.print(idx+" ");

                for (int i = 1; i <= N; i++) {
                    if(visited[i]==false && graph[idx][i]==true) {
                        queue.add(i);
                        visited[i] = true;
                    }
                }
            }

        }
        public static void main(String[] args) throws IOException {
            //1. 입력정보
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());

             N = Integer.parseInt(st.nextToken());
             M =  Integer.parseInt(st.nextToken());
             V =  Integer.parseInt(st.nextToken());
            //그래프 채우기
            graph= new boolean[MAX][MAX];
            visited = new boolean[MAX];
            for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                graph[x][y] = graph[y][x] = true;

            }
            //dfs 출력

            dfs(V);
            System.out.println();
            bfs();



}
}
