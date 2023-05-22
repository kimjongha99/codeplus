package Programmers;

import java.util.Map;

/*
https://school.programmers.co.kr/learn/courses/30/lessons/181929
원소들의 곱과 합
 */
public class P181929 {
    static int solution(int[] num_list){
        int mul =1;
        int square =0;
        int plus =0;
        for(int i=0; i<num_list.length; i++){
            mul *= num_list[i];
            plus += num_list[i];
        }
        square += (int)Math.pow(plus,2);

        int answer = mul<square?1:0;
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3, 4, 5, 2, 1};
        System.out.println(solution(arr));

    }
}
