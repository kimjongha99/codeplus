package study2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/*

숨바꼭질
 */
public class B1691 {
    static int[] check;
    static void bfs(int N, int K) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(N);

        while (queue.isEmpty() == false) {
            int nowNum = queue.poll();

            if (nowNum == K) {
                System.out.println(check[nowNum]);
                return;
            }


            int nextNum;

            //뒤로갔을때 , 0보다 커야하고 100000보다 작아야함. 글고방문하지않았어야함
            nextNum= nowNum-1;
            if (nextNum >= 0 && nextNum <= 100000 && check[nextNum] == 0) {
                queue.add(nextNum);
                check[nextNum] = check[nowNum]+1;
            }
            //앞으로 , 0보다 커야하고 100000보다 작아야함. 글고방문하지않았어야함
            nextNum= nowNum+1;
            if (nextNum >= 0 && nextNum <= 100000 && check[nextNum] == 0) {
                queue.add(nextNum);
                check[nextNum] = check[nowNum]+1;
            }
            //앞으로 , 0보다 커야하고 100000보다 작아야함. 글고방문하지않았어야함
            nextNum= nowNum*2;
            if (nextNum >= 0 && nextNum <= 100000 && check[nextNum] == 0) {
                queue.add(nextNum);
                check[nextNum] = check[nowNum]+1;
            }
        }

    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        check = new int[100000+10]; // to store time it takes to reach each point


        bfs(N, K);


    }
}
