class Solution {
    public int lengthOfLastWord(String s) {
        int i=s.length()-1;
        int count=0;
        
        while(i>-1){
            if(Character.isLetter(s.charAt(i)) ){
                count++;
            }else if(!Character.isLetter(s.charAt(i)) && count<1){
                //para recorrer los espaciós vacíos como el de: "hola   "
            }else{
                return count;
            }
            i--;
        }
        return count;  
    }
}