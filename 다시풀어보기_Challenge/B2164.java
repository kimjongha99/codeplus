package 다시풀어보기_Challenge;

//카드 2

// https://www.acmicpc.net/problem/2164

// 중하
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

// 문제 유형
public class B2164 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = n; i >= 1; i--) {
             deque.addFirst(i);
        }


        while (deque.size()>1) {
            deque.pollFirst();
            deque.addLast(deque.pollFirst());
        }
        if(deque.size()==1){
            System.out.println(deque.getFirst());
        }
    }
}
