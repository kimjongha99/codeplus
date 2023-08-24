package Programmers;


/*
https://school.programmers.co.kr/learn/courses/30/lessons/120836
순서쌍의개수


 */
public class P120836 {
    public int solution(int n) {
        int answer = 0;


        for (int i = 1; i <= n; i++) {
            if(n%i==0){
                answer++;
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        int  n =100;

        P120836  sol = new P120836();
        System.out.println(sol.solution(n));
    }
}
