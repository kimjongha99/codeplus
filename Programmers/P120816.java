package Programmers;


import static java.lang.Math.abs;

/*
https://school.programmers.co.kr/learn/courses/30/lessons/120816

   피자 나눠 먹기 (3)
*/
public class P120816 {

        public int solution(int slice, int n) {
            int answer = 0;
           if(n%slice ==0 )
               answer= n/slice;
           else
               answer=n/slice+1;

            return answer;

        }

    public static void main(String[] args) {
        int slice = 7;
        int n =20;
        P120816 sol = new P120816();

        System.out.println(sol.solution(slice,n));

    }
}
