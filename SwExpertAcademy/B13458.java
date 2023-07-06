package SwExpertAcademy;

import study.BufferedReader1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
acmicpc.net/problem/13458
시험 감독


N개의 시험장이있음
N개의 시험장마다 응시자들이있음.

i번 시험장에잇는 응시자수는 A명이다.

감독관은 총감독관 ,부감독관 두종류.
총감독관 이 감시할수있는 응시자수는 B명
부감독관이  감시할수있는 응시자수는 C명

각각의 시험장에는 총감독관1명, 부감독관 N명
각시험장마다 응시생들를 모두 감시해야함.
이때 필요한 감독관의 최솟값수.


answer = 감독관의수
1. 총감독관의 수만큼 answer를 +n 한다.
2. 응시자수가 담긴 arr를 for문돌리며
2-1. 총감독관이 감독할수있는 b만큼 arr에서 빼줌.
2-2. arr[i]가 0보다 작거나 같으면 contine한다.
2-3. arr[i] 을 부감독관이 감독할수이는 수 (c)로 나눈다.

입력
3  =첫째 줄에 시험장의 개수
3 4 5  =둘째 줄에는 각 시험장에 있는 응시자의
2 2   =셋째 줄에는 B와 C가 주어진다
출력
7 =각 시험장마다 응시생을 모두 감독하기 위해 필요한 감독관의 최소 수를 출력한다.

 */
public class B13458 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int n = Integer.parseInt(br.readLine());
        StringTokenizer st;

        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());


        long answer = 0;

        answer += n;

        for (int i = 0; i < n; i++) {
            arr[i] -=b;
            if(arr[i]<=0) continue;

            answer += arr[i]/c;
            if (arr[i] % c != 0) {
                answer++;
            }
        }
        System.out.println(answer);
    }
}
