package study1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
https://www.acmicpc.net/problem/1475
방번호
 */
public class B1475 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        int []nums = new int[10];

        for (int i = 0; i < str.length(); i++) {
            nums[str.charAt(i) - '0']++;
        }

        int sixNineCount = nums[6]+nums[9];
        // 소수점 올림 처리
        sixNineCount = (sixNineCount + 1) / 2;

        nums[6] = sixNineCount;
        nums[9] = sixNineCount;

        int maxCount = -1;
        for(int i=0; i<10; i++){
            if(nums[i]>maxCount){
                maxCount=nums[i];
            }
        }
        System.out.println(maxCount);
    }
}
