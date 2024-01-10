package 개념;

 //피보나치 수 열  DFS연습

public class B {

    static int dfs(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }else{
            return dfs(n-1)+dfs(n-2);
        }
    }

    public static void main(String[] args) {
        System.out.println(dfs(6));
    }
}
