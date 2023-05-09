package modulo;


//2와 5로 나누어 떨어지지 않는 정수 n(1 ≤ n ≤ 10000)가 주어졌을 때, 각 자릿수가 모두 1로만 이루어진 n의 배수를 찾는 프로그램을 작성하시오.

//N 의 배수는 N을 나눈 나머지가 0이다.
import java.util.Scanner;

public class B4375 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()){  // 띄어쓰기할때까지 반복.
            int n = sc.nextInt();  // N 입력
            int num = 0;
            for(int i=1;i<=n;i++){   // 1부터 n까지 증가
                num = num*10+1;
                num %= n;
                if(num==0){
                    System.out.println(i);
                    break;
                }
            }
        }

    }
}
