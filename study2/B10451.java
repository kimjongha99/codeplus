package study2;

import java.io.*;
import java.util.StringTokenizer;

public class B10451 {

    static int[] graph;
    static boolean[] visited;
    static int cycle;

    static  void  dfs(int i){
        visited[i]= true;


        if (visited[graph[i]] == false) {
            dfs(graph[i]);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for (int tc = 0; tc < t; tc++) {
            int N = Integer.parseInt(br.readLine());

            graph = new int[N + 10];
            visited = new boolean[N + 10];
            cycle =0;

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 1; i <= N; i++) {
                graph[i] = Integer.parseInt(st.nextToken());
            }

            for (int i = 1; i <= N; i++) {
                if (visited[i] == false) {
                    dfs(i);
                    cycle++;
                }

            }

            bw.write(String.valueOf(cycle));
            bw.newLine();
        }

        bw.close();
        br.close();



    }
}