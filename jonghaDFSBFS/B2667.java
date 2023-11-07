package jonghaDFSBFS;


/*

https://www.acmicpc.net/problem/2667
단지번호 붙이기


 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class B2667 {
    static int max = 25+10;
    static ArrayList<Integer>[] map;
    static  boolean [][] visited;
    static  int N;
    static  int danzi;

    static  int [] dirY ={1,-1,0,0};
    static  int [] dirX ={0,0, 1,-1};
    static  void  dfs(int i, int j){
    danzi++;
    visited[i][j]=true;

        for (int k = 0; k < 4;k++) {
            int newY = i+ dirY[k];
            int newX = j+ dirX[k];

            if(newY<0 || newX <0 || newY>=N || newX>=N)continue;

            if(map[newY].get(newX)==0)continue;
            if(visited[newY][newX]==true)continue;

            dfs(newY,newX);

        }


    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        map = new ArrayList[max];
        for (int i = 0; i < N; i++) { // start with i = 0
            map[i] = new ArrayList<>();
        }

        visited = new boolean[max][max];

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < N; j++) {
                int number = Integer.parseInt(line.substring(j, j + 1));
                map[i].add(number);

            }
        }

        ArrayList<Integer> group = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (visited[i][j] == false && map[i].get(j) == 1) {
                    danzi = 0;
                    dfs(i, j);
                    group.add(danzi);
                }
            }
        }

        Collections.sort(group);

        System.out.println(group.size());

        for (int i = 0; i < group.size(); i++) {
            System.out.println(group.get(i));
        }




    }
}
