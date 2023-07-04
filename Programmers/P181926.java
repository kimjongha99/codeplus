package Programmers;
/*
 https://school.programmers.co.kr/learn/courses/30/lessons/181926

 수 조작하기 1

  */
public class P181926 {
    static int solution(int n, String control) {

        for (int i = 0; i < control.length(); i++) {
            char ch = control.charAt(i);

            if(ch =='w') n+=1;
            else if(ch=='s') n -=1;
            else if(ch=='d') n +=10;
            else  n -=10;


         }

        return n;
    }


    public static void main(String[] args) {

        String x ="wsdawsdassw";
        System.out.println(solution(10,x));
    }
}
