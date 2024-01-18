package 개념;

// 2차원 배열에서 1인 부분들이 몇군데인지 찾기


import java.util.Scanner;

public class C {
    static int [][] map;
    static  int n;
    static int count =0;
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {1, -1, 0, 0};

    static void  dfs(int row, int col){
        map[row][col] =0;

        for (int i = 0; i < 4; i++) {
            int newX = row + dx[i];
            int newY = col +dy[i];

            if (newX >= 0 && newY >= 0 && newX < n && newY < n && map[newX][newY] == 1) {
                dfs(newX,newY);
            }
        }

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
                    dfs(row,col);
                }
            }
        }

        System.out.println(count);

    }
}
