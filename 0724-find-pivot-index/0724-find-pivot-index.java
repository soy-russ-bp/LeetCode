class Solution {
    public int pivotIndex(int[] nums) {
        
        for(int i=1;i<nums.length;i++){
            nums[i]=nums[i-1]+nums[i];
        }
        
        int total=nums[nums.length-1];
        if(total==nums[0]){
            return 0;
        }
        
        for(int j=1;j<nums.length;j++){
            System.out.println(nums[j]);
            if(total-nums[j] == nums[j-1]){
                return j;
            }
        }
        
        return -1;
    }
}