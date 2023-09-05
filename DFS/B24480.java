package DFS;


import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

/*
https://www.acmicpc.net/problem/24480

알고리즘 수업 - 깊이 우선 탐색 2


 */
public class B24480 {
    static  int MAX = 100000+10;
    static ArrayList<Integer> [] graph;
    static boolean [] visited;
    static int [] answer;
    static  int order =0;
    static  int N,M,R;

    public  static  void dfs(int idx){
        visited[idx] = true;
        answer[idx]=order;
        order++;

        for (int i = 0; i < graph[idx].size(); i++) {
            int next = graph[idx].get(i);
            if(visited[next] == false)
                dfs(next);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br=  new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());


        //1.그래프에 연결정보채우기
        graph = new ArrayList[MAX];
        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }
        visited = new boolean[MAX];
        answer =new int[MAX];
        order =1;

        for (int i = 0; i < M; i++) {
            st=  new StringTokenizer(br.readLine());
            int u= Integer.parseInt(st.nextToken());
            int v= Integer.parseInt(st.nextToken());
            graph[u].add(v);
            graph[v].add(u);
        }
        //2.각각의 그래프값(즉어래이리스트값을) 내림차순해야함
        for (int i = 1; i <=N; i++) {
            Collections.sort(graph[i],Collections.reverseOrder());
        }

        //dfs호출
        dfs(R);

        //츨력
        for (int i = 1; i <= N; i++) {
                bw.write(String.valueOf(answer[i]));
                bw.newLine();
        }
            bw.flush();
        bw.close();
    }
}
