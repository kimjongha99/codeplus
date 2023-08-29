package Programmers;


import java.util.ArrayList;
import java.util.List;

/*

https://school.programmers.co.kr/learn/courses/30/lessons/181920
정수 start와 end가 주어질 때, start부터 end까지의 숫자를 차례로 담은 리스트를 return하도록 solution 함수를 완성해주세요.
 */
public class P181920 {
    public List<Integer> solution(int start, int end) {
        List<Integer> answer = new ArrayList<>();

        for (int i = start; i <= end; i++) {
            answer.add(i);
        }
        return  answer;

    }
    public static void main(String[] args) {
        int start =3;
        int end =10;

        P181920 sol = new P181920();
        System.out.println(sol.solution(start,end));
    }


}
