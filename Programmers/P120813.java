package Programmers;


import java.util.Arrays;

/*
https://school.programmers.co.kr/learn/courses/30/lessons/120813
짝수는 싫어요

 */
public class P120813 {
    static  int [] solution(int n){
        int [] answer =new int[n];
        int index = 0;

        for(int i=1; i<=n; i++){
            if(i % 2 != 0){
                answer[index++] = i;
            }
        }
        int[] result = Arrays.copyOf(answer, index);
        return result;
    }
    public static void main(String[] args) {
        int n= 10;
        System.out.println(solution(n));
    }

}

