package SwExpertAcademy;


import java.io.*;
import java.util.StringTokenizer;

/*
1859. 백만 장자 프로젝트 D2
https://swexpertacademy.com/main/code/problem/problemDetail.do?problemLevel=2&contestProbId=AV5LrsUaDxcDFAXc&categoryId=AV5LrsUaDxcDFAXc&categoryType=CODE&problemTitle=&orderBy=FIRST_REG_DATETIME&selectCodeLang=ALL&select-1=2&pageSize=10&pageIndex=1


 사재기를함.
 한번에 많은양을 사재기못함.


1. 원재는 N일동안 물건의 매매가를 알고있음
2. 하루 최대 1만큼 구입가능
3.  판매는 언제든지할수있다.

1일 ~ 3일동안의 매매가가 1,2,3순이면


 */
public class S1859 {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            int T = Integer.parseInt(br.readLine());


            for (int tc = 1; tc <= T; tc++) {
                int N = Integer.parseInt(br.readLine());
                int arr[] = new int[N];


                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int i = 0; i < N; i++) {
                    arr[i]= Integer.parseInt(st.nextToken());
                }

                long ans = 0;


                //맨마지막날짜부터  즉 배열의 마지막 인덱스부터 0번인덱스까지
                for(int i=N-1; i>=0; i--){
                    int j = i-1;
                    int temp=0;

                    while (j >= 0 && arr[i] > arr[j]) {
                        temp += arr[i];

                        temp -= arr[j];

                        j--;
                    }

                    ans+= temp;

                    i=j+1;

                }

                bw.write("#" + tc + " " + ans);
                bw.newLine();
            }
            bw.close();
            br.close();

        }
}