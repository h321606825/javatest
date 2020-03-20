package meituan;

import java.util.Scanner;

/**
 * 最长字串
 */

public class First0319 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] nums = new int[n];
            for(int i=0;i<n;i++){
                nums[i] = sc.nextInt();
            }
            System.out.println(lengthOfLIS(nums));
        }
        public static int lengthOfLIS(int[] nums) {
            int[] dp = new int[nums.length];
            dp[0] = 1;
            int max = dp[0];
            for(int i = 1;i < nums.length;i++) {
                dp[i] = 1;
                for(int j = 0;j <= i-1;j++) {
                    if(nums[i] > nums[j] && dp[j]+1 > dp[i]){
                        dp[i] = dp[j]+1;
                    }
                }
                if(max < dp[i]){
                    max = dp[i];
                }
            }
            return max;
        }
}
