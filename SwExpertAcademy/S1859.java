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
    public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int T = Integer.parseInt(br.readLine());

            for (int t = 0; t < T; t++) {
                int N = Integer.parseInt(br.readLine());
                StringTokenizer st = new StringTokenizer(br.readLine(), " ");
                long[] prices = new long[N];
                for (int i = 0; i < N; i++) {
                    prices[i] = Long.parseLong(st.nextToken());
                }

                long maxPriceSoFar = prices[N - 1];
                long profit = 0;

                // 마지막 날부터 역순으로 계산
                for (int i = N - 2; i >= 0; i--) {
                    if (prices[i] > maxPriceSoFar) { // 현재 가격이 지금까지의 최대 가격보다 높으면, 최대 가격 갱신
                        maxPriceSoFar = prices[i];
                    } else { // 현재 가격이 지금까지의 최대 가격보다 작거나 같으면, 사재기 진행(판매-구입)
                        profit += maxPriceSoFar - prices[i];
                    }
                }

                System.out.println( (t+1) + " " + profit);
            }
        }
}
