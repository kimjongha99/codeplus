package SwExpertAcademy;


import java.io.*;
import java.util.StringTokenizer;

/*

파리퇴치
https://swexpertacademy.com/main/code/problem/problemDetail.do?problemLevel=2&contestProbId=AV5PzOCKAigDFAUq&categoryId=AV5PzOCKAigDFAUq&categoryType=CODE&problemTitle=&orderBy=SUBMIT_COUNT&selectCodeLang=JAVA&select-1=2&pageSize=10&pageIndex=1

 */
public class S2001 {
    static  int [][] arr;//배열

    static  int  max;
    static int N;
    static int M;
static void getMax(int x, int y){
    int sum=0;
    for(int i = x; i < x + M; i++){
        for(int j = y; j < y + M; j++){
            sum += arr[i][j];
        }
    }
    if(max < sum)
        max = sum;
}
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int TC = Integer.parseInt(st.nextToken());

        for (int t = 0; t < TC; t++) {
            st = new StringTokenizer(br.readLine());

             N= Integer.parseInt(st.nextToken());
             M = Integer.parseInt(st.nextToken());

            arr= new int[N][N];

            for(int i=0; i<N; i++) {
                st = new StringTokenizer(br.readLine());
                for(int j=0; j<N; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
                    }
            max = 0;
            // 모든 경우의 수 구하기
            for(int i = 0; i <= N - M; i++){
                for(int j = 0; j <= N-M; j++){
                    getMax(i,j);

                }

            }
            System.out.println("#" + t +1 + " " + max);

        }


    }
}
/*
2차원배열값보기
   for(int i=0; i<arr.length; i++) {
                for(int j=0; j<arr.length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println(); // 한 행이 끝나면 줄바꿈
            }
 */