package Programmers;


import java.util.Arrays;

/*
https://school.programmers.co.kr/learn/courses/30/lessons/181927

마지막 두 원소

 */
public class P181927 {

    static int[] solution(int[] num_list) {
        int end = num_list[num_list.length-1];
        int SecondEnd = num_list[num_list.length-2];
        int x= end> SecondEnd ? end-SecondEnd : end*2;

        int ans[] = new int[num_list.length+1];
        for(int i=0; i< num_list.length; i++ ){
            ans[i] = num_list[i];
        }

        ans[ans.length - 1]= x;

        return ans;

    }

    public static void main(String[] args) {
        int arr[] = new int[]{2, 1, 6};
        System.out.println(Arrays.toString(solution(arr)));
    }
}
