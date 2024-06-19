class Solution {
    public String reverseVowels(String s) {
        
        if (s.length() == 0) {
            return s;
        }

        char[] s2 = s.toCharArray();
        int i = 0, j = s.length() - 1;

        while (i < j) {
            //recorro mis 2 punteros hasta encontrar las vocales a cambiar
            while (i < j && !isVowel(s2[i])) {
                i++;
            }
            while (i < j && !isVowel(s2[j])) {
                j--;
            }
            if (i < j) {
                char temp = s2[i];
                s2[i] = s2[j];
                s2[j] = temp;
                i++;
                j--;
            }
        }

        return new String(s2);
    }

    public boolean isVowel(char x) {
        String vowels = "aeiouAEIOU";
        return vowels.indexOf(x) != -1;
    }
}


//poner en algún lugar la condición que si j=i retorne la palabra con las vocales cambiadas