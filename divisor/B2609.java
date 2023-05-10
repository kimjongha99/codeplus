package divisor;

import java.util.Scanner;

//최대공약수와 최소공배수
//https://www.acmicpc.net/problem/2609
public class B2609 {
    static  int gcd(int a , int b){
        if(b==0){
            return a;
        }else{
            return  gcd(b,a%b);
        }
    }
    static  int lcm(int a, int b){
        int gcd = gcd(a,b);
        int lcm = gcd*(a/gcd)*(b/gcd);
        return lcm;
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(gcd(a,b));
        System.out.println(lcm(a,b));

    }
}
