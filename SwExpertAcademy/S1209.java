package SwExpertAcademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S1209 {
    static  int [][] map;

    static int findMaxSum(int[][] map) {
        int maxSum = Integer.MIN_VALUE;
        int N = map.length;

        for (int i = 0; i < N; i++) {
            int rowSum = 0;
            int colSum = 0;

            for (int j = 0; j < N; j++) {
                rowSum += map[i][j];
                colSum += map[j][i];
            }

            maxSum = Math.max(maxSum, Math.max(rowSum, colSum));
        }

        int mainDiagonalSum = 0;
        int secondaryDiagonalSum = 0;

        for (int i = 0; i < N; i++) {
            mainDiagonalSum += map[i][i];
            secondaryDiagonalSum += map[i][N - 1 - i];
        }

        maxSum = Math.max(maxSum, Math.max(mainDiagonalSum, secondaryDiagonalSum));
        return maxSum;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for(int t=1; t<=10; t++ ) {
            int N = Integer.parseInt(br.readLine());
        map = new int[100][100];

        for (int i = 0; i < 100; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 100; j++) {
                map[i][j]=Integer.parseInt(st.nextToken());
            }
        }

            int maxSum = findMaxSum(map);
            System.out.println("#" + t + " " + maxSum);


    }

    }

}
