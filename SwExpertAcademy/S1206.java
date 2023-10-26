package SwExpertAcademy;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

/*
https://swexpertacademy.com/main/solvingProblem/solvingProblem.do
View

강변에 빌딩들이 옆으로 빽빽하게 밀집한 지역이 있다.

이곳에서는 빌딩들이 너무 좌우로 밀집하여, 강에 대한 조망은 모든 세대에서 좋지만 왼쪽 또는 오른쪽 창문을 열었을 때 바로 앞에 옆 건물이 보이는 경우가 허다하였다.

그래서 이 지역에서는 왼쪽과 오른쪽으로 창문을 열었을 때, 양쪽 모두 거리 2 이상의 공간이 확보될 때 조망권이 확보된다고 말한다.

빌딩들에 대한 정보가 주어질 때, 조망권이 확보된 세대의 수를 반환하는 프로그램을 작성하시오.

아래와 같이 강변에 8채의 빌딩이 있을 때, 연두색으로 색칠된 여섯 세대에서는 좌우로 2칸 이상의 공백이 존재하므로 조망권이 확보된다. 따라서 답은 6이 된다.


 */
public class S1206 {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        for(int test_case = 1; test_case <= 10; test_case++){
            int N = Integer.parseInt(br.readLine().trim());
            int arr[] = new int[N];


            StringTokenizer st  = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            int totalView = 0;
            for (int i = 2; i < N - 2; i++) {
                int currentHeight = arr[i];
                int maxSurroundingHeight = Math.max(
                        Math.max(arr[i-2], arr[i-1]),
                        Math.max(arr[i+1], arr[i+2]));

                int view = currentHeight - maxSurroundingHeight;

                if (view > 0) {
                    totalView+=view;
                }
                }

            System.out.println("#" + test_case + " " + totalView);
        }
    }
}
