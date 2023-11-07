package study1;


import java.io.*;
import java.util.StringTokenizer;

/*
https://www.acmicpc.net/problem/11328
Strfry

영어 소문자 = a - 97
 */
public class B11328 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        for (int t = 0; t < T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String word1 = st.nextToken();
            String word2 = st.nextToken();

            int arr[] = new int[26];

            for (int i = 0; i < word1.length(); i++) {
                int c = word1.charAt(i);
                arr[c-97]++;   //아스키를 인트로했을시
            }

            for (int i = 0; i < word2.length(); i++) {
                char c= word2.charAt(i);
                arr[c-'a']--;  //아스키를char로했을시
            }


            boolean isPossible=true;

            for(int i=0; i<arr.length;i++) {
                if(arr[i]!=0) {
                    isPossible=false;
                    break;
                }
            }

            if(isPossible)
                System.out.println("Possible");
            else
                System.out.println("Impossible");


            }



    }

}











//    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//    int tc = Integer.parseInt(br.readLine());
//
//        for (int t = 0; t < tc; t++) {
//        StringTokenizer st = new StringTokenizer(br.readLine());
//
//        String A = st.nextToken();
//        String B = st.nextToken();
//
//        char[] arr1 = A.toCharArray(); // 스트링값을 char배열에 넣을수있다.
//        char[] arr2 = B.toCharArray();
//
//        int ans =0;
//        for (int i = 0; i < arr1.length; i++) {
//        for (int j = 0; j < arr1.length; j++) {
//        if(arr1[i]==arr2[j]){
//        ans++;
//        break;
//        }
//        }
//        }
//        if(ans==arr1.length){
//        System.out.println("Possible");
//        }else{
//        System.out.println("Impossible");
//        }
//
//
//        }
