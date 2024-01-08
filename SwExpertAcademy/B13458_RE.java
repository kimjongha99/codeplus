package SwExpertAcademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B13458_RE {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int arr[] = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        long answer = 0;
        answer += N;


        for (int i = 0; i < arr.length; i++) {
            arr[i]-=B;
            if(arr[i]<=0)continue;
            answer += arr[i]/C;
            if (arr[i] % C != 0) {
                answer++;

            }
        }
        System.out.println(answer);



    }
}
