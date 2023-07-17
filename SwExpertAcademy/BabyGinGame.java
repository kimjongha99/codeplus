package SwExpertAcademy;


/*
Baby-gin Game
0에서 9 사이의 숫자 카드에서 임의로 카드 6장을 뽑을 때, 3장의 카드가 연속적인 번호를 가지는 경우를 run 이라 하고, 3장의 카드가 동일한 번호를 갖는 경우를 triplete 라고 합니다. 6장의 카드가 run, triplete 로 구성되어 있을 경우를 Baby-gin 이라 합니다.

[예] 667767은 두 개의 triplete이다. => 666,777, Baby-gin

[예] 054060은 1 개의 run과 한 개의 triplete이다. => 000,456, Baby-gin

[예] 101123은 1 개의 triplete가 존재하나(111), 023이 run이 아니므로 Baby-gin 이 아니다.
 */

public class BabyGinGame {
    private static  int num =0;
    private  static  int ginCount =0; //count =2 = babygin
    private  static  int numOfBabyGin =0;

    private static void swap(int[] arr, int dep, int i) {
        int temp = arr[dep];
        arr[dep] = arr[i];
        arr[i]= temp;
    }
    private static void print(int[] arr, int r) {
        for (int i = 0; i < r; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    private static void isBabyGin(int[] arr, int n) {
        // 1. 맨 앞의 3자리가 동일한 숫자일 경우 - triplete 1개
        if (arr[0] == arr[1] && arr[1] == arr[2]) {
            ginCount++;
        }
        // 2. 그 다음 3자리가 동일한 숫자일 경우 - triplete 1개
        if (arr[3] == arr[4] && arr[4] == arr[5]) {
            ginCount++;
        }
        // 3. 맨 앞의 3자리가 연속된 숫자일 경우 - run 1개
        if (arr[0] + 1 == arr[1] && arr[1] + 1 == arr[2]) {
            ginCount++;
        }
        // 4. 그 다음 3자리가 연속된 숫자일 경우 - run 1개
        if (arr[3] + 1 == arr[4] && arr[4] + 1 == arr[5]) {
            ginCount++;
        }

        if (ginCount == 2) {
            numOfBabyGin++;
        }

        ginCount = 0;
    }
    private static void permutation(int[] arr, int dep, int n, int r) {
        if (dep == r) {
            //print(arr, r);
            isBabyGin(arr, n);
            return;
        }
    }

    public static void main(String[] args) {
            int[] arr = { 6,6,7,7,6,7};

            // 순열 알고리즘으로 모든 경우의 수를 나타내고 baby-gin 판단하기
            permutation(arr, 0, num, num);

            System.out.print("뽑힌 6장의 카드: ");
            for (int i = 0; i < num; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();

            if (numOfBabyGin > 0) {
                System.out.println("해당 6개의 숫자는 Baby-gin입니다.");
            } else {
                System.out.println("해당 6개의 숫자는 Baby-gin이 아닙니다.");
            }

    }
}
