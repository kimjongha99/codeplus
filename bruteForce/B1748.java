package bruteForce;

import java.util.Scanner;

/*
수 이어 쓰기1
https://www.acmicpc.net/problem/1748
 */
public class B1748 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count= 0;
        int plus =1;
        int num =10;

        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            if(i%num==0){
                plus++;
                num *=10;
            }
            count += plus;
        }
        System.out.println(count);
    }
}
