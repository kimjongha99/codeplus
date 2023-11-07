package study1;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class B2667 {
    static int max = 265+10;
    static int  N;
    static boolean map[][];
    static  boolean visited[][];
    static  int countDangi;

    static int dirY[] = {-1,1,0,0};
    static  int dirX[] = {0,0,-1,1};

    public static void dfs(int y,int x) {
        visited[y][x] = true;
        countDangi++;

        for (int i = 0; i < 4; i++) {
            int newY = y + dirY[i];
            int newX = x + dirX[i];
            if (map[newY][newX] && visited[newY][newX] == false) {
                dfs(newY, newX);
            }

        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());


        map = new boolean[max][max];
        visited = new boolean[max][max];


        for (int i = 1; i <= N; i++) {
            String str = br.readLine();
            for (int j = 1; j <= N; j++) {
                map[i][j]= str.charAt(j-1) =='1'? true:false;
            }
        }



            ArrayList<Integer> countList = new ArrayList<>();

            for (int i = 1; i <= N; i++) {
                for (int j = 1; j <= N; j++) {
                    if (map[i][j] && visited[i][j] == false) {
                        countDangi =0;
                        dfs(i, j);
                        countList.add(countDangi);
                    }
                }
            }

        bw.write(String.valueOf(countList.size()));
        bw.newLine();
        Collections.sort(countList);


        for(int i=0;i<countList.size();i++){
            bw.write(String.valueOf(countList.get(i)));
            bw.newLine();
        }

        br.close();
        bw.close();

    }
}


