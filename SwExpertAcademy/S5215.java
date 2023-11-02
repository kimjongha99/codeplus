package SwExpertAcademy;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*

https://swexpertacademy.com/main/code/problem/problemDetail.do?problemLevel=3&contestProbId=AWT-lPB6dHUDFAVT&categoryId=AWT-lPB6dHUDFAVT&categoryType=CODE&problemTitle=&orderBy=RECOMMEND_COUNT&selectCodeLang=JAVA&select-1=3&pageSize=10&pageIndex=1

햄버거 다이어트
 */
public class S5215 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // Number of ingredients
        int L = Integer.parseInt(st.nextToken()); // Calorie limit

        int[] tasteScores = new int[N];
        int[] calories = new int[N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            tasteScores[i] = Integer.parseInt(st.nextToken()); // Taste score of the ingredient
            calories[i] = Integer.parseInt(st.nextToken());    // Calorie of the ingredient
        }

        int answer = getMaxTasteScore(N, L, tasteScores, calories);
        System.out.println(answer);
    }

    private static int getMaxTasteScore(int N, int L, int[] tasteScores, int[] calories) {
        // Initialize DP table
        int[][] dp = new int[N + 1][L + 1];

        // Build the table bottom up
        for (int i = 1; i <= N; i++) {
            for (int w = 0; w <= L; w++) {
                if (calories[i - 1] <= w) {
                    // If we can include the current ingredient
                    dp[i][w] = Math.max(tasteScores[i - 1] + dp[i - 1][w - calories[i - 1]], dp[i - 1][w]);
                } else {
                    // If we can't include the current ingredient
                    dp[i][w] = dp[i - 1][w];
                }
            }
        }

        // The last cell of the table will have the maximum taste score
        return dp[N][L];
    }
}
