package 구현;

import java.util.Scanner;

/*
https://www.acmicpc.net/problem/10872

팩토리얼

 */
public class B10872 {

    static int solution(int n) {
        int first =0;
        int result =1;

        for (int i = 1; i <=n; i++) {
            first++;
            result *=first;
        }

        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solution(n));
    }
}
