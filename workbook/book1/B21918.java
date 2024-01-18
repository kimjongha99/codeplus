package workbook.book1;

//https://www.acmicpc.net/problem/21918
//전구

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B21918 {

    static  int [] arr;
    static  int a,b,c;

    static void func1(int b, int c) {
        arr[b] = c;
    }
    static void  func2(int b, int c) {
        for (int start = b; start <= c; start++) {
            if (arr[start] == 0) {
                arr[start]=1;
            }else{
                arr[start]=0;
            }
        }
    }

    static void func3(int b, int c) {
        for (int start = b; start <= c; start++) {
            arr[start]=0;
        }

    }
    static void func4(int b, int c) {
        for (int start = b; start <= c; start++) {
            arr[start]=1;
        }

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        arr = new int[N + 1];

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }


        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
             a = Integer.parseInt(st.nextToken());
             b = Integer.parseInt(st.nextToken());
             c = Integer.parseInt(st.nextToken());

            if (a == 1) {
                func1(b,c);
            }
            if(a==2){
                func2(b,c);
            }
            if (a == 3) {
                func3(b, c);
            }
            if (a == 4) {
                func4(b, c);
            }
        }
        for (int i = 1; i <= arr.length-1; i++) {
            System.out.print(arr[i]+" ");
        }
    }

}
