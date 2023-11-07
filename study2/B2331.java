package study2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

/*
반복수열

https://www.acmicpc.net/problem/2331

// 배열 크기때매 런타임애러,,,

 */
public class B2331 {
    static  int [] arr;
    static  int A,P;
    static  int result;
    static  void dfs(int A, int P , int count){
        if (arr[A] != 0) {

            result = arr[A] - 1;
            return;
        }


        arr[A]=count;
        int nextNumber = 0;

        while (A > 0) {
            int digit = A % 10;
            nextNumber += Math.pow(digit, P);
            A /= 10;
        }
          dfs(nextNumber, P, count + 1);

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());


        A = Integer.parseInt(st.nextToken());
        P = Integer.parseInt(st.nextToken());
        arr = new int[295245];

        dfs(A,P,1);
        System.out.print( result);

    }
}
