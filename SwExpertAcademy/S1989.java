package SwExpertAcademy;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
https://swexpertacademy.com/main/code/problem/problemDetail.do?problemLevel=2&contestProbId=AV5PyTLqAf4DFAUq&categoryId=AV5PyTLqAf4DFAUq&categoryType=CODE&problemTitle=&orderBy=FIRST_REG_DATETIME&selectCodeLang=JAVA&select-1=2&pageSize=10&pageIndex=1

1989. 초심자의 회문 검사 D2




 */
public class S1989 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= t; tc++) {
            String str = br.readLine();


            int left = 0;
            int right = str.length() - 1;
            int same = 1;

            while (left < right) {
                if (str.charAt(left) != str.charAt(right)) {
                    same = 0;
                    break;
                }
                left++;
                right--;

            }
            System.out.println("#"+tc+" "+same);

        }


    }
}
