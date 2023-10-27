package SwExpertAcademy;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
https://swexpertacademy.com/main/code/problem/problemDetail.do?problemLevel=2&contestProbId=AV5P1kNKAl8DFAUq&categoryId=AV5P1kNKAl8DFAUq&categoryType=CODE&problemTitle=&orderBy=FIRST_REG_DATETIME&selectCodeLang=JAVA&select-1=2&pageSize=10&pageIndex=1
패턴마다의 길이


 */
public class S2007 {
        static int patternLength;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine());


        for (int t = 1; t <= tc; t++) {
            String str = br.readLine();

                for (int i = 1; i < str.length() / 2; i++) {
                    String sub1 = str.substring(0,i);
                    String sub2 = str.substring(i,i+i);

                    if (sub1.equals(sub2)) {
                        patternLength = i;
                       break;
                    }
                }

            System.out.println("#"+t+" "+patternLength);
        }
    }
}