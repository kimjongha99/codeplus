package study2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B10451 {

    static  int [] map;
    static  boolean[] visited;
    static  int cycle;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {

            int N = Integer.parseInt(br.readLine());
            map= new int[N+10];
            visited = new boolean[N+10];
            cycle = 0; // reset cycle counter for each test case

            StringTokenizer st = new StringTokenizer(br.readLine()); // read the entire line of numbers
            for (int i = 1; i <= N; i++) { // start loop from 1
                map[i] = Integer.parseInt(st.nextToken());
            }


            for (int i = 1; i <= N; i++) {
                if (visited[i] == false) {
                    dfs(i);
                    cycle++;
                }
            }
            System.out.println(cycle);
        }


    }

     static void dfs(int i) {
        visited[i]= true;

         if (visited[map[i]] == false) {
             dfs(map[i]);
         }
    }
}
