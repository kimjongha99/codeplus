package 개념;


//https://leetcode.com/problems/number-of-islands/


//섬의 개수


import java.util.ArrayDeque;
import java.util.Deque;

public class leetcode200 {

    static int dx[]= {0,0, 1,-1};
    static int dy[]= {1,-1,0,0};


    private static int islandDFSStack(char[][] grid2) {
        int rows = grid2.length;
        int cols = grid2[0].length;
        int cnt =0;
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if(grid2[row][col]=='1'){
                   cnt++;
                    Deque<int[]> stack = new ArrayDeque<>();
                    stack.push(new int[]{row, col});

                    while (!stack.isEmpty()) {
                        int[] current = stack.pop();
                        int x = current[0];
                        int y = current[1];
                        grid2[x][y] ='0';
                        for (int i = 0; i < 4; i++) {
                            int nx =x +dx[i];
                            int ny =y +dy[i];

                            if (nx >= 0 && nx < rows && ny >= 0 && ny < cols && grid2[nx][ny] == '1') {
                                stack.push(new int[]{nx,ny});
                            }
                        }
                    }
                }
            }
        }
        return cnt;
    }



    public static void main(String[] args) {

        char[][] grid2 = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        };

          if (islandDFSStack(grid2) != 3) throw new AssertionError();
    }


}
