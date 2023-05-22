package Programmers;

import java.util.Arrays;

/*
https://school.programmers.co.kr/learn/courses/30/lessons/120811

중앙값 구하기
 */
public class P120811 {
    static int solution(int[] array) {
        int answer = 0;
        Arrays.sort(array);
        answer =array[array.length/2] ;

        return answer;
    }
    public static void main(String[] args) {
       int arr[] = new int[]{1, 2, 7, 10, 11};
        System.out.println(solution(arr));

    }
}
