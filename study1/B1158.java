package study1;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

/*
요세푸스 문제
https://www.acmicpc.net/problem/1158
 */
public class B1158 {

    static  void josepus(ArrayList arrayList, int k){
        int index=0;
        while (!arrayList.isEmpty()) {
            index= (index+k-1)%arrayList.size();
            if (arrayList.size() == 1) {
                System.out.print(arrayList.get(index));
            } else {
                System.out.print(arrayList.get(index) + ", ");
            }
            arrayList.remove(index);
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 1; i <= N ; i++) {
            arrayList.add(i);
        }
        System.out.print("<");
        josepus(arrayList, K);
        System.out.println(">");

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i));

        }
    }
}
