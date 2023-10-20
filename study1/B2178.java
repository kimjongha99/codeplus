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
//
//    static  int max = 100+10;
//    static  int map[][];
//    static  boolean visited[][];
//
//    static  int dirY[]={-1,1,0,0};
//    static int dirX[] = {0, 0, -1, 1};
//
//    static void dfs(int y, int x) {
//        visited[y][x]=true;
//        for (int i = 0; i < 4; i++) {
//            int newY = y + dirY[i]+1;
//            int newX = x + dirX[i]+1;
//
//            if (newY < 0 || newY >= N || newX < 0 || newY >= N) {
//                continue;
//            }
//            if (visited[newY][newX] == false && map[newY][newX] == 1) {
//                map[newY][newX]=map[y][x] + 1;
//                dfs(y,x);
//
//            }else {
//                if (map[newY][newX] > 1 && map[newY][newX] > map[y][x] + 1) {
//                    map[newY][newX]= map[y][x]+1;
//                    dfs(newY,newX);
//                }
//            }
//
//        }
//
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
//        //BFS 실행. 나는1,1에 저장했기때문에 1,1부터 시장
//        dfs(1,1);
//
//        System.out.println(map[N][M]);
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
