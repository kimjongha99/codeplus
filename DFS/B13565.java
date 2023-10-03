package DFS;


import java.io.*;
import java.util.StringTokenizer;
import java.util.Vector;

/*
https://www.acmicpc.net/problem/13565

침투
 */
public class B13565 {
    static final int MAX = 1000 + 10;
    static boolean[][] map;
    static boolean[][] visited;
    static int N, M;
    static boolean answer;  // 왜 boolean 배열로 쓰나요?

    static int[] dirY = {-1, 1, 0, 0};
    static int[] dirX = {0, 0, -1, 1};

    static void dfs(int y, int x) {
        if (y == N) {
            answer = true;
            return;
        }

        visited[y][x] = true;
        for (int i = 0; i < 4; i++) {
            int newY = y + dirY[i];
            int newX = x + dirX[i];

            if (map[newY][newX] && visited[newY][newX] == false) {
                dfs(newY, newX);
            }
        }
    }


        public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());


        map = new boolean[MAX][MAX];
        visited = new boolean[MAX][MAX];

        //맵정보 저장
        for (int i = 1; i <= N; i++) {
            String str = br.readLine();
            for (int j = 1; j <= M; j++) {
                map[i][j] = (str.charAt(j - 1) == '0' ? true : false);
            }
        }

        //dfs
        for (int j = 1; j <= M; j++) {
            if (map[1][j]) {          // 왜 map[1][j] 일까요
                dfs(1, j);           //  또한 dfs도왜 1,j 일가요
            }
        }

        if (answer){
            System.out.print("YES");
        }else
            System.out.print("NO");
    }



    }



