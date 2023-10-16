package study1;


import java.io.*;

/*
숫자의 개수
https://www.acmicpc.net/problem/2577

이전문제와 마찬가지로
 */
public class B2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int A =Integer.parseInt(br.readLine());
        int B =Integer.parseInt(br.readLine());
        int C =Integer.parseInt(br.readLine());

        String  ans= String.valueOf(A*B*C);
        int arr[] = new int[10];


        for (int i = 0; i < ans.length(); i ++) {
            char st = ans.charAt(i);
            arr[st-48]++;  // 아스키 코드 상  문자 - 48, ex) 문자 48 - 48은 0
        }

        for (int i = 0; i < 10; i++) {
            bw.write(String.valueOf(arr[i]));
            bw.newLine();
        }

        br.close();
        bw.close();
    }
}
