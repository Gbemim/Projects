package testCases;

import java.util.Arrays;

public class Question1 {
	public static int[] TwoSum(int[] nums, int target) {
        int[] n = null;
        for(int i = 0; i < nums.length-1; i++){
            for (int j = 0; j < nums.length-1; j++){
                if(nums[j] + nums[i+1] == target){
                    return new int[]{j, i+1};
                }
            }
        }
        return n;
    }
	
	public static void main(String[] args) {

     System.out.println(Arrays.toString(TwoSum(new int[]{3, 2, 4}, 6)));


 }
}
