package SwExpertAcademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
https://swexpertacademy.com/main/code/problem/problemDetail.do?problemLevel=2&contestProbId=AV5Psz16AYEDFAUq&categoryId=AV5Psz16AYEDFAUq&categoryType=CODE&problemTitle=&orderBy=INQUERY_COUNT&selectCodeLang=ALL&select-1=2&pageSize=10&pageIndex=1

1974. 스도쿠 검증

 */
public class S1974 {
    static int[][] arr;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int tc = Integer.parseInt(st.nextToken());

        for (int T = 1; T <= tc; T++) {

            arr = new int[9][9];

            for (int y = 0; y < 9; y++) {
                st = new StringTokenizer(br.readLine());
                for (int x = 0; x < 9; x++) {
                    int num = Integer.parseInt(st.nextToken());

                    arr[y][x] = num;
                }
            }

                boolean isSudoku = true;
                for (int i = 0; i < 9; i++) {
                    boolean[] rowCheck = new boolean[9];
                    boolean[] colCheck = new boolean[9];

                    for (int j = 0; j < 9; j++) {
                        // Check row
                        if (rowCheck[arr[i][j] - 1]) {
                            isSudoku = false;
                            break;
                        }
                        rowCheck[arr[i][j] - 1] = true;
                        // Check column
                        if (colCheck[arr[j][i] - 1]) {
                            isSudoku = false;
                            break;
                        }
                        colCheck[arr[j][i] - 1] = true;
                    }

                    if (!isSudoku) break;
                }

                // Check 3x3 grids
                for (int row = 0; row < 9; row += 3) {
                    for (int col = 0; col < 9; col += 3) {
                        if (!isSudoku) break;

                        boolean[] gridCheck = new boolean[9];
                        for (int r = row; r < row + 3; r++) {
                            for (int c = col; c < col + 3; c++) {
                                if (gridCheck[arr[r][c] - 1]) {
                                    isSudoku = false;
                                    break;
                                }
                                gridCheck[arr[r][c] - 1] = true;
                            }
                            if (!isSudoku) break;
                        }
                    }
                    if (!isSudoku) break;
                }
            System.out.println("#" + T + " " + (isSudoku ? 1 : 0));

            }
        }
    }

/*
2차원배열값보기
   for(int i=0; i<arr.length; i++) {
                for(int j=0; j<arr.length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println(); // 한 행이 끝나면 줄바꿈
            }
 */