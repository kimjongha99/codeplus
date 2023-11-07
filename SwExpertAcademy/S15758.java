package SwExpertAcademy;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
https://swexpertacademy.com/main/code/problem/problemDetail.do?problemLevel=3&contestProbId=AYP5JmsqcngDFATW&categoryId=AYP5JmsqcngDFATW&categoryType=CODE&problemTitle=&orderBy=FIRST_REG_DATETIME&selectCodeLang=JAVA&select-1=3&pageSize=10&pageIndex=1
15758. 무한 문자열
 */
public class S15758 {
//ababab abab
    static  boolean pattensame(String s , String t){
        int i=0; int j=0;
        while (true) {
            if (i == s.length() && j == t.length()) {
                return true;
            }
            if(i==s.length()){  // 글자의 끝에 갔으면 처음으로가라
                i=0;
            }
            if (j == t.length()) {// 글자의 끝에 갔으면 처음으로가라
                j=0;
            }
            if (s.charAt(i) != t.charAt(j)) {  //글자가다르면 false
                return false;
            }
            i++;
            j++;
        }


    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int tc= Integer.parseInt(br.readLine());

        for (int t = 1; t <= tc; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String S =st.nextToken();
            String T = st.nextToken();


            if(pattensame(S,T)){
                System.out.println("#"+t+" "+"yes");
            } else
                System.out.println("#"+t+" "+"no");

        }
    }

}
