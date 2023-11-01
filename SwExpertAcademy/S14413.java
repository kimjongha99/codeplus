
package SwExpertAcademy;


import java.io.*;
import java.util.StringTokenizer;

/*
https://swexpertacademy.com/main/code/problem/problemDetail.do?problemLevel=3&contestProbId=AYEXgKnKKg0DFARx&categoryId=AYEXgKnKKg0DFARx&categoryType=CODE&problemTitle=&orderBy=FIRST_REG_DATETIME&selectCodeLang=JAVA&select-1=3&pageSize=10&pageIndex=2#none

격자판 칠하기
 */
public class S14413 {
    static  char [][] map;
    static  int [] dirY ={-1,1,0,0};
    static  int [] dirX ={0,0,1,-1};

    static void dfs(int y, int x, int N, int M) {
        for (int i = 0; i < 4; i++) {
            int newY = y+dirY[i];
            int newX = x+dirX[i];

            if (newY < 0 || newX < 0 || newY >= N || newX >= M) {
                continue;
            }
            if (map[newY][newX] == '.') {
                map[y][x] = '#';
            }
            if (map[newY][newX] == '#') {
                map[y][x] = '.';
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int tc = Integer.parseInt(st.nextToken());

        for (int t = 1; t <= tc; t++) {
            st = new StringTokenizer(br.readLine());

            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            map = new char[N][M];

            for (int i = 0; i < N; i++) {
                String str = br.readLine();
                for (int j = 0; j < M; j++) {
                    map[i][j]= str.charAt(j);
                }
            }

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (map[i][j] == '?') {
                        dfs(i,j,N,M);
                    }
                }
            }

            //이제 검증
            String ans ="possible";
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M - 1; j++) {
                        if (map[i][j] == '?') continue;
                    if (map[i][j] == map[i][j + 1]) {
                        ans = "impossible";
                    }
                }
            }
            for (int j = 0; j < M; j++) {
                for (int i = 0; i < N - 1; i++) {
                    if (map[i][j] == '?') continue;
                    if (map[i][j] == map[i + 1][j]) {
                        ans = "impossible";
                    }
                }
            }

            bw.write("#"+t+" "+ans);
            bw.newLine();


        }
        br.close();
        bw.close();
        }
}
