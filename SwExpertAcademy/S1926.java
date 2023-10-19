package SwExpertAcademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
https://swexpertacademy.com/main/code/problem/problemDetail.do?problemLevel=2&contestProbId=AV5PTeo6AHUDFAUq&categoryId=AV5PTeo6AHUDFAUq&categoryType=CODE&problemTitle=&orderBy=SUBMIT_COUNT&selectCodeLang=JAVA&select-1=2&pageSize=10&pageIndex=1

 1926. 간단한 369게임 D2

*/
public class S1926 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i <= N; i++) {
            String tmp = String.valueOf(i);
            if (tmp.contains("3") || tmp.contains("6") || tmp.contains("9")) {
                for (int j = 0; j < tmp.length(); j++) {
                    if (tmp.charAt(j) == '3' || tmp.charAt(j) == '6' || tmp.charAt(j) == '9') {
                        System.out.print("-");
                    }
                }
                System.out.print(" ");
            }
            else {
                System.out.print(i + " ");

            }
        }

    }
}