package Softeer;


import java.util.Scanner;

/*
https://softeer.ai/practice/info.do?idx=1&eid=990
근무 시간
 */
public class S990 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalhour = 0;
        int totalmin = 0;

        for (int i = 0; i < 5; i++) {
            String StartTime = sc.next();
            String EndTime = sc.next();

            int StartH = Integer.parseInt(StartTime.substring(0,2));
            int StartM = Integer.parseInt(StartTime.substring(3, 5));
            int EndH = Integer.parseInt(EndTime.substring(0,2));
            int EndM = Integer.parseInt(EndTime.substring(3, 5));

            totalhour += (EndH-StartH) ;
            totalmin  +=(EndM-StartM);
        }

        System.out.println(totalhour*60+totalmin);

    }
}
