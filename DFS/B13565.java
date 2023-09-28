package DFS;


import java.io.*;
import java.util.StringTokenizer;
import java.util.Vector;

/*
https://www.acmicpc.net/problem/13565

침투
 */
public class B13565 {
    static  int MAX =1000+10;

    static  boolean map [][] ;
    static  boolean visited[][];

    static  int M,N;  // m-가로 n-세로
    static int dirY[] = {-1, 1, 0, 0};
    static  int dirX[]  = {0,0,-1,1};

    static int T,K;
    static  boolean answer;

    public static  void  dfs(int Y,int X){
        if(Y==N){
            answer =true;
            return;

        }
        visited[Y][X] = true;
        for (int i = 0; i < 4; i++) {
            int newY = Y + dirY[i];
            int newX = X + dirX[i];

            if(map[newY][newX]&&visited[newY][newX]==false){
                dfs(newY,newX);
            }

        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N =Integer.parseInt(st.nextToken());
        M=  Integer.parseInt(st.nextToken());

        map = new boolean[MAX][MAX];
        visited = new boolean[MAX][MAX];


        ///맵 정보 반영
        for (int i = 1; i <= N; i++) {
            String str = br.readLine();
            for (int j = 1; j <= M; j++)
                map[i][j]= (str.charAt(j-1)=='0'?true:false);
        }

            //dfs
            for (int j = 1; j <= M; j++) {
                if(map[1][j]){
                    dfs(1,j);
                }
            }






        if (answer) bw.write("YES");
        else  bw.write("NO");

        bw.flush();
        bw.close();
    }
}
