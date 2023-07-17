package study;

import java.util.HashMap;

public class Hash {
    public static void main(String[] args) {

        HashMap<Integer,String> map = new HashMap<>();
        map.put(1, "사과");
        map.put(2, "4");
        map.put(3, "5");

        System.out.println(map.get(2));
    }
}
