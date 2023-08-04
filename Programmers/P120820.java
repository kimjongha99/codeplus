package Programmers;


/*
https://school.programmers.co.kr/learn/courses/30/lessons/120820

나이출력


 */
public class P120820 {
    public int solution(int age) {
        int year = 2022;
        int answer = 0;

        answer=year-age;

        return answer+1;
    }
    public static void main(String[] args) {
        int age = 40;

        P120820 sol = new P120820();

        System.out.println(sol.solution(age));

    }
}
