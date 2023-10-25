package jonghaDFSBFS;


import java.io.*;
import java.util.StringTokenizer;

/*

https://www.acmicpc.net/problem/4963
섬의 개수

 */
public class B4963 {
    static  int max =250+10;
    static  boolean [][] map;
    static  boolean [][] visited;
    static  int ans;
    static  int W,H;
    static int[] dirY = {1,1,0,-1,-1,-1,0 ,1};
    static  int [] dirX ={0,1,1,1,0,-1,-1 ,-1};

    static void dfs(int y, int x) {
        visited[y][x]=true;

        for (int i = 0; i < 8; i++) {
            int newY = y + dirY[i];
            int newX = x + dirX[i];

            if (newY >= 0 && newY < H && newX >= 0 && newX < W && map[newY][newX] == true && visited[newY][newX] == false) {
                dfs(newY,newX);
            }
        }
    }
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true){
            StringTokenizer st = new StringTokenizer(br.readLine());



            map = new boolean[max][max];
            visited = new boolean[max][max];
            ans= 0;
            W = Integer.parseInt(st.nextToken());
            H = Integer.parseInt(st.nextToken());
            if(W==0 && H==0){
                break;
            }
            for (int i = 0; i < H; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < W; j++) {
                    map[i][j] = Integer.parseInt(st.nextToken())==1;
                }
            }

            for (int i = 0; i < H; i++) {
                for (int j = 0; j < W; j++) {
                    if (visited[i][j] == false&& map[i][j]==true) {
                         dfs(i,j);
                        ans++;

                    }
                }
            }

            bw.write(String.valueOf(ans));
            bw.newLine();


        }
        bw.close();
        br.close();
    }
}
