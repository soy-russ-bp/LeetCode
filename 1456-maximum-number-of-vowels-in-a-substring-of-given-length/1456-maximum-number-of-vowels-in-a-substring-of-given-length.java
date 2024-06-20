class Solution {
    public int maxVowels(String s, int k) {
        int maxNumVowel = 0;
        int countNumVowel = 0;
        
        // Cuenta las vocales en la primera ventana de longitud k
        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) {
                countNumVowel++;
            }
        }
        
        // Inicializa el número máximo de vocales con el conteo de la primera ventana
        maxNumVowel = countNumVowel;
        
        // Usa la técnica de ventana deslizante para recorrer la cadena
        for (int i = k; i < s.length(); i++) {
            // Elimina el carácter que está saliendo de la ventana
            if (isVowel(s.charAt(i - k))) {
                countNumVowel--;
            }
            
            // Añade el carácter que está entrando en la ventana
            if (isVowel(s.charAt(i))) {
                countNumVowel++;
            }
            
            // Actualiza el número máximo de vocales si el conteo actual es mayor
            maxNumVowel = Math.max(maxNumVowel, countNumVowel);
        }
        
        return maxNumVowel;
    }
    
    public boolean isVowel(char x) {
        return "aeiouAEIOU".indexOf(x) != -1;
    }
}
