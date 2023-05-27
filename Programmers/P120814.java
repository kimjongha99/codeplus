package Programmers;


/*
https://school.programmers.co.kr/learn/courses/30/lessons/120814
피자 나눠 먹기 (1)

 */
public class P120814 {


    static int solution(int n) {
        int answer = 0;

        if(n % 7 ==0){
            answer += n/7;
        }else
            answer += n/7+1;
        return answer;

    }
    public static void main(String[] args) {


    }
}
