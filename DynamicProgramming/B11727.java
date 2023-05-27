package DynamicProgramming;


import java.util.Scanner;

/*
https://www.acmicpc.net/problem/11727

2×n 타일링 2

 */
public class B11727 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[1001];
        arr[0] = 1;
        arr[1]= 1;

        for (int i = 2; i <= n; i++) {

            arr[i] = arr[i - 1] + arr[i - 2]*2;
            arr[i]= arr[i]%10007;
        }
        System.out.println(arr[n]);
    }
}
