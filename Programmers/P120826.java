package Programmers;


/*
https://school.programmers.co.kr/learn/courses/30/lessons/120826
특정 문자 제거하기

 */
public class P120826 {
    public String solution(String my_string, String letter) {

        String answer = my_string.replaceAll(letter,"");

        return answer;
    }
    public static void main(String[] args) {
        String my_string ="BCBdbe";
        String letter ="B";

        P120826  sol = new P120826();
        System.out.println(my_string.length()-1);
        System.out.println(sol.solution(my_string,letter));
    }

}
