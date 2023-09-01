package DFS;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

/*
https://www.acmicpc.net/problem/11724
연결 요소의 개수


 */
public class B11724 {
    static  boolean graph[][];
    static  boolean visited[];

   static int N,M;
    static  int answer;

    static void dfs(int idx) {
        visited[idx] = true;
        for (int i = 1; i <= N; i++) {
            if (visited[i] == false && graph[idx][i]) {
                dfs(i);
            }
        }

    }
        public static void main(String[] args) throws IOException {
        //1.입력초기화
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(bf.readLine());
        N = Integer.parseInt(st.nextToken());
        M= Integer.parseInt(st.nextToken());

        //1. 그래프 연결정보주기
        //그래프의 수
        graph =new boolean[N+1][N+1];
        //방문수
        visited = new boolean[N+1];
        //1. 그래프 정보 입력.
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(bf.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            graph[x][y] = graph[y][x] = true;
        }

        //2. dfs 코드작성
        for (int i = 1; i <= N; i++) {
            if(!visited[i]) {
                dfs(i);
                answer++;
            }
        }

        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
    }


    }
