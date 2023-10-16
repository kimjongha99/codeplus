package study1;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
https://www.acmicpc.net/problem/10808

알파뱃개수

a는 97이다.
b=98이다.
.
.
.

예)c는  99이니   apn[99-97] 값에 ++를 해주고
그값들을출력하며된다.
*/
public class B10808 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int apb []= new int[26];

        for (int i = 0; i < str.length(); i++) {
            char s = str.charAt(i);
            apb[s-97]++;
        }

        for (int i = 0; i < 26; i++) {
            System.out.print(apb[i] + " ");
        }

    }
}
