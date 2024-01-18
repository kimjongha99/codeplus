package SlidingWindow;

// 배열합치기

//https://www.acmicpc.net/problem/11728


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B11728 {
    static int[] arrA;
    static int[] arrB;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        arrA= new int[A];
        arrB = new int[B];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < A; i++) {
            arrA[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < B; i++) {
            arrB[i] = Integer.parseInt(st.nextToken());
        }

        // Merge arrays
        int[] mergedArray = mergeArrays(arrA, arrB);

        // Print the merged array
        for (int num : mergedArray) {
            System.out.print(num + " ");
        }
    }

    private static int[] mergeArrays(int[] arrayA, int[] arrayB) {
        int[] merged = new int[arrayA.length + arrayB.length];
        int indexA = 0, indexB = 0;

        for (int indexMerged = 0; indexMerged < merged.length; indexMerged++) {
            if (indexA < arrayA.length && (indexB >= arrayB.length || arrayA[indexA] <= arrayB[indexB])) {
                merged[indexMerged] = arrayA[indexA];
                indexA++;
            } else if (indexB < arrayB.length) {
                merged[indexMerged] = arrayB[indexB];
                indexB++;
            }
        }

        return merged;
    }


}
