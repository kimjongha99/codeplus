package 개념.bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//검정색 영역 구하기
// 2차월배열입력받기
public class B {
    static int [][] map;
    static  int n;
    static int count =0;
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {1, -1, 0, 0};

    static int bfs(int row, int col) {
        Queue<int[]> q = new LinkedList<>();
        int level = 0;
        q.add(new int[]{row, col});
        map[row][col] = 0;

        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                int[] current = q.poll();
                for (int j = 0; j < 4; j++) {
                    int nx = current[0] + dx[j];
                    int ny = current[1] + dy[j];
                    if (nx >= 0 && nx < map.length && ny >= 0 && ny < map[0].length && map[nx][ny] == 1) {
                        q.add(new int[]{nx, ny});
                        map[nx][ny] = 0;
                    }
                }
            }
            level++;
        }
        return level - 1; // Subtract 1 to get the actual level depth
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        sc.nextLine();

        map = new int[n][n];

        for (int i = 0; i < n; i++) {
            String nums = sc.nextLine();
            for (int j = 0; j < n; j++) {
                map[i][j]= nums.charAt(j)-'0';
            }
        }

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if (map[row][col] == 1) {
                    count++;
                    bfs(row,col);
                    int areaLevel = bfs(row, col);
                    System.out.println("Area Level: " + areaLevel); // Print level of each area

                }
            }
        }

        System.out.println(count);
    }

}
