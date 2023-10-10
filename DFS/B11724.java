package DFS;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

/*
https://www.acmicpc.net/problem/11724
연결 요소의 개수


 */
public  class B11724 {
    final  static  int MAX = 1000+10;
    static  boolean [][] map;
    static  boolean [] visited;

    static  int answer;

    static  int N, M;
    static  void  dfs(int idx){
        visited[idx]=true;
        for (int i = 1; i <= N; i++) {
            if (map[idx][i]&&visited[i]==false){
                dfs(i);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st= new StringTokenizer(br.readLine());

        N= Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new boolean[MAX][MAX];
        visited =  new boolean[MAX];


        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int u=  Integer.parseInt(st.nextToken());
            int v= Integer.parseInt(st.nextToken());

            map[u][v]=map[v][u]=true;
        }

        for (int i = 1; i <= N; i++) {
            if (visited[i] == false) {
                dfs(i);
                answer++;
            }
        }
        bw.write(String.valueOf(answer));
        bw.close();
        br.close();

    }
}











//public class B11724 {
//
//    final  static  int MAX =1000+10;
//    static  int N,M, answer=0;
//
//    static boolean [][] map;
//    static  boolean [] visited;
//
//    static  void  dfs(int idx){
//        visited[idx]=true;
//        for (int i = 1; i <= N; i++) {
//            if (map[idx][i] && visited[i]==false) {
//                dfs(i);
//            }
//        }
//
//    }
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        N = Integer.parseInt(st.nextToken());
//        M = Integer.parseInt(st.nextToken());
//
//
//        map = new boolean[MAX][MAX];
//        visited = new boolean[MAX];
//        for(int i=0; i<M; i++){
//            st = new StringTokenizer(br.readLine());
//            int u = Integer.parseInt(st.nextToken());
//            int v = Integer.parseInt(st.nextToken());
//            map[u][v] =map[v][u] =true;
//        }
//
//        for (int i = 1; i <= N; i++) {
//            if (visited[i]==false) {
//                dfs(i);
//                answer++;
//            }
//        }
//
//
//        bw.write(String.valueOf(answer));
//        bw.close();
//        br.close();
//
//    }
//}