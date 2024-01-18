package SlidingWindow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


//https://www.acmicpc.net/problem/12891
// DNA비밀번호
public class B12891 {
    static int[] myNum;
    static int[] checkNum;
    static int Result;

    static void plusMyNum(int len, char[] myArr, int P) {
        for (int i = 0; i < len; i++) {
            addChar(myArr[i]);

            if (i >= P - 1) {
                if (searchNum()) {
                    Result++;
                }
                removeChar(myArr[i - P + 1]);
            }
        }
    }

    static void addChar(char c) {
        switch (c) {
            case 'A':
                myNum[0]++;
                break;
            case 'C':
                myNum[1]++;
                break;
            case 'G':
                myNum[2]++;
                break;
            case 'T':
                myNum[3]++;
                break;
        }
    }

    static void removeChar(char c) {
        switch (c) {
            case 'A':
                myNum[0]--;
                break;
            case 'C':
                myNum[1]--;
                break;
            case 'G':
                myNum[2]--;
                break;
            case 'T':
                myNum[3]--;
                break;
        }
    }

    static boolean searchNum() {
        for (int i = 0; i < 4; i++) {
            if (myNum[i] < checkNum[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int S = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        Result = 0;

        char[] myArr;
        checkNum = new int[4];
        myNum = new int[4];
        myArr = bf.readLine().toCharArray();

        st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < 4; i++) {
            checkNum[i] = Integer.parseInt(st.nextToken());
        }

        plusMyNum(S, myArr, P);

        System.out.println(Result);
    }
}