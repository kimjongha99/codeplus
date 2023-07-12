package BackJoon;


import java.util.Scanner;

/*
숫자의 합

https://www.acmicpc.net/problem/11720
 */
public class B11720 {
    public static void main(String[] args) {
            Scanner sc =new Scanner(System.in);

        int tc =sc.nextInt();

        String N = sc.next();

        char[] cN = N.toCharArray();

        int sum=0;
        for (int i = 0; i < cN.length; i++) {
            sum += cN[i]-'0';
        }
        System.out.println(sum);
    }
}
