package SwExpertAcademy;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*

https://swexpertacademy.com/main/code/problem/problemDetail.do?problemLevel=3&contestProbId=AYLnMQT6vPADFATf&categoryId=AYLnMQT6vPADFATf&categoryType=CODE&problemTitle=&orderBy=FIRST_REG_DATETIME&selectCodeLang=JAVA&select-1=3&pageSize=10&pageIndex=2

알파벳 공부
 */
public class S15230 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());


        for (int t = 1; t <= tc; t++) {

            String str = br.readLine();

            System.out.println("#"+t+" "+countStr(str));

        }

    }

     static int countStr(String str) {
         String alphabet = "abcdefghijklmnopqrstuvwxyz";
         int count= 0;

         for (int i = 0; i < str.length(); i++) {
             if (str.charAt(i) == alphabet.charAt(i)) {
                 count++;
             }else {
                 break;
             }
         }
         return  count;
     }

}
