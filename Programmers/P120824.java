package Programmers;


/*
https://school.programmers.co.kr/learn/courses/30/lessons/120824

짝수 홀수 개수
 */
public class P120824 {
    public int[] Solution(int[] numList) {
        int[] answer = new int[2];

        int odd=0;
        int even = 0;
        for (int i = 0; i < numList.length; i++) {
            if(numList[i]%2==0){
                even++;
            } else odd++;
        }
        answer[0]=(even);
        answer[1]=(odd);

        return answer;
    }
    public static void main(String[] args) {
            int [] num_list= new int[]{1, 2, 3, 4, 5};


            P120824 sol = new P120824();

        System.out.println(sol.Solution(num_list));

    }


}
