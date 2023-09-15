package DFS;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.Vector;

/*
https://www.acmicpc.net/problem/11725
트리의 부모 찾기

 */
public class B11725 {
    static  int MAX = 100000+10;

    static ArrayList<Integer>[] graph;
    static  boolean visited[];
    static  int N;
    static  int[] answer;

    public static void dfs(int idx) {
        visited[idx] =true;
        for (int i = 0; i < graph[idx].size(); i++) {
            int next =graph[idx].get(i);
            if (visited[next] == false) {
                answer[next]= idx;
                dfs(next);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());

        //그래프 채우기
        graph = new ArrayList[MAX];
        visited = new boolean[MAX];
        answer = new int[MAX];

        //각 N 마다 또 어레이리스트만들고
        for (int i = 1; i <= N; i++) {
            graph[i] =new ArrayList<>();
        }

        for (int i = 0; i < N - 1; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            graph[x].add(y);
            graph[y].add(x);
        }

        dfs(1);//루트 노드 출력

        //정답
        for (int i = 2; i <= N; i++) {
            bw.write(String.valueOf(answer[i]));
            bw.newLine();
        }

        bw.close();
        br.close();
    }



}
