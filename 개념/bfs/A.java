package 개념.bfs;


//현수는 놀이터에서 놀다가 집으로 가려고 합니다. 놀이터의 위치와 집의 위치가 수직선상의
//        좌표 점으로 주어집니다. 놀이터는 수직선상의 0지점입니다.
//        현수는 놀이터에서 스카이콩콩을 타고 점프를 하면서 집으로 이동하려고 합니다.
//        점프는 다음과 같은 규칙으로 합니다.
//        1) 현재 지점에서 앞으로 +1 만큼 점프이동할 수 있습니다.
//        2) 현재 지점에서 뒤쪽으로 -1 만큼 점프이동할 수 있습니다.
//        3) 현재 지점에서 앞쪽으로 +5 만큼 긴 점프이동을 할 수있습니다.
//        매개변수 home에 현수의 집의 위치가 주어지면 놀이터에서 집까지 최소 몇 번의 점프로 집에
//        도착할 수 있는지 최소 점프횟수를 구하여 반환하세요.

import java.util.LinkedList;
import java.util.Queue;

public class A {

    static int bfs(int home) {
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[10001];
        queue.add(0);
        visited[0] = true;
        int L = 0;

        while (!queue.isEmpty()) {
            int n = queue.size();
            for (int i = 0; i < n; i++) {
                int x = queue.poll();
                if (x == home) {
                    return L;
                }
                int[] values = {x - 1, x+ 1, x + 5};
                for (int nx : values) {
                    if (nx >= 0 && nx <= 10000 && !visited[nx]) {
                        queue.add(nx);
                        visited[nx] = true;
                    }
                }
            }
            L++;
        }
        return -1;
    }

    static int Solution(int home) {
        int ans =bfs(home);

        return ans;
    }

    public static void main(String[] args) {


        System.out.println(Solution(14));
    }
}
