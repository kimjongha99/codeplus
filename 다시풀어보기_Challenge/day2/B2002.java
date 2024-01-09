package 다시풀어보기_Challenge.day2;

//https://www.acmicpc.net/problem/2002


//추월

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class B2002 {
    public static void main(String[] args) throws IOException {
        HashMap<String, Integer> hashMap1 = new HashMap<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n =Integer.parseInt(br.readLine());
        int[] check = new int[n];

        for (int i = 0; i < n; i++) {
            hashMap1.put(br.readLine(),i);
        }
        for (int i = 0; i < n; i++) {
            check[i]= hashMap1.get(br.readLine());
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (check[i] > check[j]) {
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);


    }
}
