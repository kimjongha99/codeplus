package bruteForce;


import java.util.Scanner;

/*
날짜 계산
https://www.acmicpc.net/problem/1476
 */
public class B1476 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int E = sc.nextInt();
        int S = sc.nextInt();
        int M = sc.nextInt();
        int e=1,s=1,m=1;

        for(int i=1;;i++){
            if (e==E && s ==S && m==M){
                System.out.println(i);

                break;
            }
            e +=1;
            s +=1;
            m +=1;
            if(e ==16){
                e=1;
            }
            if(s==29){
                s=1;
            }
            if (m == 20) {
                m=1;
            }

        }
    }
}
