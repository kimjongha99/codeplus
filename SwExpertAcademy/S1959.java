package SwExpertAcademy;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
https://swexpertacademy.com/main/code/problem/problemDetail.do?problemLevel=2&contestProbId=AV5PpoFaAS4DFAUq&categoryId=AV5PpoFaAS4DFAUq&categoryType=CODE&problemTitle=&orderBy=RECOMMEND_COUNT&selectCodeLang=JAVA&select-1=2&pageSize=10&pageIndex=2
두개의 숫자열

 */
public class S1959 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int arrA[] = new int[A];
        int arrB[] = new int[B];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < arrA.length; i++) {
            arrA[i] = Integer.parseInt(st.nextToken());
        }
        st=new StringTokenizer(br.readLine());
        for (int i = 0; i < arrB.length; i++) {
            arrB[i] = Integer.parseInt(st.nextToken());
        }

        // 최대 합을 계산합니다.
        int maxSum = findMaxProductSum(arrA, arrB);
        System.out.println(maxSum);
    }

    private static int findMaxProductSum(int[] A, int[] B) {
        // 더 짧은 배열과 더 긴 배열을 구분합니다.
        int[] shorter = A.length < B.length ? A : B;
        int[] longer = A.length < B.length ? B : A;

        int maxSum = Integer.MIN_VALUE;

        // 더 긴 배열에 대해 반복합니다.
        for (int start = 0; start <= longer.length - shorter.length; start++) {
            int currentSum = 0;
            // 더 짧은 배열의 각 요소를 더 긴 배열의 해당 위치와 곱합니다.
            for (int i = 0; i < shorter.length; i++) {
                currentSum += shorter[i] * longer[start + i];
            }
            // 최대 합을 갱신합니다.
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}