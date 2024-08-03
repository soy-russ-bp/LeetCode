class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n+1]; 
        
        for(int i=0;i<n+1;i++){
            int count=0;
            String bin= Integer.toBinaryString(i);
            System.out.println(bin);
            
            for(int j=0;j<bin.length();j++){
                if(bin.charAt(j)=='1'){
                    count++;
                }
            }
            ans[i]=count;
            
        }
        return ans;
    }
}