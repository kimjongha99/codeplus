package Programmers;


import java.util.Arrays;
import java.util.HashMap;

/*
전화번호 목록
https://school.programmers.co.kr/learn/courses/30/lessons/42577
 */
public class P42577 {
    public boolean Solution(String[] phoneNum) {
        //1.해쉬맵을 만든다.
        HashMap<String,Integer> map = new HashMap<>();

        for (int i = 0; i < phoneNum.length; i++) {
            map.put(phoneNum[i],i);
        }

        //2.a모든전화번호의 접ㅈ두어가 해쉬맵에 있는지확인

        for (int i = 0; i < phoneNum.length; i++) {
            for (int j = 1; j < phoneNum[i].length(); j++) {
                if (map.containsKey(phoneNum[i].substring(0, j))) {
                    return false;
                }
            }
        }
        return true;




//        //1. 폰북 정렬
//        Arrays.sort(phoneNum);
//
//        //2. 루프 돌면서 앞번호가 뒷번호의 접두어인지 확인한다..
//
//        for (int i = 0; i < phoneNum.length - 1; i++) {
//            if (phoneNum[i + 1].startsWith(phoneNum[i])) {
//                return false;
//            }
//        }
//        //3. 여기까지 오지못하면 없다는거다.
//
//        return true;
    }
    public static void main(String[] args) {

        String phone_book[] = new String[]{"119","97674223","1195524421"};

        P42577 sol = new P42577();
        boolean result=   sol.Solution(phone_book);
        System.out.println(result);
    }


}
