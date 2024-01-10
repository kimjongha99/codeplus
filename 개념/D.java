package 개념;

//DFS를 이용해서 픽셀수구하기
//5
//11100
//00000
//00000
//00001
//00001

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

//[3,2]
public class D {
    static int [][] map;
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {1, -1, 0, 0};
    static  int count=0;
    static int n;

    static void dfs(int row, int col) {
        map[row][col]=0;
        count++;

        for (int i = 0; i < 4; i++) {
            int newX = row+dx[i];
            int newY = col + dy[i];

            if (newX >= 0 && newY >= 0 && newX < n && newY < n && map[newX][newY] == 1) {
                    dfs(newX, newY);
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         n = Integer.parseInt(br.readLine());
        map = new int[n][n]; // Initialize map

        for (int i = 0; i < n; i++) {
            String nums = br.readLine();
            for (int j = 0; j < n; j++) {
                map[i][j]= nums.charAt(i)-'0';
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if (map[row][col] == 1) {
                    count = 0;
                    dfs(row,col);
                    ans.add(count);
                }
            }
        }

        for (int i : ans) {
            System.out.print(i + " ");
        }
    }
}
