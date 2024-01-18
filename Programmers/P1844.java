package Programmers;

//https://school.programmers.co.kr/learn/courses/30/lessons/1844?language=java
// 게임맵 최단거리


import java.util.LinkedList;
import java.util.Queue;

public class P1844 {

    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {1, -1, 0, 0};
    static boolean[][] visited;

    public void bfs(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;
        visited = new boolean[n][m]; // 방문 배열 초기화

        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0,0});
        visited = new boolean[n][m]; // 방문 배열 초기화

        while (!queue.isEmpty()) {
            int[] point = queue.poll();
            int x = point[0];
            int y = point[1];

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx >= 0 && ny >= 0 && nx < n && ny < m && maps[nx][ny] == 1 && !visited[nx][ny]) {
                    queue.add(new int[]{nx, ny});
                    maps[nx][ny]=maps[x][y]+1;
                    visited[nx][ny] = true; // 방문한 위치 표시
                }
            }


        }
    }

    public int solution(int[][] maps) {
        bfs(maps);
        int n = maps.length;
        int m = maps[0].length;
        int answer = maps[n - 1][m - 1];

        return answer == 1 ? -1 : answer;



    }


    public static void main(String[] args) {
        int maps[][]= new int[][]{
                {1,0,1,1,1},
                {1,0,1,0,1},
                {1,0,1,1,1},
                {1,1,1,0,1},
                {0,0,0,0,1}
        };
        P1844 sol = new P1844();

        System.out.println(sol.solution(maps));
    }
}
