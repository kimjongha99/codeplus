package Hash;

import Programmers.P120838;
import study.Hash;

import java.util.HashMap;

/*
https://school.programmers.co.kr/learn/courses/30/lessons/120839

가위 바위 보
 */
public class P120839 {
    public String solution(String rsp) {
        HashMap<String,String> rsp1 =new HashMap<>();
        rsp1.put("2","0");rsp1.put("0","5");rsp1.put("5","2");

        String[] words = rsp.trim().split("");
        StringBuilder text = new StringBuilder();

        for (String word : words) {
            if (rsp1.containsKey(word)) {
                text.append(rsp1.get(word));
            }
        }
        return text.toString();
    }
    public static void main(String[] args) {
        String rsp ="205";



        P120839 sol = new P120839();
        System.out.println(sol.solution(rsp));
    }

}
