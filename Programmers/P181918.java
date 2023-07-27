package Programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P181918 {
    public int[] solution(int[] arr) {
        List<Integer> ans = new ArrayList<>();
        int i = 0;
        int stk[] = new int[ans.size()];

        while (i < arr.length) {
            if (ans.size() == 0) {
                ans.add(arr[i]);
                i++;
            } else {
                int last = ans.get(ans.size() - 1);
                if (ans.size() != 0 && last < arr[i]) {
                    ans.add(arr[i]);
                    i++;
                } else if (ans.size() != 0 && last >= arr[i]) {
                    ans.remove(ans.size() - 1);
                }
            }


        }
        for (int k = 0; k < ans.size(); k++) {
            stk[k] = ans.get(k).intValue();
        }
        return stk;
    }
        public static void main (String[]args){
            int arr[] = new int[]{1, 4, 2, 5, 3};
            P181918 sol = new P181918();
            System.out.println(Arrays.toString(sol.solution(arr)) );
        }


    }
