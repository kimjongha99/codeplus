package Programmers;

public class P120833 {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2 - num1 + 1];

        for (int i = num1; i <= num2; i++) {
            answer[i - num1] = numbers[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        int numbers[] = new int[]{1, 2, 3, 4, 5};

        int num1 =1;
        int num2 = 3;

        P120833 sol = new P120833();
        int[] result = sol.solution(numbers, num1, num2);

        for (int i = 0; i < result.length; i++) {
            System.out.printf("%d",result[i]);
        }    }
}
