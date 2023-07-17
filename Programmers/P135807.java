package Programmers;
/*
https://school.programmers.co.kr/learn/courses/30/lessons/135807

숫자 카드 나누기
 */
public class P135807 {
    static int solution(int arrA[], int arrB[]) {

        int ans =0;
        int gcdA = arrA[0];
        int gcdB = arrB[0];

        for (int i = 1; i < arrA.length; i++) {
            gcdA = GCD(gcdA,arrA[i]);
            gcdB = GCD(gcdB,arrB[i]);

        }
        if (notDivisible(arrB, gcdA)) {
            if (ans < gcdA) {
                ans = gcdA;
            }
        if(notDivisible(arrA, gcdB))
            if (ans < gcdB) {
                ans = gcdB;
            }
        }
        return ans;
    }


     static boolean notDivisible(int[] arr, int num){
        for(int i : arr)
            if(i % num == 0)
                return false;
        return true;
    }

    static int GCD(int a, int b) {
        if (a% b == 0) {
            return b;
        }
        else{
            return GCD(b,a%b);
        }
    }



    public static void main(String[] args) {
        int arrA[] = new int[]{10, 17};
        int arrB[] = new int[]{5, 20};

        System.out.println(solution(arrA,arrB));

    }
}
