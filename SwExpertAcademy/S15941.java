package SwExpertAcademy;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
https://swexpertacademy.com/main/code/problem/problemDetail.do?problemLevel=3&contestProbId=AYVgOZEKOpcDFAQK&categoryId=AYVgOZEKOpcDFAQK&categoryType=CODE&problemTitle=&orderBy=FIRST_REG_DATETIME&selectCodeLang=JAVA&select-1=3&pageSize=10&pageIndex=1

평행사변형
 */
public class S15941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= t; tc++) {

            int N = Integer.parseInt(br.readLine());

            System.out.println("#"+tc+" "+N*N);
        }

    }
}
