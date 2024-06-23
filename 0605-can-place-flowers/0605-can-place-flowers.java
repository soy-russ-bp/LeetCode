class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count=0;
        int prev;
        int current;
        int next;
        int length= flowerbed.length;
        
        if(length==1){
            if(n>0){
               if(flowerbed[0]==1){
                   return false;
               }else{
                   return true;
               }
            }else{
                return true;
            }
        }
            
        if(flowerbed[0]==0 && flowerbed[1]==0 ){
            flowerbed[0]=1;
            count++;
        }
        for(int i=2;i<length-1;i++){
            prev=flowerbed[i-1];
            current=flowerbed[i];
            next=flowerbed[i+1];
            
            if(prev==0 && current==0 && next==0){
                flowerbed[i]=1;
                count++;
            }
        }
        
        if(flowerbed[length-2]==0 && flowerbed[length-1]==0 ){
            flowerbed[length-1]=1;
            count++;
        }
        
        if(count<n){
            return false;
        }else{
            return true;
        }
        
        
        
        
        
    }
}