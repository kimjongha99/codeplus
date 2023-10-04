package DFS;


/*
알고리즘 수업 - 깊이 우선 탐색 1 성공
 */
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;


public class B24479 {
    final static  int MAX =100000+10;

    static ArrayList<Integer> [] map;
    static  boolean [] visited;
    static  int [] answer;

    static  int  N,M,R;
    static  int order ;
    public static  void dfs(int idx){
        visited[idx]=true;
        answer[idx]=order;
        order++;

        for (int i = 0; i < map[idx].size(); i++) {
            int next = map[idx].get(i);
            if(visited[next] == false)
                dfs(next);

        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());


        map = new ArrayList[MAX];
        for (int i = 1; i <= N; i++) {
            map[i]= new ArrayList<>();
        }
        visited = new boolean[MAX];
        answer = new int[MAX];
        order=1;

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            map[u].add(v);
            map[v].add(u);
        }

        for (int i = 1; i <= N; i++) {
            Collections.sort(map[i]);
        }

        dfs(R);


        for (int i = 1; i <= N; i++) {
            bw.write(String.valueOf(answer[i]));
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
    }

