package study1;

/*

https://www.acmicpc.net/problem/3273

두  수의 합



//         for (int i = 0; i < arr.length; i++) {
//            for(int j= i + 1; j<arr.length; j++){
//                if (arr[i] + arr[j] == x) {
//                    ans++;
//                }
//                }
//            }
이중 포문 사용시 시간초과

 */

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B3273 {
  static    int arr[];

   public static int count(int N, int[] arr, int x){
       // 투 포인터 알고리즘을 사용하여 두 수의 합이 targetSum이 되는 쌍을 찾음
       int left = 0;
       int right = arr.length - 1;
       int sum =0;
       int ans =0;

       Arrays.sort(arr);

       while (left < right) {
            sum =arr[left]+arr[right];
            if(sum==x){
                ans++;
                left++;
                right--;
            }else if(sum<x){
                left++;
            }else {
                right--;
            }

       }

       return ans;
   }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());

        arr =new int[N];


        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());

        bw.write(String.valueOf(count(N,arr,x)));



        br.close();
        bw.close();
    }
}
