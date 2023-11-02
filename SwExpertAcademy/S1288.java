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
        int t = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= t; tc++) {
            int N = Integer.parseInt(br.readLine());

            int mulNum =1;

            boolean [] check = new boolean[10];

            while (true) {
                int currentNum = N*mulNum;

                String strNum=Integer.toString(currentNum);

                for (int i = 0; i < strNum.length(); i++) {
                    int Num = strNum.charAt(i)-'0';
                    check[Num]=true;
                }


                boolean allTrue = true;
                for (int i = 0; i < check.length; i++) {
                    if (check[i] == false) {
                        allTrue=false;
                        break;
                    }
                }
                if (allTrue == true) {
                    break;
                }
                mulNum++;
            }

            System.out.println("#"+t+" "+ N * mulNum);


        }

    }
}
