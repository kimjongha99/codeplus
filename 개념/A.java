package 개념;
// n! 구하기
// 재귀함수를 이용해서 한번 풀어보자
//
// 매개변수가 5라면 5!을 구하기

import java.util.Scanner;

public class A {

    static int dfs(int n) {
        if(n==1){
            return 1;
        }else{
          return   n*dfs(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println(dfs(n)); ;
    }
}
