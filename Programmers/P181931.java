package Programmers;
/*
https://school.programmers.co.kr/learn/courses/30/lessons/181931

등차수열의 특정한 항만 더하기

 */
public class P181931 {

    public static int solution(int a, int b, boolean[] included) {
        int arr[] = new int[included.length];
        arr[0] = a;

        for (int i = 1; i < included.length; i++) {
            arr[i] = arr[i - 1] + b;
        }
        int answer = 0;

        for (int i = 0;i < included.length;i++)
            if (included[i]){
                answer += arr[i];
            }

            return answer;
    }


    public static void main(String[] args) {
     int a =3;
     int b =4;
     boolean included[] = {true, false, false, true, true};
        System.out.println(solution(a,b,included));
    }
}
