
package SwExpertAcademy;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
https://swexpertacademy.com/main/code/problem/problemDetail.do?problemLevel=3&contestProbId=AYEXgKnKKg0DFARx&categoryId=AYEXgKnKKg0DFARx&categoryType=CODE&problemTitle=&orderBy=FIRST_REG_DATETIME&selectCodeLang=JAVA&select-1=3&pageSize=10&pageIndex=2#none

격자판 칠하기
 */
public class S14413 {
    static  char [][] map;
    // 방향 벡터를 전역으로 선언
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    // 주어진 좌표와 색상에 대해 인접한 셀들이 동일한 색상을 갖는지 검사
    static boolean checkAdjacent(int x, int y, char color, int N, int M) {
        for (int dir = 0; dir < 4; dir++) {
            int nx = x + dx[dir], ny = y + dy[dir];
            if (nx >= 0 && nx < N && ny >= 0 && ny < M && map[nx][ny] == color) {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st =new StringTokenizer(br.readLine());


        int t = Integer.parseInt(st.nextToken());

        for (int tc = 1; tc <= t; tc++) {
            st= new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            map = new char[N][M];
            for (int i = 0; i < N; i++) {
                String  str=  br.readLine();
                for (int j = 0; j < M; j++) {
                    map[i][j]= str.charAt(j);
                }
            }

            boolean possible = true;
            for (int i = 0; i < N && possible; i++) { // 'possible'을 조건으로 추가
                for (int j = 0; j < M; j++) {
                    if (map[i][j] == '?') {
                        if (checkAdjacent(i, j, '#', N, M)) {
                            map[i][j] = '#';
                        } else if (checkAdjacent(i, j, '.', N, M)) {
                            map[i][j] = '.';
                        } else {
                            possible = false;
                            break;
                        }
                    }
                }
            }

            System.out.println("#" + tc + " " + (possible ? "possible" : "impossible"));



        }


    }

}
