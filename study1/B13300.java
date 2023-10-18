package study1;

import java.io.*;
import java.util.StringTokenizer;

/*
https://www.acmicpc.net/problem/13300

방 배정 서브태스크


 */
public class B13300 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int ans=0;

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int room[][] = new int[7][2];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int g = Integer.parseInt(st.nextToken());

            room[g][s]++; // 여자와 남자를 구분하여 학년마다 ++

        }
        for(int l =1; l<7; l++) {
            for(int j =0; j<2; j++) {
                //방필요없다
                if(room[l][j] == 0) {
                    continue;
                }
                ans  +=	 room[l][j] / K ;

                if(room[l][j] % K != 0) {
                    ans +=1;
                }
            }
        }

        System.out.println(ans);

    }
}














/*

다른풀이


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[][] room = new int[2][7]; // 성별 , 학년
        int count = 0 ;

        int s , g;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            s = Integer.parseInt(st.nextToken());
            g = Integer.parseInt(st.nextToken());
            room[s][g]++;
        }
        for (int i = 0; i < room.length; i++) {
            for (int j = 0; j < room[i].length; j++) {
                count += room[i][j] / K ;
                if(room[i][j]% K !=0) {
                    count++;
                }
            }
        }
        System.out.print(count);
        System.out.println();


// 이런식으로 room에[][]있는 배열 디버깅
        for (int i=0;i<room.length;i++){
            for(int j=0;j<room[i].length;j++){
                System.out.print(room[i][j]+" ");
            }
            System.out.println();
        }


 */