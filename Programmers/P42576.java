package Programmers;


import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.HashMap;

/*
https://school.programmers.co.kr/learn/courses/30/lessons/42576

완주하지 못한선수

 */
public class P42576 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
            //1. 해시맵을 만든다. participant
        HashMap<String,Integer> map = new HashMap<>();
        for (String player : participant) {
            map.put(player,map.getOrDefault(player,0)+1);
        }
            //2. 해시맵을 뺸다.  completion
        for (String player : completion) {
            map.put(player,map.get(player)-1);
        }

            //3.남은 밸류가 0이아닌 선수를찾는다.
        for (String key : map.keySet()) {
            if (map.get(key) != 0) {
                answer =key;
            }
        }

//            소팅/ 루프 하는 방법.
//            1. 두배열을 정렬한다
//            Arrays.sort(participant);
//            Arrays.sort(completion);
//            //2. 두배열을 비교하며 다른값을 찾는다.
//            int i = 0;
//            for (; i < completion.length; i++) {
//                if(participant[i] != completion[i]){
//                     break;
//                }
//            }
//
//            //3.여기까지찾으면 비교못한값은 완주하지 못한 선수이다.
//
//            return  participant[i];
        return answer;
    }




    public static void main(String[] args) {


        String[] part = new String[]{"leo", "kiki", "eden",};
        String[] comp = new String[]{"eden", "kiki"};
        P42576 sol = new P42576();

        System.out.println(sol.solution(part,comp));
    }
}
