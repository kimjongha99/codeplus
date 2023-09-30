package DFS;


import java.io.*;
import java.util.StringTokenizer;

/*
섬의 개수
https://www.acmicpc.net/problem/4963
 */
public class B4963 {
     final static  int MAX = 50+10;
     static  boolean [][] map ;
     static  boolean [][] visited ;
     static  int  w,h;

     static  int dirY[] = {-1,-1,0,1,1,1,0,-1};
     static  int dirX[] = {0,1,1,1,0,-1,-1,-1};
     static void dfs(int y, int x){
         visited[y][x]=true;

         for (int i = 0; i < 8; i++) {
             int newY = y + dirY[i];
             int newX = x + dirX[i];

             if(map[newY][newX]&&visited[newY][newX]==false){
                 dfs(newY,newX);
             }
         }

     }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            w =Integer.parseInt(st.nextToken());
            h= Integer.parseInt(st.nextToken());

            if (w == 0 && h == 0) {
                break;
            }

            map = new boolean[MAX][MAX];
            visited = new boolean[MAX][MAX];


            //1.map정보 반영
            for (int i = 1; i <= h; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 1; j <= w; j++) {
                    map[i][j]= Integer.parseInt(st.nextToken())==1;
                }
            }

            //2.dfs 수행
            int answer =0;
            for (int i = 1; i <= h; i++) {
                for (int j = 1; j <= w; j++) {
                    if(map[i][j]&&visited[i][j]==false){
                        dfs(i,j);
                        answer++;
                    }
                }
            }

            //츨력

            bw.write(String.valueOf(answer));
            bw.newLine();

        }

        bw.flush();
        bw.close();
    }
}
