package SwExpertAcademy;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
https://swexpertacademy.com/main/code/problem/problemDetail.do?problemLevel=3&contestProbId=AV5LsaaqDzYDFAXc&categoryId=AV5LsaaqDzYDFAXc&categoryType=CODE&problemTitle=&orderBy=RECOMMEND_COUNT&selectCodeLang=JAVA&select-1=3&pageSize=10&pageIndex=2

진기의 붕어빵
 */
public class S1860 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine());
        for (int t = 1; t <= tc; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());// 손님이 도착하는 시간의 개수
            int M = Integer.parseInt(st.nextToken()); // 붕어빵 하나를 만드는 시간
            int K = Integer.parseInt(st.nextToken());// M초의 시간 후에 만들어지는 붕어빵의 개수

            int [] arriveTime = new int[N];// 손님 도착 시간 배열
            String answer ="Possible";
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                arriveTime[i] =Integer.parseInt(st.nextToken());
            }

            Arrays.sort(arriveTime);

            for (int i = 0; i < N; i++) {
                // arriveTime[i]초까지 만들어진 붕어빵의 개수
                int bread= arriveTime[i]/M*K;
                int remain = bread - (i + 1);


            // 음수이면 손님에게 바로 제공할 붕어빵이 없는 것이므로 불가능하다.
            if (remain < 0) {
                answer = "Impossible";
                break;
            }
            }
            System.out.printf("#%d %s\n", t, answer);













        }
    }
}
