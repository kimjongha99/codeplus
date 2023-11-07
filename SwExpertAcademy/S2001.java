package SwExpertAcademy;


import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

/*

파리퇴치
https://swexpertacademy.com/main/code/problem/problemDetail.do?problemLevel=2&contestProbId=AV5PzOCKAigDFAUq&categoryId=AV5PzOCKAigDFAUq&categoryType=CODE&problemTitle=&orderBy=SUBMIT_COUNT&selectCodeLang=JAVA&select-1=2&pageSize=10&pageIndex=1

 */
public class S2001 {
    static  int [][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int tc = Integer.parseInt(st.nextToken());

        for (int t = 1; t <= tc; t++) {
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            arr= new int[N+5][N+5];


            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < N; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            int maxFlies = 0;

            for (int i = 0; i <= N - M; i++) {
                for (int j = 0; j <= N - M; j++) {

                    int sum=0;
                    for (int k = 0; k < M; k++) {
                        for (int h = 0; h < M; h++) {
                            sum += arr[i+k][j+h];
                        }
                    }
                    maxFlies = Math.max(sum,maxFlies);
                }
            }

            System.out.println("#"+t+" "+maxFlies);

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