package SwExpertAcademy;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

/*
https://swexpertacademy.com/main/code/problem/problemDetail.do?problemLevel=2&contestProbId=AV5PwGK6AcIDFAUq&categoryId=AV5PwGK6AcIDFAUq&categoryType=CODE&problemTitle=&orderBy=RECOMMEND_COUNT&selectCodeLang=JAVA&select-1=2&pageSize=10&pageIndex=2

조교의 성적 매기기
 */
public class S1983 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());

        for (int t = 1; t <= tc; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken()); //학생수
            int K = Integer.parseInt(st.nextToken()); //학점을 알고싶은 학생의 번호

            Integer [] stu = new Integer[N];

            for(int i=0; i<N; i++){
                st= new StringTokenizer(br.readLine());
                double mid =Integer.parseInt(st.nextToken());
                double finals =Integer.parseInt(st.nextToken());
                double assignment =Integer.parseInt(st.nextToken());

                double sumScore = (mid * 35.0 / 100) + (finals * 45.0 / 100) + (assignment * 20.0 / 100);

                stu[i] = (int) Math.round(sumScore);

            }
            // 정렬 전 K번 학생의 총점을 복사해 둡니다.
            int kScore = stu[K - 1];

            // 총점 배열을 내림차순으로 정렬합니다.
            Arrays.sort(stu,Collections.reverseOrder());


            int rank=0;
            for (int i = 0; i < stu.length; i++) {
                if(kScore==stu[i]){
                    rank=i+1;
                    break;
                    }
            }

            // 학점을 매기기 위한 기준 배열입니다.
            String[] grades = {
                    "A+", "A0", "A-", "B+", "B0", "B-", "C+", "C0", "C-", "D0"
            };
            // 학점을 결정합니다. (등수 / 학생 수) * 10을 통해 상위 몇 %에 해당하는지 계산합니다.
            int gradeIndex = (int) ((rank - 1) / (N / 10.0));

            String grade = grades[gradeIndex];

            System.out.println("#" + t + " " + grade);

        }

    }
}
