package codingTest;

import java.util.*;

public class RegionFinder {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 0, 1, 0, 0},
                {1, 1, 0, 1, 0},
                {0, 0, 1, 0, 1},
                {1, 0, 1, 1, 1},
                {0, 1, 0, 0, 0}
        };

        int numRegions = 0;
        List<Integer> regionSizes = new ArrayList<>();

        int rows = matrix.length;
        int cols = matrix[0].length;
        boolean[][] visited = new boolean[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 1 && !visited[i][j]) {
                    int regionSize = dfs(matrix, visited, i, j);
                    numRegions++;
                    regionSizes.add(regionSize);
                }
            }
        }

        Collections.sort(regionSizes);

        System.out.println("Number of regions: " + numRegions);
        System.out.println("Size of each region in ascending order:");
        for (int size : regionSizes) {
            System.out.println(size);
        }
    }

    private static int dfs(int[][] matrix, boolean[][] visited, int row, int col) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        if (row < 0 || row >= rows || col < 0 || col >= cols || matrix[row][col] == 0 || visited[row][col]) {
            return 0;
        }

        visited[row][col] = true;

        int size = 1;

        size += dfs(matrix, visited, row - 1, col); // Up
        size += dfs(matrix, visited, row + 1, col); // Down
        size += dfs(matrix, visited, row, col - 1); // Left
        size += dfs(matrix, visited, row, col + 1); // Right

        return size;
    }
}
