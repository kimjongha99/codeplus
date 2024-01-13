package workbook.book1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//블로그
//https://www.acmicpc.net/problem/21921
public class B21921 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        int[] arr = new int[N ];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int windowSum=0;
        int maxSum = Integer.MIN_VALUE;
        int count=0;

        for (int i = 0; i < arr.length; i++) {
            windowSum += arr[i];
            if (i >= X - 1) {
                if (windowSum > maxSum) {
                    count = 1;
                } else if (windowSum == maxSum) {
                    count++;
                }
                maxSum = Math.max(windowSum,maxSum);
                windowSum -= arr[i-(X-1)];
            }

        }

        if(maxSum==0){
            System.out.println("SAD");
        }else{
            System.out.println(maxSum);
            System.out.println(count);

        }


    }

}
