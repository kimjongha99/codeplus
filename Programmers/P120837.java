package Programmers;

public class P120837 {
    public int solution(int hp) {
        int answer = 0;

        answer = hp/5;
        hp = hp%5;

        answer+=hp/3;
        hp=hp%3;
        answer += hp/1;


        return answer;
    }

    public static void main(String[] args) {
        int  hp =999;

        P120837  sol = new P120837();
        System.out.println(sol.solution(hp));
    }
}
