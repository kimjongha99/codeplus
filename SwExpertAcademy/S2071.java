package SwExpertAcademy;

import java.io.*;
import java.util.StringTokenizer;

/*
https://swexpertacademy.com/main/code/problem/problemDetail.do?problemLevel=1&contestProbId=AV5QRnJqA5cDFAUq&categoryId=AV5QRnJqA5cDFAUq&categoryType=CODE&problemTitle=&orderBy=INQUERY_COUNT&selectCodeLang=ALL&select-1=1&pageSize=10&pageIndex=1
평균값 구하기


 */
public class S2071 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= T; tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int arr[] = new int[10];
            for (int i = 0; i < 10; i++) {
                arr[i]= Integer.parseInt(st.nextToken());
            }
            double ans =0;
            double result=0;
            for (int i = 0; i < 10; i++) {
                ans+=arr[i];
            }
            result= ans / 10;

            bw.write("#"+tc+" "+Math.round(result));
            bw.newLine();
        }
        bw.close();
        br.close();
    }
}
