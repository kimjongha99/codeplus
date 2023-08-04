package Programmers;


import java.util.Arrays;

/*
https://school.programmers.co.kr/learn/courses/30/lessons/120817
배열의 평균값

 */
public class P120817 {
    public double solution(int[] numbers) {
        double answer = 0;
        for (int i = 0; i < numbers.length; i++) {
            answer += numbers[i];
        }

        return answer/numbers.length;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        P120817 sol = new P120817();

        System.out.println(sol.solution(arr));
    }
}
