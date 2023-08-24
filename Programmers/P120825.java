package Programmers;


import java.util.SplittableRandom;

/*
문자 반복 출력하기

https://school.programmers.co.kr/learn/courses/30/lessons/120825
 */
public class P120825 {
    public static String solution(String my_string, int n) {

        String ans = "";
        for (int i = 0; i < my_string.length(); i++) {
            for (int j=0; j<n; j++){
                ans +=my_string.charAt(i);

            }

        }


        return ans;
    }

    public static void main(String[] args) {
        String my_string ="hello";
        int n = 3;

        P120825  sol = new P120825();

        System.out.println(sol.solution(my_string,n));
    }



}
