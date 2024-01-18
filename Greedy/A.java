package Greedy;


//  매개변수 box에 각 박스 종류의 정보가 주어지고, limit에 트럭의 실을 수 있는 박스의 최대
//  개수가 주어지면 트럭에 실을 수 있는 사과의 최대 개수를 반환하는 프로그램을 작성하세요.

import java.util.Arrays;

public class A {
    public static int solution(int[][] box, int limit) {
        int answer = 0;
        Arrays.sort(box, (a, b) -> Integer.compare(b[1], a[1])); // Sort in descending order based on the second element
        for (int[] x : box) {
            int cnt = Math.min(limit, x[0]);
            answer += cnt * x[1];
            limit -= cnt;
            if (limit == 0) {
                break;
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        System.out.println(solution(new int[][]{{2, 20}, {2, 10}, {3, 15}, {2, 30}}, 5));
        System.out.println(solution(new int[][]{{1, 50}, {2, 20}, {3, 30}, {2, 31}, {5, 25}}, 10));
        System.out.println(solution(new int[][]{{3, 40}, {5, 20}, {5, 70}, {1, 80}, {5, 30}, {3, 35}}, 15));
        System.out.println(solution(new int[][]{{2, 70}, {5, 100}, {3, 90}, {1, 95}}, 8));
        System.out.println(solution(new int[][]{{80, 20}, {50, 10}, {70, 15}, {70, 30}, {80, 70}, {90, 88}, {70, 75}}, 500));
    }
}
