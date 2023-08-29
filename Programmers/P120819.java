package Programmers;

import java.util.Arrays;

/*
아이스아메리카노
https://school.programmers.co.kr/learn/courses/30/lessons/120819


머쓱이는 추운 날에도 아이스 아메리카노만 마십니다.
 아이스 아메리카노는 한잔에 5,500원입니다.
 머쓱이가 가지고 있는 돈 money가 매개변수로 주어질 때,
  머쓱이가 최대로 마실 수 있는
  아메리카노의 잔 수와 남는 돈을 순서대로 담은 배열을 return 하도록 solution 함수를 완성해보세요.
 */
public class P120819 {
    public int[] solution(int money) {
        int count=0;
        while (money >= 5500) {
             money = money-5500;
            count++;
        }
        int[] answer = {count,money};

        return answer;
    }
    public static void main(String[] args) {
        int money  = 15000;

        P120819 sol = new P120819();
        System.out.println(Arrays.toString(sol.solution(money)) );
    }
}
