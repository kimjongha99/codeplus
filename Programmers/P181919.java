package Programmers;


/*
https://school.programmers.co.kr/learn/courses/30/lessons/181919

콜라츠 수열 만들기

 */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P181919 {
    public int[] solution(int n) {
        List<Integer> ans = new ArrayList<>();
        ans.add(n);

        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = 3 * n + 1;
            }
            ans.add(n);
        }


        int[] answer = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            answer[i] = ans.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {

    int n =10;

    P181919 sol = new P181919();
    System.out.println(Arrays.toString(sol.solution(n)) );
}

}