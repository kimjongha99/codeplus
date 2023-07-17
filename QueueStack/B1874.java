package QueueStack;

import java.util.Scanner;
import java.util.Stack;

/*
https://www.acmicpc.net/problem/2164
카드2

 */
public class B1874 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N];

        for (int i = 0; i < A.length; i++) {
            A[i] = sc.nextInt();
        }

        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int num = 1;
        boolean result = true;

        for (int i = 0; i < A.length; i++) {
            int su = A[i]; // 현재 수열의 수
            if (su >= num) {
                while (su >= num) {
                    stack.push(num++);
                    sb.append("+\n");
                }
            }

            if (!stack.isEmpty() && stack.peek() == su) {
                stack.pop();
                sb.append("-\n");
            } else {
                result = false;
                break;
            }
        }

        if (result) {
            System.out.println(sb.toString());
        } else {
            System.out.println("NO");
        }
    }
}