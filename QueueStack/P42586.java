package QueueStack;


import java.util.ArrayList;
import java.util.List;

/*
https://school.programmers.co.kr/learn/courses/30/lessons/42586

기능개발
        */
public class P42586 {
    public int[] solution(int[] progresses, int[] speeds) {

        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < progresses.length; i++) {
            //한개의 기능을 만드는데 필요한날자
            double day = (100-progresses[i]/(double)speeds[i]);
            int daysup  = (int)Math.ceil(day);

            //함께 배포할 기능의 인덱스찾기
            int j = i + 1;
            for (; j < progresses.length; j++) {
                if (progresses[j] + daysup * speeds[j] < 100) {
                    break;
                }
            }
            ans.add(j-1);
            i=j-1;
        }
        int[] arr = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            arr[i]=ans.get(i);
        }
        return arr;
    }

    public static void main(String[] args) {
        int progresses[] =new int[]{93, 30, 55};
        int speeds[] =new int[]{1, 30, 5};

        P42586 sol = new P42586();
        System.out.println(sol.solution(progresses,speeds));

    }
}
