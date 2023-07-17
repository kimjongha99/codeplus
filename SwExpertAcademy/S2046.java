package SwExpertAcademy;

import java.util.Scanner;

/*
주어진 숫자만큼 # 을 출력해보세요.

주어질 숫자는 100,000 이하다.


 */
public class S2046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            System.out.print("#");
        }
    }
}
