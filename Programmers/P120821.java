package Programmers;

import java.util.Arrays;

public class P120821 {
    public int[] solution(int[] num_list) {

        int left =0;
        int right = num_list.length-1;

        while (left<right){
            int temp = num_list[left];
            num_list[left]= num_list[right];
            num_list[right]=temp;

            left++;
            right--;
        }
        return num_list;
    }
    public static void main(String[] args) {
        int num_list[] = new int[]{1, 2, 3, 4, 5};

        P120821 sol = new P120821();

        System.out.println(Arrays.toString(sol.solution(num_list)) );
    }
}
