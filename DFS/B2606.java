package DFS;


import java.util.Scanner;

/*
https://www.acmicpc.net/problem/2606

바이러스

 */
public class B2606 {
    static  boolean [][] graph;
    static  boolean [] visited;
    static  int N,M;
    static  int answer;
    public  static  void dfs(int idx){
        answer++;
        visited[idx]= true;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //컴퓨터수
        int N = sc.nextInt();

        //컴퓨터 쌍의 수
        int M = sc.nextInt();

        //그래프의 수
        graph =new boolean[N+1][N+1];
        //방문수
        visited = new boolean[N+1];

        //1. 그래프 정보 입력.
        int x,y;
        for (int i = 0; i < M; i++) {
            x=sc.nextInt();
            y= sc.nextInt();
            graph[x][y] = graph[y][x] = true;
        }

        //2. dfs 출력
        dfs(1);
        System.out.println(answer-1  );
    }

}
