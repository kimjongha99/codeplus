package Programmers;

import java.util.Arrays;

public class P120835 {

    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];

        for(int i = 0; i < emergency.length; i ++) {
            for(int j = 0; j < emergency.length; j++) {
                if(emergency[i] < emergency[j]) {
                    answer[i]++;
                }
            }
            /*순서 배열의 모든 값에 +1해줌
            (순서를 나타내야 하기 때문에 0이 아닌 1부터 하기 위함)*/
            answer[i]++;
        }
        return answer; //순서를 나타낸 배열 return

    }
    public static void main(String[] args) {
            int emergency[] = new int[]{3, 76, 24};

            P120835 sol = new P120835();
          int[] result =sol.solution(emergency);

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
