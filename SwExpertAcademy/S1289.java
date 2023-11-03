package SwExpertAcademy;

import java.io.*;

/*
https://swexpertacademy.com/main/code/problem/problemDetail.do?problemLevel=3&contestProbId=AV19AcoKI9sCFAZN&categoryId=AV19AcoKI9sCFAZN&categoryType=CODE&problemTitle=&orderBy=RECOMMEND_COUNT&selectCodeLang=JAVA&select-1=3&pageSize=10&pageIndex=1

원재의 메모리 복구하기

 */
public class S1289 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());

        for (int t = 1; t <= T; t++) {
            String strNum = br.readLine();

            int ans =0;
            int currentBit = 0; // 현재 비트 값을 '0'으로 초기화합니다.

            for (int i = 0; i < strNum.length(); i++) {
                int bit = strNum.charAt(i)-'0';

                if (bit != currentBit) {
                    ans++;
                    currentBit=bit;
                }

            }
            bw.write("#" + t + " " + ans);
            bw.newLine();


        }
        bw.close();
        br.close();

    }
}
