class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum=0;
        
        for(int i=0;i<k;i++){
            sum +=nums[i];
        }
        double mayor= sum;
       
        //usar la técnica de slinding window
        for(int j=k;j<nums.length;j++){
            sum-=nums[j-k];
            sum+=nums[j];
            if(sum>mayor){
                mayor= sum;
            }
        }
        return mayor/k;
    }
}