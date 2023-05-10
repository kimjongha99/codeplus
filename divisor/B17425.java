package divisor;
//https://www.acmicpc.net/problem/17425

//약수의합
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class B17425 {
    public static void main(String[] args) {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int max=100000;
        long[] d=  new long[max+1];
        for(int i=1; i<=max; i++){
            d[i]= 1;
        }
        for(int i=2; i<=max;i++){
            for(int j=1; i*j<=max; j++){
                d[i*j] += i;
            }
        }

    }
}

