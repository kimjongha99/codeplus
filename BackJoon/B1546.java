package BackJoon;

import java.util.Arrays;
import java.util.Scanner;

/*
https://www.acmicpc.net/problem/1546

평균
 */
public class B1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N =sc.nextInt();
        int arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            int num =sc.nextInt();
            arr[i]=num;
        }

        Arrays.sort(arr);

        int lastIndex =arr.length-1;
        int max =  arr[lastIndex];
        double sum = 0;

        for (int i = 0; i < N; i++) {
            sum +=arr[i];
        }
        double result = sum*100/max/N;
        System.out.println(result);
    }
}
