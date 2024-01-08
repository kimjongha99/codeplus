package SwExpertAcademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S1288_RE {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());

        for (int t = 1; t <= tc; t++) {
            int N = Integer.parseInt(br.readLine());

            boolean arr[] = new boolean[10];
            int count =0;

            while (true) {
                count++;
                String strN = String.valueOf(N*count);
                for (int i = 0; i < strN.length(); i++) {
                    arr[strN.charAt(i)-'0']=true;
                }

                boolean allCheck=true;

                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] == false) {
                        allCheck =false;
                        break;
                    }
                }

                if (allCheck == true) {
                    break;
                }

            }
            System.out.println(N*count);

        }

    }
}
