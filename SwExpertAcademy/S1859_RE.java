package SwExpertAcademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class S1859_RE {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= t; tc++) {
            int N = Integer.parseInt(br.readLine());
            int arr[] = new int[N];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            int max = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }

            long money = 0;
            for (int i = 0; i < N; i++) {
                if (arr[i] < max) {
                    money += max - arr[i];
                } else if (arr[i] == max) {
                    max = 0;
                    if (i != N - 1) {
                        for (int j = i + 1; j < N; j++) {
                            if (max < arr[j]) {
                                max = arr[j];
                            }
                        }
                    }
                }
            }
            System.out.println("#" + tc + " " + money);

        }
    }
}


