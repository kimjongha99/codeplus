package SwExpertAcademy;

import java.util.Scanner;

/*
https://swexpertacademy.com/main/solvingProblem/solvingProblem.do
달팽이
 */
public class S1926 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (isClap(i)) {
                System.out.printf("-");
                
            }
            else{
                System.out.printf(String.valueOf(i));
            }
        }
    }

    private static boolean isClap(int i) {
        while (i > 0) {
            int ans = i%10;
            if (ans == 3 || ans == 6 || ans == 9) {
                return  true;
            }
            i /=10;
        }
        return false;
    }
}