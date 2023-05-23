package Programmers;


/*
수 조작하기 2
https://school.programmers.co.kr/learn/courses/30/lessons/181925
 */
public class P181925 {

    static String solution(int[] numLog) {
        int num = numLog[0];
        StringBuffer sb= new StringBuffer();

        for (int i = 1; i < numLog.length; i++) {
            if (numLog[i] - num == 1) sb.append("w");
            else if (numLog[i] - num == -1) sb.append("s");
            else if (numLog[i] - num == 10) sb.append("d");
            else sb.append("a");
            num = numLog[i];
        }        return sb.toString();

    }

    public static void main(String[] args) {
        int arr[] ={0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1};
        System.out.println(solution(arr));
    }

    }




