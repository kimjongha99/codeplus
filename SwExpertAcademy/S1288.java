package SwExpertAcademy;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
https://swexpertacademy.com/main/code/problem/problemDetail.do?problemLevel=2&contestProbId=AV18_yw6I9MCFAZN&categoryId=AV18_yw6I9MCFAZN&categoryType=CODE&problemTitle=&orderBy=FIRST_REG_DATETIME&selectCodeLang=JAVA&select-1=2&pageSize=10&pageIndex=3

새로운 불면증 치료법
 */
public class S1288 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine());

        for (int t = 1; t <= tc; t++) {
            int N = Integer.parseInt(br.readLine());

            boolean checkNum [] =new boolean[10];

            int mulNum=1;

            while (true) {

                int currentNum = N*mulNum;
                String strNum=Integer.toString(currentNum);

                for (int i = 0; i < strNum.length(); i++) {
                     int Num = strNum.charAt(i)-'0';
                     checkNum[Num]=true;
                }

                boolean allTrue = true;

                for (int i = 0; i < checkNum.length; i++) {
                    if (checkNum[i] == false) {
                        allTrue = false;
                        break;
                    }
                }

                // 모든 숫자를 봤다면 반복 종료
                if (allTrue==true) {
                    break;
                }
                mulNum++; // 배수 값을 증가

            }
            System.out.println("#"+t+" "+ N * mulNum);

        }

    }
}