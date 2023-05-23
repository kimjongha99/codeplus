package Programmers;


import java.util.Arrays;

/*
수열과 구간 쿼리 3
https://school.programmers.co.kr/learn/courses/30/lessons/181924
 */
public class P181924 {
   static int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        for (int i = 0; i < queries.length; i++) {
            int a = queries[i][0];
            int b = queries[i][1];

            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;

        }

        answer = arr;

        return answer;
    }

    public static void main(String[] args) {
        int arr[] = {0, 1, 2, 3, 4};
        int queries[][] = {{0, 3},{1, 2},{1, 4}};

        System.out.println(Arrays.toString(solution(arr,queries)));
    }
}
