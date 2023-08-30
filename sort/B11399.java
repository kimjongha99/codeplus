package sort;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
https://www.acmicpc.net/problem/11399

ATM
 */
public class B11399 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        // Pi 값들 입력 받기
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        //배열을 오름차순으로 정렬
        Arrays.sort(arr);
        int sum = 0;  //총 합
        int add = 0;  //더할 수
        for (int i = 0; i < n; i++) {
            add += arr[i];
            sum += add;
        }
        System.out.print(sum);
    }
}