package SwExpertAcademy;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
https://swexpertacademy.com/main/code/problem/problemDetail.do?problemLevel=3&contestProbId=AYGtoa3qARcDFARC&categoryId=AYGtoa3qARcDFARC&categoryType=CODE&problemTitle=&orderBy=FIRST_REG_DATETIME&selectCodeLang=JAVA&select-1=3&pageSize=10&pageIndex=2

공과 잡초
 */
public class S14555 {
    static int countBalls(String str) {
        int ball = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                ball++;
            } else if (str.charAt(i) == ')' && str.charAt(i - 1) == '|') {
                ball++;
            }
        }
            return ball;
    }
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine());

        for (int t = 1; t <= tc; t++) {

            String str = br.readLine();

            System.out.println("#" + t + " " + countBalls(str));



        }
    }

}
