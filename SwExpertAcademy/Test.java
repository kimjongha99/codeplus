package SwExpertAcademy;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int T = sc.nextInt(); // 테스트 케이스의 수

            for (int testCase = 1; testCase <= T; testCase++) {
                int N = sc.nextInt(); // 손님의 수
                int M = sc.nextInt(); // 붕어빵을 만드는 데 걸리는 시간
                int K = sc.nextInt(); // M초에 만들어지는 붕어빵의 수

                int[] arrivalTimes = new int[N];
                for (int i = 0; i < N; i++) {
                    arrivalTimes[i] = sc.nextInt();
                }

                // 손님들의 도착 시간을 정렬
                Arrays.sort(arrivalTimes);

                boolean possible = true;
                int bungeoppangMade = 0; // 현재까지 만들어진 붕어빵의 수
                int timeForNextBungeoppang = 0; // 다음 붕어빵이 만들어지는 시간

                for (int arrivalTime : arrivalTimes) {
                    // 다음 붕어빵이 만들어질 때까지 기다림
                    while (timeForNextBungeoppang <= arrivalTime) {
                        bungeoppangMade += K;
                        timeForNextBungeoppang += M;
                    }

                    // 손님이 도착했을 때 붕어빵이 준비되어 있지 않으면
                    if (--bungeoppangMade < 0) {
                        possible = false;
                        break;
                    }
                }

                System.out.println("#" + testCase + " " + (possible ? "Possible" : "Impossible"));
            }


        sc.close();
    }
    }

