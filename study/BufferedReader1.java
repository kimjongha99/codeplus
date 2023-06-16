package study;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class BufferedReader1 {

    public static void main(String[] args) throws IOException {
       //BufferedReader 설명에서처럼 inputstreamreader에 buffer를 추가하는 것이기 떄문에
        //inputstreamreader를 받아와야한다.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int N2 = Integer.parseInt(st.nextToken());
        String x = st.nextToken();
        System.out.println(N+10);
        System.out.println(N2+10);
        System.out.println(x+10);
    }
}
