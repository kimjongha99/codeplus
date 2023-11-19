package SwExpertAcademy;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

/*
https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV5Pq-OKAVYDFAUq&categoryId=AV5Pq-OKAVYDFAUq&categoryType=CODE&problemTitle=1961&orderBy=FIRST_REG_DATETIME&selectCodeLang=ALL&select-1=&pageSize=10&pageIndex=1

숫자 배열 회전
 */
public class S1961 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // 테스트 케이스

        for (int tc = 1; tc <= T; tc++) {
            int N = sc.nextInt();
            int[][] arr = new int[N][N];

            // 배열 입력
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }

            System.out.println("#" + tc);

            for (int i = 0; i < N; i++) {
                // 90도
                for (int j = N - 1; j >= 0; j--) {
                    System.out.print(arr[j][i]);
                }

                System.out.print(" ");

                // 180도
                for (int j = N - 1; j >= 0; j--) {
                    System.out.print(arr[N - 1 - i][j]);
                }

                System.out.print(" ");

                // 270도
                for (int j = 0; j < N; j++) {
                    System.out.print(arr[j][N - 1 - i]);
                }

                System.out.println();
            }
        }

        sc.close();
    }

}
