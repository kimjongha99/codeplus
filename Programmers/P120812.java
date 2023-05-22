package Programmers;


import java.util.ArrayList;

/*
https://school.programmers.co.kr/learn/courses/30/lessons/120812

최빈값 구하기

 */
public class P120812 {


    static int solution(int[] array) {
        int answer = 0;
        int[] index = new int[1000];
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            index[array[i]]++;
        }

        for (int i = 0; i < index.length; i++) {
            if (max < index[i]) {
                max = index[i];
                answer = i;
            }
        }

        // 최대값이 없는 경우 -1
        if (max == Integer.MIN_VALUE) {
            return -1;
        }

        // 중복되는 숫자가 있는 경우 -1
        boolean isDuplicated = false;
        for (int number : index) {
            if (max == number) {
                if (isDuplicated) {
                    return -1;
                }
                isDuplicated = true;
            }
        }

        return answer;
    }


    public static void main(String[] args)  {

        int arr[]= new int[]{1, 2, 3, 3, 3, 4};
        System.out.println(solution(arr));
    }
}
