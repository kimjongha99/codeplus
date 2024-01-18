package SlidingWindow;


// k 만큼의 구간의 길이의 합중 가장 큰값
public class SlidingWindow {

    static int maxSumofArray(int[] nums, int k) {
        //변수를 두개 만들고 시작
        int windowSum = 0; // 윈도우 하나의 합을 초기화 하는 변수
        int maxSum =Integer.MIN_VALUE ; //리턴값 최소값을 줘여함

        for (int i = 0; i < nums.length; i++) {
            windowSum += nums[i];  // 범위의 합을 미리계산
            if(i>=k-1){
                maxSum = Math.max(windowSum, maxSum);
                windowSum -= nums[i - (k - 1)];
            }
        }
        return maxSum;
    }



    public static void main(String[] args) {
        int[] nums = new int[]{5,7,1,14,3,12,1,4};


        System.out.println(maxSumofArray(nums,3));
    }
}
