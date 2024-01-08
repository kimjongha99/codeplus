package SwExpertAcademy;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
https://swexpertacademy.com/main/code/problem/problemDetail.do?problemLevel=2&contestProbId=AV5PnnU6AOsDFAUq&categoryId=AV5PnnU6AOsDFAUq&categoryType=CODE&problemTitle=&orderBy=RECOMMEND_COUNT&selectCodeLang=JAVA&select-1=2&pageSize=10&pageIndex=2

날짜 계산기
 */
public class S1948 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        StringTokenizer st ;

        for (int t = 1; t <= tc; t++) {
             st = new StringTokenizer(br.readLine());
            int month = Integer.parseInt(st.nextToken());
            int day = Integer.parseInt(st.nextToken());
            int nextMonth = Integer.parseInt(st.nextToken());
            int nextDay = Integer.parseInt(st.nextToken());


            int[] dayInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            int ans =0;

            if (month == nextMonth) {
                ans = nextDay-day+1;
            }else{
                int dayOne = dayInMonth[month]-day;
                int dayEnd = nextDay;

                for (int m = month+1; m < nextMonth; m++) {
                    ans += dayInMonth[m];
                }
                ans += dayOne + dayEnd + 1; // 시작일과 종료일을 포함하기 위해 +1
            }
            System.out.println("#" + t + " " + ans);

        }
        br.close();

    }
}
