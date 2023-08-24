package Programmers;


/*
https://school.programmers.co.kr/learn/courses/30/lessons/120831

짝수의합

 */
public class P120831 {
    public int solution(int n) {
        int answer = 0;

        for (int i = 0; i <= n; i++) {
            if(i%2==0){
                answer +=i;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        int  n	 =10;

        P120831  sol = new P120831();
        System.out.println( sol.solution(n));
    }
}
