package 구현;


import java.util.Scanner;

/*
숫자의 개수
https://www.acmicpc.net/problem/2577
 */
public class B2577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int Y = sc.nextInt();
        int Z = sc.nextInt();


        String result = String.valueOf(X*Y*Z);

        for (int i = 0; i < 10; i++) {
            int count =0;
            for (int j = 0; j < result.length(); j++) {
                if((result.charAt(j)-'0') ==i ){
                    count++;
                }
            }
            System.out.println(count);
        }
        }



}
