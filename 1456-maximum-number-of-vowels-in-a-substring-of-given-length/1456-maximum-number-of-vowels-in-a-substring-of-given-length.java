class Solution {
    public int maxVowels(String s, int k) {
        int maxNumVowel = 0;
        int countNumVowel = 0;
        
        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) {
                countNumVowel++;
            }
        }
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
            
            if(maxNumVowel<countNumVowel){
                maxNumVowel=countNumVowel;
            }
           
        }
        
        return maxNumVowel;
    }
    
    public boolean isVowel(char x) {
        return "aeiou".indexOf(x) != -1;
    }
}

//explicación: lo que estoy haciendo es pensar en el arreglo como una ventana:
// [l][e][e][t][c][o][d][e]: si teneemos que k=3, entonces, primero contamos las
//vocales del primer sub arreglo, después ubicamos un puntero en
//la posición 3(la letra t), ahí pensamos en que estamos deslizando la ventana, es 
//decir restamos el valor que aporta l y sumamos el valor que aporta t, en este 
//caso, como el ejercicio sólo nos pide tomar en cuenta vocales, no hacemos nada,
//sin embargo, si el ejercicio fuera: [2][3][6][7][2][8][4][5][3], entonces sería
//más fácil notar que en cada iteración sumamos el elemento de la posición k,
//y quitamos el de la posición i-k.