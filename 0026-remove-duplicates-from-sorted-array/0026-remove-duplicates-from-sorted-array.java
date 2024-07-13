class Solution {
    public int removeDuplicates(int[] nums) {
        int posActual=0;
        int actual=nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            if(actual!=nums[i]){
                posActual++;
                nums[posActual]= nums[i];
                actual=nums[i];
                
            }
        }
        return posActual+1;
    }
}