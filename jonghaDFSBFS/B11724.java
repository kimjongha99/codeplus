package jonghaDFSBFS;


import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

/*
https://www.acmicpc.net/problem/11724

연결요소의 개수
 */
public class B11724 {
    static  int max= 1000+10;
    static  int N, M;
    static  boolean [] visited;

    static ArrayList<Integer> arrayList[];
    static  int ans;

    static  void dfs(int idx){
        visited[idx]=true;


        for (int i = 0; i < arrayList[idx].size(); i++) {
            int n = arrayList[idx].get(i);
            if (!visited[n]) {
                dfs(n);
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arrayList = new ArrayList[max];
        for (int i = 0; i <=N; i++) {
            arrayList[i]= new ArrayList<>();
        }

        visited = new boolean[max];
        ans = 0;

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            arrayList[x].add(y);
            arrayList[y].add(x);

        }

        for (int i = 1; i <= N; i++) {
            if(visited[i]==true)continue;
            dfs(i);
            ans++;
        }

        bw.write(String.valueOf(ans));

        bw.close();
        br.close();
    }
}
