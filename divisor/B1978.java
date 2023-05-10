package divisor;

import java.util.Scanner;

/*
소수 찾기
https://www.acmicpc.net/problem/1978
 */
public class B1978 {
    static boolean prime(int n){
        if(n < 2){
            return  false;
        }
        for(int i=2; i*i<=n; i++){
            if (n % i == 0) {
                return false;
            }
        }
        return  true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();
        int count = 0;

        for (int i = 0; i < tc; i++) {
            if(prime(sc.nextInt())){
                count++;
            }

        }
        System.out.println(count);
    }
}
