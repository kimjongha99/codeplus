package Programmers;


/*
겹치는 선분의 길이

https://school.programmers.co.kr/learn/courses/30/lessons/120876
 */
public class P120876 {
    static int solution(int line[][]) {
        int[] arr = new int[200];
        int answer = 0;
        for (int i = 0; i < line.length; i++) {
            for (int j = line[i][0] ; j < line[i][1] ; j++)
                arr[j]++;
        }

        for (int i = 0; i < 200; i++) {
            if (arr[i] > 1) {
                answer++;

            }
        }
        return answer;

    }



    public static void main(String[] args)  {

        int arr[][]= new int[][]{{0,1},{2,5},{3,9}};
        System.out.println(solution(arr));
    }
}
