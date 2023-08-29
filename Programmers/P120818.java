package Programmers;


/*
https://school.programmers.co.kr/learn/courses/30/lessons/120818
옷가게 할인받기
 */
public class P120818 {
    public int solution(int price) {
        int answer = 0;

        if(price<100000){
            answer = price;
        }
        else if (price >= 100000 && price<= 299999)  {
            answer= (int) (price-price*0.05);
        }else if(price>=300000 && price<=499999){
            answer = (int) (price - price * 0.1);
        } else if(price>=500000){
            answer = (int) (price - price * 0.2);
        }
        return answer;
    }

    public static void main(String[] args) {
        int price = 5800000;
        P120818 sol = new P120818();
        System.out.println(sol.solution(price));
    }


}
