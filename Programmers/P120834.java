package Programmers;


import java.util.Arrays;

/*
외계행성의 나이

https://school.programmers.co.kr/learn/courses/30/lessons/120834
 */
public class P120834 {

    public String solution(int age) {
        String answer = "";
        String age1  =age+"";
        for (int i = 0; i < age1.length(); i++) {
            switch (age1.charAt(i)){
                case '0':
                    answer += "a";
                    break;
                case '1':
                    answer += "b";
                    break;

                case '2':
                    answer += "c";
                    break;

                case '3':
                    answer += "d";
                    break;

                case '4':
                    answer += "e";
                    break;

                case '5':
                    answer += "f";
                    break;

                case '6':
                    answer += "g";
                    break;

                case '7':
                    answer += "h";
                    break;

                case '8':
                    answer += "i";
                    break;

                case '9':
                    answer += "j";
                    break;

            }
        }


        return answer;
    }


    public static void main(String[] args) {
        int  age =2;

        P120834  sol = new P120834();
        System.out.println(sol.solution(age));
    }

}
