package 구현;


import java.util.Locale;
import java.util.Scanner;

/*
https://www.acmicpc.net/problem/1157
단어공부
 */
public class B1157 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);

        String a = "baaa";

        a = a.toUpperCase(Locale.ROOT);


        int[] charCount = new int[120];

        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            charCount[ch]++;
        }

        int max = -1;
        char ch = '?';

        for (int i = 0; i < charCount.length; i++) {
            if (charCount[i] > max) {
                max = charCount[i];
                ch = (char) i;
            } else if (charCount[i] == max) {
                ch = '?';
            }
        }

        System.out.print(ch);
    }
}