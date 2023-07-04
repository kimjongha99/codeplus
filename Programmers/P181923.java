package Programmers;


/*
https://school.programmers.co.kr/learn/courses/30/lessons/181923

수열과 구간 쿼리 2

 */
public class P181923 {

    static int[] solution(int[] arr, int[][] queries) {
        int idx = 0;
        int[] answer = new int[queries.length];

        for (int[] query : queries) {
            int s = query[0], e = query[1], k = query[2];
            int min = Integer.MAX_VALUE;

            for (int i = s;i <= e;i++)
                if (arr[i] > k)
                    min = Math.min(arr[i], min);

            answer[idx++] = min == Integer.MAX_VALUE ? -1 : min;
        }

        return answer;
    }
    public static void main(String[] args) {

    }
}
