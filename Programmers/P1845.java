package Programmers;

import java.util.HashMap;
import java.util.HashSet;

/*
https://school.programmers.co.kr/learn/courses/30/lessons/1845
 */
public class P1845 {
    public int Solution(int[] nums) {
        int pickNum = nums.length/2;


        //1. 해시맵을만든다.
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        int types= map.size();
        int ans =0;
        if (pickNum < types) {
            ans = pickNum;
        }else{
            ans = types;
        }
        return ans;
    }


    public static void main(String[] args) {
        int[] nums = new int[]{3,1,2,3 };

        P1845 sol = new P1845();

        System.out.println(sol.Solution(nums));
    }
}
