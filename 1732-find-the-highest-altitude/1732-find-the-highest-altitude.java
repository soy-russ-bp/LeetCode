class Solution {
    public int largestAltitude(int[] gain) {
        int[] altitude = new int[gain.length+1];
        altitude[0]=0;
        int highestAltitude=-101; //-100 <= gain[i] <= 100
        
        for(int i=0;i<gain.length;i++){
            altitude[i+1]=altitude[i]+gain[i];
            
            if(altitude[i]>highestAltitude){
                highestAltitude=altitude[i];
            }
        }
        
        if(altitude[altitude.length-1]>highestAltitude){
            highestAltitude=altitude[altitude.length-1];
        }
        
        return highestAltitude;
    }
}