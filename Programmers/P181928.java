package Programmers;
/*
이어 붙인 수
https://school.programmers.co.kr/learn/courses/30/lessons/181928
 */
public class P181928 {
    static int solution(int[] num_list) {
        String even = "";
        String odd ="";
        int answer =0;

        for (int i = 0; i < num_list.length; i++) {
            if(num_list[i]%2==0){
                even += num_list[i];
            }else {
                odd += num_list[i];
            }
        }

        answer = Integer.parseInt(even) + Integer.parseInt(odd);


                return answer;

}
    public static void main(String[] args) {

        int[] arr = new int[]{3, 4, 5, 2, 1};

        System.out.println(solution(arr));

    }
}
