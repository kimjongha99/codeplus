package DFS;


/*
타겟 넘버

https://school.programmers.co.kr/learn/courses/30/lessons/43165
 */
public class P43165 {
    static int answer;
    public int solution(int[] numbers, int target) {
        answer= 0;
        dfs(0,0,numbers,target);
   return answer;
    }

     void dfs(int n,  int sum , int[] numbers, int target ) {
         if (n == numbers.length) {
             if (sum == target)
                 answer++;
             return;
         }

         dfs(n + 1, sum + numbers[n], numbers, target);
         dfs(n + 1, sum - numbers[n], numbers, target);
     }
    public static void main(String[] args) {
        int numbers	[] = new int[]{1, 1, 1, 1, 1};

        int target= 3;
        P43165 sol = new P43165();
        System.out.println(sol.solution(numbers,target));

    }
}
