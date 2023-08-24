package Softeer;


import java.util.Scanner;

/*
https://softeer.ai/practice/info.do?idx=1&eid=362
A+B
 */
public class S362 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();

        for (int i = 1; i <= tc; i++) {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();

            int result =num1+num2;
            System.out.println("Case #"+i+":"+" "+result);
        }
    }
}
