package PriorityQueue;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

/*
https://www.acmicpc.net/problem/11286

절댓값 힙
 */
public class B11286 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> queue = new PriorityQueue<>((o1,o2)->{
            int first_abs = Math.abs(o1);
            int second_abs = Math.abs(o2);
            if (first_abs == second_abs) {
                return o1>o2  ? 1:-1;
            }
            return first_abs-second_abs;
        }

        );

    }
}
