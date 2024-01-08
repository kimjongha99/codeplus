package SwExpertAcademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S1204_RE {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        for (int t = 1; t <= tc; t++) {
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int arr[] = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            int N = Integer.parseInt(st.nextToken());
            arr[N]++;
        }

        int max = Integer.MIN_VALUE;
        int maxIndex = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
        }
        System.out.println("#"+t+" "+maxIndex);
    }
    }
}
