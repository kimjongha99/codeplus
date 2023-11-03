package SwExpertAcademy;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*

https://swexpertacademy.com/main/code/problem/problemDetail.do?problemLevel=3&contestProbId=AWT-lPB6dHUDFAVT&categoryId=AWT-lPB6dHUDFAVT&categoryType=CODE&problemTitle=&orderBy=RECOMMEND_COUNT&selectCodeLang=JAVA&select-1=3&pageSize=10&pageIndex=1

햄버거 다이어트
 */
public class S5215 {
    static  int N; //햄버거수
    static  int L; // 제한 칼로리수
    static  int [][] data;  // 맛점수 , 칼로리 배열
    static  boolean [] sel; // 선택조합 배열
    static  int ans; // 최댓값

    static void  dfs(int idx, int score, int cal){  //깊이,맛점수 , 칼로리
        if (cal > L) {  //칼로리가 L을초과하면 리턴
            return;
        }
        //모든 재료를 고려했다면, 필요한 최대 점수갱신
        if (idx == N) {
            ans = Math.max(ans,score);
            return;
        }
        sel[idx]=true;
        dfs(idx + 1, score + data[idx][0], cal + data[idx][1]);
        // 현재 재료를 제외
        sel[idx] = false;
        dfs(idx + 1, score, cal);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());



        for (int t = 1; t <= T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            N = Integer.parseInt(st.nextToken());
            L = Integer.parseInt(st.nextToken());

            data = new int[N][2];
            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                data[i][0] = Integer.parseInt(st.nextToken());
                data[i][1] = Integer.parseInt(st.nextToken());
            }

            sel= new boolean[N];
            ans=0;//최댓값
            dfs(0,0,0);
            System.out.println("#"+t+" "+ans );












        }
    }


}
