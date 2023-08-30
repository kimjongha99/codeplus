package sort;

/*
https://www.acmicpc.net/problem/1427

소트인사이드

 */

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class B1427 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        char[] arr = in.nextLine().toCharArray();


        Arrays.sort(arr);

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }
    }
}
