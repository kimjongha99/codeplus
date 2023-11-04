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

    static int findZull(int[][] arr) {
        int sumZul = 0;
        for (int y = 0; y < arr.length; y++) {
            for (int x = 0; x < arr[y].length; x++) {
                sumZul += arr[y][x];
            }
        }

        if (sumZul == 405) {
            return 1;
        } else
            return 0;
    }

    static int findHang(int[][] arr) {
        int sumHang = 0;
        for (int x = 0; x < arr.length; x++) {
            for (int y = 0; y < arr[x].length; y++) {
                sumHang += arr[y][x];
            }
        }
        if (sumHang == 405) {
            return 1;
        } else
            return 0;
    }

    static boolean findThree(int[][] arr) {
        for (int y = 0; y < 9; y += 3) {
            for (int x = 0; x < 9; x += 3) {
                boolean[] blockCheck = new boolean[9];
                for (int i = y; i < y + 3; i++) {
                    for (int j = x; j < x + 3; j++) {
                        if (arr[i][j] < 1 || arr[i][j] > 9 || blockCheck[arr[i][j] - 1]) {
                            return false;
                        }
                        blockCheck[arr[i][j] - 1] = true;
                    }
                }
            }
        }

        return true;
    }

            public static void main (String[]args) throws IOException {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                StringTokenizer st = new StringTokenizer(br.readLine());

                int tc = Integer.parseInt(st.nextToken());

                for (int T = 1; T <= tc; T++) {

                    arr = new int[9][9];

                    for (int i = 0; i < 9; i++) {
                        st = new StringTokenizer(br.readLine());
                        for (int j = 0; j < 9; j++) {
                            int num = Integer.parseInt(st.nextToken());
                            arr[i][j] = num;
                        }

                    }

                    int hanZull = findZull(arr);

                    int hanhHang = findHang(arr);

                    boolean threeThree = findThree(arr);

                    if (hanZull == hanhHang == threeThree) {
                        System.out.println("1");
                    }else System.out.println("0");

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