class Solution {
    public void moveZeroes(int[] nums) {
        
        int k=nums.length;
        int j=0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i]!=0){
                nums[j]=nums[i];
                j++;
            }else{
                k--;
            } 
        }
        while(k<nums.length){
            nums[k]=0;
            k++;
        }
           
        
    }
}