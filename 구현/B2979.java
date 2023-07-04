package 구현;


import java.util.Scanner;

/*
https://www.acmicpc.net/problem/2979
트럭 주차

 */
public class B2979 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int arr[] = new int[100];
        int start, end, max = 0;
        int min = 0;
        int sum = 0;

        for (int i = 0; i < 3; i++) {
            start = sc.nextInt();
            end = sc.nextInt();
            min = Math.min(min, start);
            max = Math.max(max, end);

            for (int j = start; j < end; j++) {
                arr[j]++;
            }
        }
        for (int i = min; i < max; i++) {
            switch (arr[i]) {
                case 1:
                    sum = sum + A * arr[i];
                    break;
                case 2:
                    sum = sum + B * arr[i];
                    break;
                case 3:
                    sum = sum + C * arr[i];
                    break;
            }
        }
        System.out.println(sum);
    }
}
