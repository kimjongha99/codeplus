import java.util.ArrayList;
import java.util.List;



class Solution {
     public List<Integer> solution(int[]answers) {
        int a[] = new int[]{1,2,3,4,5};
        int b[] = new int[]{ 2, 1, 2, 3, 2, 4, 2, 5};
        int c[] =new int[] {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};


        int [] score = new int[3];


        for (int i = 0; i < answers.length; i++) {
            if(answers[i] == a[i% a.length]){
                score[0]++;
            }
            if(answers[i] == b[i% b.length]){
                score[1]++;
            }
            if(answers[i] == c[i% c.length]){
                score[2]++;
            }
        }


        int maxScore= Math.max(score[0], Math.max(score[1], score[2]));


        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            if (score[i] == maxScore) {
                list.add(i+1);
            }
        }

        return list;




    }
}