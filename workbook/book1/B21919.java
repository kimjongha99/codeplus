package workbook.book1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//https://www.acmicpc.net/problem/21919
//소수 최소 공배수

public class B21919 {
    static boolean check_prime(int num) {
        if (num <= 1) {
            return false;
        }

            for (int i = 2; i <= Math.sqrt(num); i++) { // num 의 제곱근만큼만 반복하면 시간복잡도줄임
                if (num % i == 0) {
                    return false;
                }

            }


    return true;
    }

     static long lcm(long a, long b) {
        return a / gcd(a, b) * b;
    }
    static long gcd(long a, long b) {
        if(b == 0) return a;
        return gcd(b, a % b);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());


        long ans = 1;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());

            if(check_prime(num)){
                ans = lcm(ans, num);
            }

        }
        if (ans == 1) {
            System.out.println("-1");
        }else System.out.println(ans);
    }
}
