package SwExpertAcademy;


import java.io.*;

/*

https://swexpertacademy.com/main/code/problem/problemDetail.do?problemLevel=2&contestProbId=AV5PobmqAPoDFAUq&categoryId=AV5PobmqAPoDFAUq&categoryType=CODE&problemTitle=&orderBy=INQUERY_COUNT&selectCodeLang=ALL&select-1=2&pageSize=10&pageIndex=1

1954. 달팽이 숫자 D2


 */
public class S1954 {
    public static void main(String[] args) throws IOException {
        int N = 3;

        // 오, 하, 좌, 상 순서로 방향 배열 만들기
        int dirY[] = {0, 1, 0, -1};
        int dirX[] = {1, 0,-1 , 0};

        int[][] arr = new int[N][N];
        boolean[][] visited = new boolean[N][N];

        int value = 1;
        int direction = 0; // 시작 방향은 '오른쪽'

        // 시작 위치 설정 (x=0, y=0)
        int x = 0;
        int y = 0;

        while (value <= N*N) {
            arr[y][x] = value++;
            visited[y][x] = true;

            // 다음 위치 계산
            int nextX=x+dirX[direction];
            int nextY=y+dirY[direction];

            // 다음 위치가 유효한지 확인(배열 범위 내이고 아직 방문하지 않은 곳인지)
            if(nextX>=0 && nextY>=0 && nextX<N && nextY<N && !visited[nextY][nextX]){
                x=nextX;
                y=nextY;
            } else {
                direction=(direction+1)%4;
                x+=dirX[direction];
                y+=dirY[direction];
            }
        }

        // 출력 부분
        for(int i=0;i<N;i++) {
            for(int j=0;j<N;j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}


