package SwExpertAcademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S1206_RE {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int arr[] = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int totalView = 0;

        for (int i = 2; i < arr.length - 2; i++) {
            int currentHeight = arr[i];
            int surroundMaxHeight = Math.max(Math.max(arr[i-1], arr[i-2]),Math.max(arr[i+1],arr[i+2]));

            int view = currentHeight -surroundMaxHeight;

            if (view > 0) {
                totalView+=view;
            }

        }
        System.out.println(totalView);

    }
}
