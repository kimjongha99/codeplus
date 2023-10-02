package DFS;


import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

/*

https://www.acmicpc.net/problem/2667

단지번호 붙이기

 */
public class B2667 {

    final static  int MAX =265+10;

    static  boolean [][] map;
    static  boolean [][] visited;
    static  int countPerDanji;
    static  int N;
    static int dirY[] = {-1,1,0,0};
    static  int dirX[] = {0,0,-1,1};

    public static void dfs(int y,int x){
        visited[y][x]=true;
        countPerDanji++;

        for (int i = 0; i < 4; i++) {
            int newY = y +dirY[i];
            int newX = x+ dirX[i];

            if(map[newY][newX]&&visited[newY][newX]==false){
                dfs(newY,newX);
            }

        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N= Integer.parseInt(br.readLine());

        //맵정보채우기
        map = new boolean[MAX][MAX];
        visited = new boolean[MAX][MAX];

        for (int i = 1; i <= N; i++) {
            String line = br.readLine();
            for (int j = 1; j <= N; j++) {
                map[i][j]= line.charAt(j-1) == '1'? true:false ;
            }
        }

        //dfs
        ArrayList<Integer> countList =new ArrayList<>();// 각 단지마다 몇개의 아파트로 구성되어있는지
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if(map[i][j]&&visited[i][j]==false){
                    countPerDanji=0;
                    dfs(i,j);
                    countList.add(countPerDanji);
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

//
//// Print the map array
//        for (int i = 1; i <= N; i++) {
//                for (int j = 1; j <= N; j++) {
//                System.out.print(map[i][j] ? '1' : '0');
//                }
//                System.out.println();
//                }