package 구현;

import java.util.Scanner;

/*
과제 안 내신 분?

https://www.acmicpc.net/problem/5597
 */
public class B5597 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr1[] = new int[31];
        int ans =0;
        for (int i = 1; i <29; i++) {
            int success = sc.nextInt();
            arr1[success] =1;
        }
        for (int i = 1; i < arr1.length; i++) {
            if (arr1[i] != 1) {
                System.out.println(i);

            }
        }




    }
    }
