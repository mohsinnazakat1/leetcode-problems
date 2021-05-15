class Solution {
    public static int findNumbers(int[] nums) {
        
        int eCount=0;
        for(int i:nums){
            if(Integer.toString(i).length()%2==0)
                eCount++;
        }
        return eCount;
    }
}