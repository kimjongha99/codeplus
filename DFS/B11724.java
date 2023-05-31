package DFS;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

/*
https://www.acmicpc.net/problem/11724
연결 요소의 개수


 */
public class B11724 {
    static ArrayList<Integer>[] a;
    static boolean visited[];

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        a = new ArrayList[n + 1];
        visited = new boolean[n + 1];

        for (int i = 1; i < n + 1; i++) { // 인접리스트 초기화
            a[i] = new ArrayList<Integer>();
        }
        for (int i = 1; i < m; i++) {
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            a[u].add(v);// 양 방향 간선이므로 양쪽으로 간선을 더 해준다
            a[v].add(u);
        }
        int count = 0;
        for (int i = 1; i < n + 1; i++) {
            if (!visited[i]) {
                count++;
                DFS(i);
            }
        }
        System.out.println(count);
    }

    private static void DFS(int v) {
        if (visited[v]) {
            return;
        }
        visited[v] = true;
        for (int i : a[v]) {
            if (visited[i] == false) { // 연결 정점 중 방문하지 않았던 정점만 탐색함
                DFS(i);
            }
        }
    }
}