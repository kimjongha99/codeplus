package bruteForce;


import java.util.Scanner;

/*
1, 2, 3 더하기\
https://www.acmicpc.net/problem/9095
 */
public class B9095 {
    public  static  int go(int sum, int goal){
        if(sum>goal){
            return 0;
        }
        if (sum == goal) {
            return 1;
        }
        int now=0;
        for(int i=1; i<=3;i++){
            now += go(sum + i, goal);
        }
        return now;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i=0; i<t;i++){
            int n =  sc.nextInt();
            System.out.println(go(0,n));
        }

    }
}
