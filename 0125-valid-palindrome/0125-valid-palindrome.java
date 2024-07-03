class Solution {
    public boolean isPalindrome(String s) {
        int i=0;
        int j=s.length()-1;
        boolean state=true;
        s = s.toLowerCase();  // Convertir la cadena a minúsculas y asignarla a 's'
        
        while(i<j){
            // Ignorar caracteres no alfanuméricos desde el principio
            while (i < j && !Character.isLetterOrDigit(s.charAt(i))) {
                i++;
            }
            // Ignorar caracteres no alfanuméricos desde el final
            while (i < j && !Character.isLetterOrDigit(s.charAt(j))) {
                j--;
            }
            if(s.charAt(i)==s.charAt(j)){
                state=true;
                i++;
                j--;
            }else{
                return false;
            }
       }
        return state;
    }

}

