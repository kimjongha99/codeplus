package BackJoon;

import java.util.Scanner;

/*
https://www.acmicpc.net/problem/2018

수들의합
 */
public class B2018 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int N = sc.nextInt();
        int count =1;
        int Start_idx=1;
        int End_idx =1;
        int sum  =1;

        while (End_idx != N) {
            if (sum == N) {
                count++;
                End_idx++;
                sum += End_idx;
            } else if (sum > N) {
                sum  -=Start_idx;
                Start_idx++;
            }
            else{
                End_idx++;
                sum += End_idx;
            }
        }
        System.out.println(count);
    }
}
