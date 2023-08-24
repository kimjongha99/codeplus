package Programmers;

public class P120830 {

    public int solution(int n, int k) {
        int sheep=12000;
        int coke =2000;
        int result =0;

        if(n>=10){

            result = sheep*n + coke*k -(n/10 * coke);
        }else
            result = sheep*n + coke*k;



        return result;
    }
    public static void main(String[] args) {
        int  n =64	;
        int  k =6	;

        P120830  sol = new P120830();
        System.out.println(sol.solution(n,k));
    }
}
