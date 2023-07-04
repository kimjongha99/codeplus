package codingTest;

import javax.swing.plaf.nimbus.State;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CodingTest {
    static ArrayList<Integer> result = new ArrayList<>();
    static  int cnt =0;
    static int  sum =0;
    static  ArrayList<Integer> searchxy = new ArrayList<>();

    private static void solution(int sizeOfMatrix, int[][] matrix) {

        int[][] check = new int[sizeOfMatrix][sizeOfMatrix];

        for (int i = 0; i < sizeOfMatrix; i++) {

            for (int j = 0; j < sizeOfMatrix; j++) {

                if (matrix[i][j] == 1 && check[i][j] == 0) {
                    check[i][j]= 1;
                    searchxy.add(i);
                    searchxy.add(j);
                    search(check, matrix, i, j);
                    cnt++;
                    result.add(sum);
                    sum =0;
                }
            }
        }
        System.out.println(cnt);
        if (cnt > 0) {
            Collections.sort(result);
            for (int i = 0; i < result.size(); i++) {
                System.out.println(result.get(i)+" ");
            }
        }
    }

    public static void search(int[][] check, int[][] matrix, int i, int j) {

        sum ++;
        int x = searchxy.remove(0);
        int y = searchxy.remove(0);

        if (y + 1 < matrix.length && matrix[x][y + 1] == 1 && check[x][y + 1] == 0) {
            check[x][y + 1]=1;
            searchxy.add(x);
            searchxy.add(y+1);
            search(check, matrix, x, y + 1);

        }
        if(y - 1 > -1  && matrix[x][y -1] == 1 && check[x][y - 1] == 0){
            check[x][y-1]=1;
            searchxy.add(x);
            searchxy.add(y-1);
            search(check, matrix, x, y - 1);
        }
        if(x - 1 > -1  && matrix[x-1][y ] == 1 && check[x-1][y] == 0){
            check[x-1][y]=1;
            searchxy.add(x-1);
            searchxy.add(y);
            search(check, matrix, x-1, y);
        }
        if(x +1 < matrix.length && matrix[x+1][y] == 1 && check[x+1][y] == 0){
            check[x+1][y]=1;
            searchxy.add(x+1);
            searchxy.add(y);
            search(check, matrix, x+1, y );
        }
        if (searchxy.size() == 0) {
            return;
        }

    }
    private static  class InputData{
        int sizeOfMatrix;
        int [][] matrix;
    }
    private  static  InputData processStdin() {
    InputData inputData = new InputData();

        try (Scanner sc = new Scanner(System.in)) {
            inputData.sizeOfMatrix = Integer.parseInt(sc.nextLine().replaceAll("\\s+", " "));
            inputData.matrix = new int[inputData.sizeOfMatrix][inputData.sizeOfMatrix];
            for (int i = 0; i < inputData.sizeOfMatrix; i++) {
                String[] buf = sc.nextLine().trim().replaceAll("\\s+", " ").split(" ");
                for (int j = 0; j < inputData.sizeOfMatrix; j++) {
                    inputData.matrix[i][j] = Integer.parseInt(buf[j]);
                }
            }

        } catch (Exception e) {
            throw e;
        }
        return inputData;
    }

    public static void main(String[] args) throws Exception {
        InputData inputData = processStdin();
        solution(inputData.sizeOfMatrix, inputData.matrix);
    }
}
