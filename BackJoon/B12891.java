package BackJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
https://www.acmicpc.net/problem/12891

dna 비밀번호

아직어려움
나중에다시

 */
public class B12891 {

   static   int MyArr[] = new int[4];
   static   int CheckArr[] = new int[4];
    static int checkSecret =0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int S = Integer.parseInt(br.readLine());

        int P = Integer.parseInt(br.readLine());

        int result =0;


        char NowArr[] = new char[S];


        NowArr = br.readLine().toCharArray();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) {
            CheckArr[i] = Integer.parseInt(st.nextToken());

            if (CheckArr[i] == 0) {
                checkSecret++;
            }
        }

        for (int i = 0; i < P; i++) {
            Add(NowArr[i]);
        }
        if(checkSecret ==4)
            result++;

        for (int i = P; i < S; i++) {
            int j=i-P;
        }



    }

    private static void Add(char i) {
        switch (i){
            case 'A':
                MyArr[0]++;
                if (MyArr[0] == CheckArr[0]) {
                    checkSecret++;
                }
                break;
            case 'C':
                MyArr[1]++;
                if (MyArr[1] == CheckArr[1]) {
                    checkSecret++;
                }
                break;
            case 'G':
                MyArr[2]++;
                if (MyArr[2] == CheckArr[2]) {
                    checkSecret++;
                }
                break;
            case 'T':
                MyArr[3]++;
                if (MyArr[3] == CheckArr[3]) {
                    checkSecret++;
                }
                break;
        }

    }
}
