package study1;


import java.io.*;

/*
애너그램 만들기
https://www.acmicpc.net/problem/1919

 */
public class B1919 {

    static  int[] countApb;
    private static int getAnagramCount(String word1, String word2) {
    int toberemoveCount =0;

        for (int i = 0; i < word1.length(); i++) {
            countApb[word1.charAt(i)-97]++;
        }
        for (int i = 0; i < word2.length(); i++) {
            countApb[word2.charAt(i)-97]--;
        }
        for (int i = 0; i < countApb.length; i++) {
            int count = Math.abs(countApb[i]);
            toberemoveCount += count;
        }

        return toberemoveCount;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String word1 = br.readLine().trim();
        String word2 = br.readLine().trim();

        countApb = new int[26];

        int result = getAnagramCount(word1,word2);

        bw.write(String.valueOf(result));
        bw.flush();
        br.close();
        bw.close();
    }


}
