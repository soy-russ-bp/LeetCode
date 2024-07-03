class Solution {
    public int maxArea(int[] height) {
        int max=0;
        int j=height.length - 1; 
        int i=0;
        int content=0;
        
        while(i<j){
            
            if(height[i]<height[j]){
                content=height[i]*(j-i);
                i++;
            }else{
                content=height[j]*(j-i);
                j--;
            }
            if(max<content){
                max=content;
            }  
        }
        return max;
    }
}