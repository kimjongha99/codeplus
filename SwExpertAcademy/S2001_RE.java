package SwExpertAcademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S2001_RE {

    static  int [][] map ;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        map = new int[N][N];

        for (int y = 0; y < N; y++) {
            st = new StringTokenizer(br.readLine());
            for (int x = 0; x < N; x++) {
                map[y][x] = Integer.parseInt(st.nextToken());
            }
        }
            int max= 0;

            for (int y = 0; y <N; y++) {
                for (int x = 0; x <N; x++) {
                    int sum=0;
                    for (int k = 0; k < M; k++) {
                        for (int h = 0; h < M; h++) {
                            sum+=map[y+k][x+h];
                        }
                    }
                    max = Math.max(sum,max);
                }
            }
        System.out.println("#"+max);


    }
}
