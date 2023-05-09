package modulo;
// 나머지

import java.util.Scanner;

public class B10430 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        int A =sc.nextInt();
        int B =sc.nextInt();
        int C =sc.nextInt();

        int result1 = (A+B)%C;
        int result2 = ((A%C) + (B%C))%C;
        int result3 = (A*B)%C;
        int result4 = ((A%C) * (B%C))%C;

        System.out.println(result1+"\n"+result2+"\n"+result3+"\n"+result4+"\n");

    }
}