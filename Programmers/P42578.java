package Programmers;

import  java.util.HashMap;
public class P42578 {
    private int solution(String[][] clothes) {
        HashMap<String, Integer> map = new HashMap<>();
        //1. 옷을 종류별로구분한다.
        for (String[] clothe : clothes) {
            String type = clothe[1];
            map.put(type, map.getOrDefault(type, 0) + 1);
        }
        //2. 입지않은옷 조합 모든종류계산

        //3. 아무것도입지않은경우(-1)을한다.
        return 0;
    }
    public static void main(String[] args) {
        String clothes[][]= new String[][]{{"yellow_hat", "headgear"},
                                           {"blue_sunglasses", "eyewear"},
                                           {"green_turban", "headgear"}};

        P42578 sol = new P42578();

        System.out.println(sol.solution(clothes));
    }
}
