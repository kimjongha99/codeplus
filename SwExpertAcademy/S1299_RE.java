package SwExpertAcademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S1299_RE {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= t; tc++) {
            String strNum = br.readLine();
            int arr[] = new int[strNum.length()];

            for (int i = 0; i < strNum.length(); i++) {
                arr[i]=strNum.charAt(i)-'0';
            }

            int count =0;
            int currentNum =0;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != currentNum) {
                   count++;
                   currentNum=arr[i];
                }

            }

            System.out.println(count);



        }
    }
}
