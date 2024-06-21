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

        for (int j = 0; j < s.length(); j++) {
            chars[j] = s.charAt(j);
        }

        return s.length();
    }
}
