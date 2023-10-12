package SwExpertAcademy;


import java.io.*;
import java.util.StringTokenizer;

/*
https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV5PjKXKALcDFAUq&categoryId=AV5PjKXKALcDFAUq&categoryType=CODE&problemTitle=&orderBy=RECOMMEND_COUNT&selectCodeLang=ALL&select-1=1&pageSize=10&pageIndex=1
1936. 1대1 가위바위보 D1

 */
public class S1936 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int arr[] = new int[2];

        for (int i = 0; i < 2; i++) {
            arr[i]= Integer.parseInt(st.nextToken());
        }

        if(arr[0]>arr[1]){
            bw.write("A");
        }else bw.write("B");

        bw.close();
        br.close();
    }

}

