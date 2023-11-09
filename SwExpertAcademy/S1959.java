package SwExpertAcademy;


import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
https://swexpertacademy.com/main/code/problem/problemDetail.do?problemLevel=2&contestProbId=AV5PpoFaAS4DFAUq&categoryId=AV5PpoFaAS4DFAUq&categoryType=CODE&problemTitle=&orderBy=RECOMMEND_COUNT&selectCodeLang=JAVA&select-1=2&pageSize=10&pageIndex=2
두개의 숫자열

 */
public class S1959 {
    static int findMax(int[] arrA, int[] arrB) {
        int maxSum = Integer.MIN_VALUE;

        int shorter[] = arrA.length> arrB.length ? arrB:arrA;
        int Longer[] = arrA.length>arrB.length? arrA:arrB;

        // 더 긴 배열에 대해 반복합니다.
        for (int start = 0; start <= Longer.length - shorter.length; start++) {
            int currentSum =0;
            for (int i = 0; i< shorter.length; i++) {
                currentSum += shorter[i]*Longer[start+i];
            }
            maxSum = Math.max(maxSum,currentSum);
        }


        return maxSum;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int tc = Integer.parseInt(br.readLine());

        for (int t = 1; t <= tc; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            int arrA[] = new int[A];
            int arrB[] = new int[B];
            st= new StringTokenizer(br.readLine());
            for (int i = 0; i < A; i++) {
                arrA[i] = Integer.parseInt(st.nextToken());
            }
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < B; i++) {
                arrB[i] = Integer.parseInt(st.nextToken());
            }

            int maxSum = findMax(arrA,arrB);

            bw.write("#"+t+" "+maxSum);
            bw.newLine();


        }
        bw.close();
        br.close();
    }
}