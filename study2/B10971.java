package study2;
/*

https://www.acmicpc.net/problem/10971

외판원 순회 2
//이해안됌

 */
import javax.swing.plaf.basic.BasicButtonUI;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class B10971 {
    static int N;
    static int[][] W;
    static boolean[] visited;
    static int minCost = Integer.MAX_VALUE;

    public static void dfs(int currentNode, int cost, int count) {
        visited[currentNode]=true;


        if (count == N && W[currentNode][0] > 0) {
            minCost = Math.min(minCost, cost + W[currentNode][0]);
            return;
        }

        for (int i = 0; i < N; i++) {
            if (!visited[i] && W[currentNode][i] > 0) {
                visited[i] = true;
                dfs(i, cost + W[currentNode][i], count + 1);
                visited[i] = false;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());

        W =new int[N][N];
        visited= new boolean[N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                W[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dfs(0, 0, 1);

        System.out.println("Minimum cost: " + minCost);

    }
}