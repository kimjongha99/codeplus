package SwExpertAcademy;

public class Test {
    public static void main(String[] args) {
        int[][] arr = {
                {13, 24, 13, 24, 1},
                {26, 14, 19, 3, 26},
                {11, 9, 29, 13, 26},
                {20, 28, 29, 21, 27},
                {20, 3, 28, 28, 1}
        };

        int rows = arr.length;
        int cols = arr[0].length;

        for (int i = 0; i < rows; i++) { // 각 행을 순회
            for (int j = 0; j < cols; j++) { // 각 열을 순회
                System.out.print("행 " + i + ", 열 " + j + " 의 값: " + arr[i][j] + "  |  ");
            }
            System.out.println(); // 각 행의 끝에서 줄바꿈
        }
    }
}
