package SwExpertAcademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S1979_RE {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int arr[][]= new int[N][N];


        for (int y = 0; y < N; y++) {
            st = new StringTokenizer(br.readLine());
            for (int x = 0; x < N; x++) {
                arr[y][x] = Integer.parseInt(st.nextToken());
            }
        }
        int ans =0;
        //가로부터 체크

        for (int y = 0; y < N; y++) {
            int tempCount=0;
            for (int x = 0; x < N; x++) {
                if (arr[y][x] == 1) {
                    tempCount++;
                }
                if (arr[y][x] == 0 || x == N - 1) {
                    if(tempCount==K)
                        ans++;
                        tempCount=0;

                }
            }
        }

        //세로체크
        for (int y = 0; y < N; y++) {
            int tempCount= 0;
            for (int x = 0; x < N; x++) {
                if (arr[x][y] == 1) {
                    tempCount++;
                }
                if (arr[x][y] == 0 || x == N - 1) {
                    if ( tempCount == K)
                        ans++;
                        tempCount=0;

                }
            }
        }



        System.out.println(ans);




    }
}
