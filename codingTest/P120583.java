package codingTest;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
중복된 숫자개수
https://school.programmers.co.kr/learn/courses/30/lessons/120583
 */



import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;
        import java.util.ArrayList;
        import java.util.HashSet;
        import java.util.List;
        import java.util.Set;

public class P120583 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine().trim();

        // To process the input value, remove all "[", "]", "," from the input value and convert it to an integer list.
        List<Integer> inputList = new ArrayList<>();
        for (String str : input.split(" ")) {
            inputList.add(Integer.parseInt(str));
        }

        // Solution function
        solution(inputList);
    }

    public static void solution(List<Integer> inputList) {
        Set<Integer> set = new HashSet<>();
        List<Integer> setList = new ArrayList<>();
        List<Integer> result = new ArrayList<>();

        // Put the elements into a Set to remove duplicates.
        for (int i = 0; i < inputList.size(); i++) {
            set.add(inputList.get(i));
        }

        // Make the Set a deduplicated list to utilize the list method filter.
        for (int el : set) {
            setList.add(el);
        }

        // Compare each element of setList with the elements of the input list, and put the number of elements in the result list.
        for (int i = 0; i < setList.size(); i++) {
            int count = 0;
            for (int el : inputList) {
                if (el == setList.get(i)) {
                    count++;
                }
            }
            result.add(count);
        }

        // Among these, filter out single values without duplicate values.
        result.removeIf(el -> el <= 1);

        // If all elements are removed and result[] becomes an empty list, output [-1].
        if (result.isEmpty()) {
            System.out.println("[-1]");
        }
        // If there is at least one element in result[], output [element1, element2, ...].
        else {
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            for (int i = 0; i < result.size(); i++) {
                sb.append(result.get(i));
                if (i != result.size() - 1) {
                    sb.append(", ");
                }
            }
            sb.append("]");
            System.out.println(sb.toString());
        }
    }
}
