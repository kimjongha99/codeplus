package SwExpertAcademy;


import DFS.P43165;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
https://swexpertacademy.com/main/code/problem/problemDetail.do?problemLevel=3&contestProbId=AXaSUPYqPYMDFASQ&categoryId=AXaSUPYqPYMDFASQ&categoryType=CODE&problemTitle=&orderBy=SUBMIT_COUNT&selectCodeLang=JAVA&select-1=3&pageSize=10&pageIndex=2

오목판정

 */
public class S11315 {
    static char[][] map;

    static boolean garu(int y, int x, int N) {
        // 가로 방향으로 다섯 개 연속인지 확인
        if (x + 4 < N) {
            for (int i = 0; i < 5; i++) {
                if (map[y][x + i] != 'o') return false;
            }
            return true;
        }
        return false;
    }


    static boolean seru(int y, int x, int N) {
        // 세로 방향으로 다섯 개 연속인지 확인
        if (y + 4 < N) {
            for (int i = 0; i < 5; i++) {
                if (map[y + i][x] != 'o') return false;
            }
            return true;
        }
        return false;
    }


    static boolean deaguk(int y, int x, int N) {
        // 대각선 방향으로 다섯 개 연속인지 확인 (오른쪽 아래 대각선)
        if (y + 4 < N && x + 4 < N) {
            for (int i = 0; i < 5; i++) {
                if (map[y + i][x + i] != 'o') return false;
            }
            return true;
        }
        // 대각선 방향으로 다섯 개 연속인지 확인 (왼쪽 아래 대각선)
        if (y + 4 < N && x - 4 >= 0) {
            for (int i = 0; i < 5; i++) {
                if (map[y + i][x - i] != 'o') return false;
            }
            return true;
        }
        return false;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        for (int t = 1; t <= tc; t++) {
            int N = Integer.parseInt(br.readLine());

            map = new char[N][N];


            for (int i = 0; i < N; i++) {
                String str = br.readLine();
                for (int j = 0; j < N; j++) {
                    map[i][j] = str.charAt(j);
                }
            }

            boolean ans = false;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (map[i][j] == 'o') {
                        if (garu(i, j, N) || seru(i, j, N) || deaguk(i, j, N)) {
                            ans = true;
                            break;
                        }
                    }
                }            if (ans) break;

            }
            System.out.println("#" + t + " " + (ans ? "YES" : "NO"));

        }
    }
}