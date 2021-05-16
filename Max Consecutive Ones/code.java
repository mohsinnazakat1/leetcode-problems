class Solution {
 public static int findMaxConsecutiveOnes(int[] nums) {
        int row=0, max_row=0;
        for(int i=0; i<nums.length;i++){
           if(nums[i]==1)
               row++;
 
           if(nums[i]==0||i==nums.length-1){
               if(max_row<row){
                    max_row=row; 
               }
               row=0;
           }
        }
        return max_row;
    }
}