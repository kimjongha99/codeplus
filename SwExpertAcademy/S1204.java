package SwExpertAcademy;

import java.io.*;
import java.util.StringTokenizer;

/*

https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV13zo1KAAACFAYh&categoryId=AV13zo1KAAACFAYh&categoryType=CODE&problemTitle=1204&orderBy=FIRST_REG_DATETIME&selectCodeLang=ALL&select-1=&pageSize=10&pageIndex=1
1204. [S/W 문제해결 기본] 1일차 - 최빈수 구하기

 */
public class S1204 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= T; tc++) {

            int N = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int arr[] = new int[1000];

            for (int i = 0; i < 1000; i++) {
            arr[i]= Integer.parseInt(st.nextToken());
            }

            int count[] =new int[1000];

            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    if(arr[i]==arr[j]){
                        count[i]+=1;
                    }
                }
            }


            int maxValue = count[0]; // 첫 번째 요소로 초기화
            int maxIndex = 0; // 첫 번째 요소의 인덱스로 초기화

            for(int i=0; i<count.length;i++){
                if(count[i] > maxValue) { // 현재 요소가 최대값보다 크면
                    maxValue = count[i]; // 최대값 갱신
                    maxIndex = i; // 최대값의 위치 갱신
                }
            }

            bw.write("#"+N+" "+arr[maxIndex]);
            bw.newLine();

        }
        bw.close();
        br.close();


    }
}
