package Programmers;


import java.util.HashMap;

/*
https://school.programmers.co.kr/learn/courses/30/lessons/120838

모스부호(1)

 */
public class P120838 {
    public String solution(String morseCode) {
        HashMap<String, String> morseDict = new HashMap<>();
        morseDict.put(".-", "a"); morseDict.put("-...", "b"); morseDict.put("-.-.", "c"); morseDict.put("-..", "d");
        morseDict.put(".", "e"); morseDict.put("..-.", "f"); morseDict.put("--.", "g"); morseDict.put("....", "h");
        morseDict.put("..", "i"); morseDict.put(".---", "j"); morseDict.put("-.-", "k"); morseDict.put(".-..", "l");
        morseDict.put("--", "m"); morseDict.put("-.", "n"); morseDict.put("---", "o"); morseDict.put(".--.", "p");
        morseDict.put("--.-", "q"); morseDict.put(".-.", "r"); morseDict.put("...", "s"); morseDict.put("-", "t");
        morseDict.put("..-", "u"); morseDict.put("...-", "v"); morseDict.put(".--", "w"); morseDict.put("-..-", "x");
        morseDict.put("-.--", "y"); morseDict.put("--..", "z");


        String[] words = morseCode.trim().split(" ");
        StringBuilder text = new StringBuilder();
        for (String word : words) {
            if (morseDict.containsKey(word)) {
                text.append(morseDict.get(word));
            }
        }

        return text.toString();


    }
    public static void main(String[] args) {
        String letter =".... . .-.. .-.. ---";



        P120838  sol = new P120838();
        System.out.println(sol.solution(letter));
    }
}
