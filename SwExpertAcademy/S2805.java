package SwExpertAcademy;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*

농작물 수확하기
https://swexpertacademy.com/main/code/problem/problemDetail.do?problemLevel=3&contestProbId=AV7GLXqKAWYDFAXB&categoryId=AV7GLXqKAWYDFAXB&categoryType=CODE&problemTitle=&orderBy=SUBMIT_COUNT&selectCodeLang=JAVA&select-1=3&pageSize=10&pageIndex=1

 */
public class S2805 {
    static  int map [][];

    static  int T , N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= T; tc++) {

            N = Integer.parseInt(br.readLine());

            map= new int[N][N];

            for (int i = 0; i < N; i++) {
                String str = br.readLine();
                for (int j = 0; j < N; j++) {
                    map[i][j]=str.charAt(j)-'0';
                }
            }


            int mid = N / 2;
            int sum = 0;
            int start= mid;
            int end =  mid;

            for (int i = 0; i < N; i++) {
                for (int j = start; j <= end; j++) {
                    sum += map[i][j];
                }
                if(i<mid){
                    start--;
                    end++;
                }else{
                    start++;
                    end--;
                }
            }





            System.out.println("#" + tc + " " + sum ); // 결과 출력






        }





    }
}

