package SwExpertAcademy;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
https://swexpertacademy.com/main/code/problem/problemDetail.do?problemLevel=2&contestProbId=AV5PxmBqAe8DFAUq&categoryId=AV5PxmBqAe8DFAUq&categoryType=CODE&problemTitle=&orderBy=FIRST_REG_DATETIME&selectCodeLang=JAVA&select-1=2&pageSize=10&pageIndex=1

지그재그  숫자.
 */
public class S1986 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= t; tc++) {



        int n = Integer.parseInt(br.readLine());
        int sum =0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                sum+=i;
            }else{
                sum-=i;
            }
        }
        System.out.println("#"+tc+" "+sum);

    }
}
}