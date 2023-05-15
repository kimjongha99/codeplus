package bruteForce;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;


/*
일곱 난쟁이

https://www.acmicpc.net/problem/2309

1. 9명중에서 2명을 찾기.
 1. 모든키의 합:sum
 2. i,j 일곱난쟁이 sum -A[i]-A[j]

 */
public class B2309 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 9;
        int [] a = new int[n];
        int sum =0;
        int fake1=0, fake2=0;

        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
            sum +=a[i];
        }
        Arrays.sort(a);

        for(int i=0; i<n; i++){
            for(int j=1; j<n; j++){
                if (sum - a[i] - a[j] == 100) {
                    fake1 = a[i];
                    fake2 = a[j];

                }
            }
        }
        for (int i = 0; i < n; i++) {
            if(fake1 ==a[i] || fake2 ==a[i]){
                continue;
            }
            System.out.println(a[i] );

        }

        }
    }


