class Solution {
    public int compress(char[] chars) {
        StringBuilder s = new StringBuilder();
        int i = 0;

        while (i < chars.length) {
            char pointer = chars[i];
            int count = 0;

            // Contar la cantidad de caracteres consecutivos
            while (i < chars.length && chars[i] == pointer) {
                count++;
                i++;
            }

            s.append(pointer);
            if (count > 1) {
                s.append(count);
            }
        }

        String compressedString = s.toString();
        for (int j = 0; j < compressedString.length(); j++) {
            chars[j] = compressedString.charAt(j);
        }

        return compressedString.length();
    }
}
