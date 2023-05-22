package Programmers;

/*
https://school.programmers.co.kr/learn/courses/30/lessons/181930
주사위 게임 2

 */

public class P181930 {
    static  int solution(int a, int b, int c){
         int result =0;

         if(a == b && b==c){
             result= (int) ((a + b + c) * (a * a + b * b + c * c) * (Math.pow(a,3)+Math.pow(b,3)+Math.pow(b,3)));

         } else if ((a == b && b != c) || (a == c && a != b) || (b == c && a != b)) {
             result= (a + b + c) * (a * a + b * b + c * c) ;
             }
         else{
             result = a+b+c;

         }

        return result;
    }
    public static void main(String[] args) {
        int a =5;
        int b =3;
        int c= 3;
        System.out.println(solution(a,b,c));
    }
}
