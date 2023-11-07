package DFS;


import java.io.*;
import java.util.StringTokenizer;

/*

https://www.acmicpc.net/problem/16173

점프왕 쩰리

 */
public class B16173 {
    final static  int MAX =100;
    static int map[][];
    static  boolean visited[][];
    static  int N;

    static  int dirY[] ={1,0};
    static  int dirX[]= {0,1};
    public  static  void dfs(int y, int x){
        visited[y][x]=true;

        if(y==N && x ==N){
            return;
        }
        for (int i=0; i<2; i++){
            int newY = y + dirY[i]*map[y][x];
            int newX = x + dirX[i]*map[y][x];
            if(visited[newY][newX]==false){
                dfs(newY,newX);

            }

        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());

        map = new int[MAX][MAX];
        visited = new boolean[MAX][MAX];


        for (int i = 1; i <=N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dfs(1,1);


        if(visited[N][N]) bw.write("HaruHaru");
        else bw.write("Hing");

        bw.close();
        br.close();
    }
}