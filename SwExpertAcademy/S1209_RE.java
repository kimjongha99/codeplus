package SwExpertAcademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S1209_RE {
    static  int [][] map;



    static int allLine(int[][] map) {
        int max = Integer.MIN_VALUE;
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;

        for (int i = 0; i < map.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < map[i].length; j++) {
                rowSum += map[i][j];
            }
            if (rowSum > max) {
                max = rowSum;
            }
        }
        sum1 += max;



        max = Integer.MIN_VALUE;
        for (int y = 0; y < map[0].length; y++) {
            int colSum=0;
            for (int x = 0; x < map.length; x++) {
                colSum+= map[x][y];
            }
            if (colSum > max) {
                max = colSum;
            }
        }


        sum2 += max;

        max = Integer.MIN_VALUE;
        int crossOne = 0;
        int crossTwo =0;

        for (int i = 0; i < map.length; i++) {
            crossOne +=map[i][i];
            crossTwo +=map[i][map.length-1-i];
        }
        max = Math.max(crossOne,crossTwo);

        sum3+= max;



        return Math.max((Math.max(sum1,sum2)),sum3) ;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int t = 1; t <= 10; t++) {
            int sd = Integer.parseInt(br.readLine());
            map = new int[100][100];

            for (int i = 0; i < 100; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j = 0; j < 100; j++) {
                    map[i][j]=Integer.parseInt(st.nextToken());
                }
            }
            int sum = allLine(map);


            System.out.println("#"+t+" "+sum);


        }
    }
}
