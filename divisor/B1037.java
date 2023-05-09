package divisor;

import java.util.Scanner;

//약수
//양수 A가 N의 진짜 약수가 되려면, N이 A의 배수이고, A가 1과 N이 아니어야 한다. 어떤 수 N의 진짜 약수가 모두 주어질 때, N을 구하는 프로그램을 작성하시오.
//약수는 문제는 최소와 최대를 곱해라
//입력으로 주어진수 두개중 최솟값과 최대값을 곱하면 나오는문제.
public class B1037 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int[] arr = new int [num];

        for(int i=0; i<num;i++){
            arr[i]=sc.nextInt();
        }

        int small, big;
        small = big = arr[0];
        for(int i=1;i<num;i++){
            if(small>arr[i]){
                small =arr[i];
            }

            if(big<arr[i]){
                big =arr[i];
            }
        }
        System.out.println(small*big);
    }
}
