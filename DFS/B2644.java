package DFS;

import java.io.*;
import java.util.StringTokenizer;

/*

https://www.acmicpc.net/problem/2644

촌수계산

 */
public class B2644 {

    static  int MAX = 100+10;
    static  boolean graph[][];
    static  boolean visited[];
    static  int N ,M ,start ,end , answer;

    public static void dfs(int start,int num){
        visited[start] =true;
        if(start==end){
            answer =num;
            return;
        }
        for (int i = 1; i <= N; i++) {
            if(visited[i]==false && graph[start][i]==true) {
                dfs(i,num+1);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N =Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        start = Integer.parseInt(st.nextToken());
        end =  Integer.parseInt(st.nextToken());
        st= new StringTokenizer(br.readLine());
        M=  Integer.parseInt(st.nextToken());
        //그래프채우기
        graph =new boolean[MAX][MAX];
        visited = new boolean[MAX];
        answer =-1;
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            graph[x][y] = graph[y][x] = true;
        }

        //dfs 출력
        dfs(start,0);

        bw.write(String.valueOf(answer) );

        bw.close();
        br.close();
    }
}
