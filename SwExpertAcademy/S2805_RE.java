package SwExpertAcademy;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
농작물 수확하기
 */
public class S2805_RE {
    static int [][] map;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());

        for (int t = 1; t <= tc; t++) {


        int N = Integer.parseInt(br.readLine());

        map = new int[N][N];


        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < N; j++) {
                map[i][j]= str.charAt(j)-'0';
            }
        }

        int mid = N/2;
        int sum = 0;
        int start =mid;
        int end = mid;

        for (int i = 0; i < N; i++) {
            for (int j = start; j <= end; j++) {
                sum += map[i][j];
            }
            if (i < mid) {
                start--;
                end++;
            }
            if (i >= mid) {
                start++;
                end--;
            }

            }
        System.out.println("#"+t+" "+sum);
        }
    }
}
