package SwExpertAcademy;

import java.io.*;
import java.util.StringTokenizer;

/*
https://swexpertacademy.com/main/code/problem/problemDetail.do?problemLevel=1&contestProbId=AV5QSEhaA5sDFAUq&categoryId=AV5QSEhaA5sDFAUq&categoryType=CODE&problemTitle=&orderBy=INQUERY_COUNT&selectCodeLang=ALL&select-1=1&pageSize=10&pageIndex=1
2072. 홀수만 더하기 D1


 */
public class S2072 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= T; tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int arr[]= new int[10];

            for (int i = 0; i < 10; i++) {
                arr[i]= Integer.parseInt(st.nextToken());
            }

            //홀수만 더해야함
            int ans =0;
            for (int i = 0; i < arr.length; i++) {
                if(arr[i]%2==1){
                    ans += arr[i];
                }

            }
            bw.write("#"+tc+" "+ans);
            bw.newLine();
        }
        bw.close();
        br.close();

    }
}
