package jonghaDFSBFS;

import java.io.*;
import java.util.*;

public class B1260_list {
    static int N, M, V;
    static ArrayList<Integer>[] adj;
    static boolean[] visit;

    static void dfs(int V) {
        visit[V] = true;
        System.out.print(V+" ");

        // x 에서 갈 수 있는 곳들을 작은 번호부터 모두 방문한다.
        for (int y: adj[V]){

            // y 를 이미 갈 수 있다는 사실을 안다면, 굳이 갈 필요 없다.
            if (visit[y])
                continue;

            // y에서 갈 수 있는 곳들도 확인 해보자
            dfs(y);
        }
    }
    static  void bfs(int V){
        visit = new boolean[N+1];

        Queue<Integer> queue = new LinkedList<>();

        // start 를 que에 넣어줌
        queue.add(V);
        visit[V]= true;

        while (queue.isEmpty() == false) {
            int x = queue.poll();
            System.out.print(x+" ");

            for (int i = 0; i < adj[x].size(); i++) {
                int y = adj[x].get(i);
                if(visit[y]==true)continue;

                queue.add(y);

                visit[y]=true;
            }


        }

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());

        adj = new ArrayList[N+1];
        visit =new boolean[N+1];

        for (int i = 0;i <= N; i++)
            adj[i] = new ArrayList<>();


        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            adj[x].add(y);
            adj[y].add(x);

        }
        for (int i = 1; i <= N; i++) {
            Collections.sort(adj[i]);
        }

        dfs(V);
        System.out.println();
        bfs(V);
    }
}
