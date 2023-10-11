package DFS;


/*
타겟 넘버

https://school.programmers.co.kr/learn/courses/30/lessons/43165


count : 전역 변수
dfs(int [] numbers, int depth, int target, int result) : 깊이 우선 탐색을 위한 재귀 함수
depth : 이진트리 깊이
result : 이전 노드까지의 합계
 */
public class P43165 {
    int [] numbers;
    int target;
    int answer;

    public int solution(int[] numbers, int target){
        answer =0;
        this.numbers = numbers;
        this.target =target;
    dfs(0,0);

    return answer;
}
  void dfs(int index, int sum){
    //1.탈출조건
    if(index==numbers.length){
        if(sum==target){
            answer++;
        }
        return;
    }

    //2.수행동작
    dfs(index+1,sum+numbers[index]);
    dfs(index + 1, sum - numbers[index]);
}
    public static void main(String[] args) {
        int numbers	[] = new int[]{1, 1, 1, 1, 1};

        int target= 3;
        P43165 sol = new P43165();
        System.out.println(sol.solution(numbers,target));

    }
}



//
//
//    static int answer;
//    public int solution(int[] numbers, int target) {
//        answer= 0;
//        dfs(0,0,numbers,target);
//        return answer;
//    }
//
//    void dfs(int n,  int sum , int[] numbers, int target ) {
//        if (n == numbers.length) {
//            if (sum == target)
//                answer++;
//            return;
//        }
//
//        dfs(n + 1, sum + numbers[n], numbers, target);
//        dfs(n + 1, sum - numbers[n], numbers, target);
//    }








//
//
//
//
//    static int count = 0;
//
//
//    public  int solution(int[] numbers , int target){
//        int answer =0;
//        dfs(numbers,0,target,0);
//        answer = count;
//        return answer;
//    }
//    public void dfs(int[] numbers, int depth, int target, int result){
//        if(depth== numbers.length){
//            if(target==result){
//                count++;
//            }
//            return;
//        }
//        int plus = result + numbers[depth]; //양수를 더한 값
//        int minus = result - numbers[depth]; //음수를 더한 값
//
//        dfs(numbers, depth+1, target, plus);
//        dfs(numbers, depth+1, target, minus);
//    }

