package  study1;


//https://www.acmicpc.net/problem/2178
//미로 탐색


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class B2178 {
    static int[] dx = {0, 1, 0, -1};  // x축 이동
    static int[] dy = {1, 0, -1, 0};  // y출 이동

    static boolean visited[][];
    static int[][] A;
    static int N;
    static int M;

    static void bfs(int y, int x) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, y, 1});
        visited[y][x] = true;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();

            if (current[0] == M && current[1] == N) {
                System.out.println(current[2]);
                return;
            }

            for (int i = 0; i < 4; i++) {
                int nx = current[0] + dx[i];
                int ny = current[1] + dy[i];
                int ncount = current[2] + 1;

                if (nx > 0 && nx <= M && ny > 0 && ny <= N && !visited[ny][nx] && A[ny][nx] == 1) {
                    visited[ny][nx] = true;
                    queue.add(new int[]{nx, ny, ncount});
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        A = new int[N + 10][M + 10];
        visited = new boolean[N + 10][M + 10];
        for (int i = 1; i <= N; i++) {
            String str = br.readLine();
            for (int j = 1; j <= M; j++) {
                A[i][j] = str.charAt(j - 1) - '0';
            }
        }

        bfs(1,1);


    }
}








// dfs 풀이
//package study1;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.Map;
//import java.util.StringTokenizer;
//
///*
//https://www.acmicpc.net/problem/2178
//미로 탐색
//
//시간이 적은경우 -> bfs나 dfs로 완전탐색가능
//하지만 이문제의 경우 dfs는 댑스를 다저장하는반면 bfs는 바로 최단거리를 알수있기떄문에 bfs가낫다.
//
// */
//public class B2178 {
//    static  int N ,M;
//
//    static  int max = 100+10;
//    static  int map[][];
//    static  boolean visited[][];
//    static  int dirY[]={-1,1,0,0};
//    static int dirX[] = {0, 0, -1, 1};
//
//    static  int min=99999;
//
//    static void dfs(int y, int x, int count) {
//
//        if(y == N && x == M) { // Check if it reaches the destination
//            min = Math.min(count , min);
//            return;
//        }
//
//        visited[y][x]=true;
//
//        for (int i = 0; i < 4; i++) {
//            int newY = y + dirY[i];
//            int newX = x + dirX[i];
//
//            if (newY > 0 && newY <= N && newX > 0 && newX <= M &&
//                    map[newY][newX] == 1 && !visited[newY][newX]) {
//                dfs(newY,newX,count+1);
//                visited[newY][newX] = false; // Backtrack
//
//            }
//        }
//    }
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//
//        N = Integer.parseInt(st.nextToken());
//        M = Integer.parseInt(st.nextToken());
//
//        map= new int[max][max];
//        visited = new boolean[max][max];
//
//        for (int i = 1; i <= N; i++) {
//            String s = br.readLine();
//            for (int j = 1; j <= M; j++) {
//                map[i][j]= s.charAt(j-1)-'0';
//            }
//        }
//        dfs(1, 1, 1); // Start DFS from the beginning of the maze
//
//
//
//        System.out.println(min);
//
////
////        String x = "9";
////        System.out.println(x.charAt(0)-'0'); // 문자로표현된 숫자를 정수로바ㅆ뀔떄
//
//// Print the map
//        printMap();
//
//    }
//    public static void printMap() {
//        for (int i = 0; i <= N; i++) {
//            for (int j = 0; j <= M; j++) {
//                System.out.print(map[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
//}
