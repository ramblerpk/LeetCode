import java.sql.SQLOutput;

public class min_rotated_sorted_array {
    public static void main(String[] args) {
     int sol =    Solution.findMin(new int[] {3, 4, 5, 1, 2});
        System.out.println(sol);
    }
}

class Solution {
    public static int findMin(int[] nums) {
        if(nums.length<2){
            return nums[0];
        }
        int start = 0;
        int end = nums.length-1;
        while(start<=end) {
            int mid = start + (end - start)/2;
            if(mid<end && nums[mid]>nums[mid+1]){
           }
        }
        return nums[0];
    }
}