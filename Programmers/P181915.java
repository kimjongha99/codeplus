package Programmers;


/*

글자 이어 붙여 문자열 만들기

https://school.programmers.co.kr/learn/courses/30/lessons/181915
 */
public class P181915 {
    public String solution(String my_String, int[] index_list) {
        String answer = "";
        for (int index : index_list)
            answer += my_String.charAt(index);
        return answer;
    }
    public static void main(String[] args) {
        String my_String = "cvsgiorszzzmrpaqpe";
        int index_list[] = new int[]{16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7};

        P181915 sol = new P181915();
        System.out.println(sol.solution(my_String,index_list));
    }

}