package QueueStack;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
https://www.acmicpc.net/problem/2161

카드1
 */
public class B2161 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int num =1;
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            queue.add(num++);
          }


        while (queue.size() != 1) {
            int s =queue.poll();
            System.out.print(s + " ");
            int qu=queue.poll();
            queue.add(qu);
        }
        System.out.print(queue.poll());

    }
}
