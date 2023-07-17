package BackJoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
카드2
https://www.acmicpc.net/problem/2164
 */
public class B2164 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int num=1;
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            queue.add(num++);
        }

        while (queue.size() > 1) {
             queue.poll();
             int temp =queue.poll();
             queue.add(temp);

        }
        System.out.println(queue.poll());

    }
}
