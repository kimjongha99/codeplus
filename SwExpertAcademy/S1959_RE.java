package SwExpertAcademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S1959_RE {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int arrA[] = new int[N];
        int arrB[] = new int[M];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < arrA.length; i++) {
            arrA[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < arrB.length; i++) {
            arrB[i] = Integer.parseInt(st.nextToken());
        }

        int Longer[] = arrA.length > arrB.length ? arrA:arrB;
        int shorter[] = arrA.length > arrB.length ? arrB:arrA;
        int max = Integer.MIN_VALUE;

        for (int start = 0; start <= Longer.length - shorter.length; start++) {
            int current=0;
            for (int i = 0; i < shorter.length; i++) {
                current += shorter[i]*Longer[start+i];
            }
            max = Math.max(current,max);
        }

        System.out.println(max );
    }

}
