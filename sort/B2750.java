package sort;

import java.util.Scanner;

/*
https://www.acmicpc.net/problem/2750

수 정렬하기
 */
public class B2750 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc= sc.nextInt();
        int arr[] = new int[tc];
        for (int i = 0; i < tc; i++) {
            arr[i]=sc.nextInt();
        }

        for (int i = 0; i < tc - 1; i++) {
            for (int j = 0; j < tc - 1; j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] =arr[j+1];
                    arr[j+1] = temp;

                }
            }
        }
        for(int i=0; i<tc;i++){
            System.out.println(arr[i]);
        }

    }
}
