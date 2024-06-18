class Solution {
    public boolean isSubsequence(String s, String t) {
        char pointerT=' ';
        int count=0;
            if(s.isEmpty()){
                return true;  
            }
            int i=0;
            for(int j=0; j<t.length();j++){
                
                s.charAt(i);
                pointerT=t.charAt(j);
                
                if(pointerT==s.charAt(i)){
                    count++;
                    System.out.println(count);
                    i++;
                }
                if(count==s.length()){return true;}
            }
        
        return false;
    }
}