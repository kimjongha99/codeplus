package SwExpertAcademy;


/*
https://swexpertacademy.com/main/code/problem/problemDetail.do?problemLevel=3&contestProbId=AYJW0g-qlO8DFASv&categoryId=AYJW0g-qlO8DFASv&categoryType=CODE&problemTitle=&orderBy=FIRST_REG_DATETIME&selectCodeLang=JAVA&select-1=3&pageSize=10&pageIndex=2

통나무 자르기
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S14692 {

    static String winer(int num) {
        if (num % 2 == 0) {

            return "Alice";
        }else{
            return "Bob";
        }

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= t; tc++) {
            int num = Integer.parseInt(br.readLine());

            System.out.println("#"+tc+" "+ winer(num));

        }

    }
}
