package 다시풀어보기_Challenge.day3;


//https://www.acmicpc.net/problem/11725

//트리의 부모찾기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class B11725 {
    static ArrayList<Integer> [] graph;
    static  boolean visited[];
    static  int [] ans;
    static  int N;

    static  void  dfs(int idx) {
        visited[idx]=true;
        for (int i = 0; i < graph[idx].size(); i++) {
            int next = graph[idx].get(i);
            if (visited[next] == false) {
                ans[next] =idx;
                dfs(next);
            }
        }


    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        //그래프 초기화
        graph = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }
        visited = new boolean[N + 1];
        ans = new int[N + 1];

        //그래프에 정보 넣기
        for (int i = 0; i < N - 1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            graph[x].add(y);
            graph[y].add(x);
        }

        //dfs 시작 1부터
        dfs(1);



        for (int i = 2; i <= N; i++) {
            System.out.println(ans[i]);
        }
    }

}
