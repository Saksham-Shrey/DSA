package Arrays;
import java.util.*;

class Main {
    public static void main(String[] args) {
        int[] arr = {-2, -1, 3, 4, -5, 4};
        maxSubArray(arr);
    }
    public static void maxSubArray(int[] nums) {
        int maxSum = nums[0], currentSum = nums[0];
        boolean isAllNegative = true;

        int start, end;
        start = end = 0;


        for(int i = 0; i < nums.length; i++){
            currentSum += nums[i];

            if(currentSum < 0) {
                currentSum = 0;
                start = i+1;
                end = i+1;
            }

            if(maxSum < currentSum){
                maxSum = currentSum;
                isAllNegative = false;
                end = i;
            }
        }

        int[] arr = new int[end - start + 1];
        int index = 0;
        if(isAllNegative == false) {
            for (int i = start; i <= end; ++i){
                arr[index] = nums[i];
                ++index;
            }
        }

        else{
            int max = nums[0];
            for(int i = 0; i < nums.length; i++){
                if(nums[i] > max)
                    max = nums[i];
            }

        }

        System.out.println("The Maximum subarray sum is: " + maxSum);
        System.out.println("The Maximum subarray is: " + Arrays.toString(arr));
    }
}
