package SwExpertAcademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
https://swexpertacademy.com/main/code/problem/problemDetail.do?problemLevel=2&contestProbId=AV5PuPq6AaQDFAUq&categoryId=AV5PuPq6AaQDFAUq&categoryType=CODE&problemTitle=&orderBy=RECOMMEND_COUNT&selectCodeLang=JAVA&select-1=2&pageSize=10&pageIndex=1

1979. 어디에 단어가 들어갈 수 있을까
 */
public class S1979 {

    static int map[][];
    static int N;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int t = 1; t <= tc; t++) {
            st = new StringTokenizer(br.readLine());

            N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());

            map = new int[N][N];

            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < N; j++) {
                    map[i][j] = Integer.parseInt(st.nextToken());
                }
            }
             int ans = 0;
            //가로줄
            for (int i = 0; i < N; i++) {
                int tempCount = 0;
                for (int j = 0; j < N; j++) {
                    if (map[i][j] == 1) tempCount++;
                    if (map[i][j] == 0 || j == N - 1) {
                        if (tempCount == K) ans++;
                        tempCount = 0;
                    }
                }
            }
            // 세로줄 검사
            for (int i = 0; i < N; i++) {
                int tempCount = 0; // 임시 카운트 변수
                for (int j = 0; j < N; j++) {
                    if (map[j][i] == 1) tempCount++; // 1을 만나면 카운트 증가
                    if (map[j][i] == 0 || j == N - 1) { // 0을 만나거나 열의 끝에 도달하면
                        if (tempCount == K) ans++; // 카운트가 K와 같으면 결과 카운트 증가
                        tempCount = 0; // 임시 카운트 초기화
                    }
                }
            }

            // 결과 출력
            System.out.println("#" + t + " " + ans);

        }
    }
}