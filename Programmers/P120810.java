package Programmers;


/*
https://school.programmers.co.kr/learn/courses/30/lessons/120810
나머지 구하기

 */
public class P120810 {

    static int solution(int num1, int num2) {
        int answer =-1;

        answer = num1%num2;

        return answer;
    }
    public static void main(String[] args) {
        int a = 3;
        int b = 2;

        System.out.println(solution(a,b));

    }

}
