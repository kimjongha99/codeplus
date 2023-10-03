package DFS;


import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;


public class B24479 {
    static  int MAX =100000+10;
    static ArrayList<Integer> graph[] ;
    static  ArrayList<Integer> queue[];
    static  boolean visited[];

    static  int N,M,R;

    static  int answer[];
    static  int order=0;

    public static  void dfs(int idx){
        visited[idx]=true;
        answer[idx]=order;
        order++;

        for (int i = 0; i < graph[idx].size(); i++) {
            int next = graph[idx].get(i);
            if(visited[next] == false)
             dfs(next);

        }
    }


    public static void main(String[] args) throws IOException {
        //입력초기화
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        N = Integer.parseInt(st.nextToken());
        M =  Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());

        //1.그래프에 연결정보채우기

        graph =  new ArrayList[MAX];
        for (int i = 1; i <= N; i++) {
             graph[i]=new ArrayList<>();

        }
        visited = new boolean[MAX];
        answer =new int[MAX];
        order =1;

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(bf.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            graph[x].add(y);
            graph[y].add(x);
        }

        //2.오름차순정렬
        for (int i = 1; i <= N; i++) {
            Collections.sort(graph[i]);
        }
        //3.dfs호출
        dfs(R);
        bw.newLine();
        //4.bfs 출력
        dfs(R);



        for (int i = 1; i <= N; i++) {
           bw.write(String.valueOf(answer[i]));
           bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}
