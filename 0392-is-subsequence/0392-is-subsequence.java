class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.isEmpty()) {
            return true;
        }

        int i = 0; // Puntero para `s`

        for (int j = 0; j < t.length(); j++) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
                if (i == s.length()) {
                    return true;//Se han encontrado todos los caracteres de `s` en`t`
                }
            }
        }

        return false; // No se han encontrado todos los caracteres de `s` en `t`
    }
}