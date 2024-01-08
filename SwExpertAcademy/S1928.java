package SwExpertAcademy;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Base64;

/*
https://swexpertacademy.com/main/code/problem/problemDetail.do?problemLevel=2&contestProbId=AV5PR4DKAG0DFAUq&categoryId=AV5PR4DKAG0DFAUq&categoryType=CODE&problemTitle=&orderBy=RECOMMEND_COUNT&selectCodeLang=JAVA&select-1=2&pageSize=10&pageIndex=1

1928. Base64 Decoder
 */
public class S1928 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test_case = Integer.parseInt(br.readLine());
        for (int i = 1; i <= test_case; i++) {

            String str = br.readLine();
            String decode = new String(Base64.getDecoder().decode(str));


            System.out.println("#" + i + " " + decode);
        }

    }
}
