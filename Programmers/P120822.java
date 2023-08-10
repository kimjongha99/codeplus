package Programmers;


/*
https://school.programmers.co.kr/learn/courses/30/lessons/120822
문자열 뒤집기

 */
public class P120822 {
    public String solution(String my_string) {
        String result = "";
        int arrLast  = my_string.length();

        for (int i = arrLast - 1; i >= 0; i--) {
            result += my_string.charAt(i);
        }
       return result;
    }




    public static void main(String[] args) {
    String my_string = "jaron";
        P120822 sol = new P120822();

        System.out.println(sol.solution(my_string));
}


}