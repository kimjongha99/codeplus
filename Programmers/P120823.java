package Programmers;

import java.util.Scanner;

/*
https://school.programmers.co.kr/learn/courses/30/lessons/120823
직각삼ㄱ각형

 */
public class P120823 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int  n = sc.nextInt();

        for(int i=0; i<n; i++){
            for(int j=0; j<i+1; j++){
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}
