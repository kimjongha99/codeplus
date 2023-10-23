package jonghaDFSBFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/*
DFS와 BFS

https://www.acmicpc.net/problem/1260
 */
public class B1260 {

    static  int max= 10000+10;
    static  int N, M , V;

    static  int graph[][] ;
    static  boolean visited[] ;

    static  void dfs(int v){
        visited[v]=true;
        System.out.print(v+" ");

        for (int i = 1; i <= N; i++) {
            if(graph[v][i]==0) continue;

            if(visited[i]==true)continue;

            dfs(i);
        }

    }

    static void bfs(int v) {
        visited = new boolean[max];
        Queue<Integer> que = new LinkedList<>();

        que.add(v);
        visited[v]=true;

        while (que.isEmpty() == false) {
            int x= que.poll();

            System.out.print(x+" ");

            for (int i = 1; i <= N; i++) {
                if (graph[v][i]==0)continue;
                if(visited[i]==true) continue;

                que.add(i);
                visited[i]=true;
            }
        }

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M =Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());

        graph= new int[max][max];
        visited = new boolean[max];
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            graph[x][y]=graph[y][x]=1; // 수정된 부분
        }

        dfs(V);
        System.out.println();
        bfs(V);
        System.out.println();
        printGraph();

    }

    public static void printGraph() {
        for(int i = 1; i <= N; i++) {
            for(int j = 1; j <= N; j++) {
                System.out.print(graph[i][j] + " ");
            }
            System.out.println();
        }
    }
}
