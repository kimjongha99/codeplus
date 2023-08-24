package Programmers;

public class P120829 {
    public int solution(int angle) {

        if(angle>0 && angle<90) {
            return 1;
        } else if (angle == 90) {
            return 2;
        } else if (angle > 90 && angle < 180) {
            return 3;
        }else
            return 4;

    }
    public static void main(String[] args) {
        int  angle =70;

        P120829  sol = new P120829();
        System.out.println(sol.solution(angle));
    }
}
