class Solution {
    public int compress(char[] chars) {
        int reader = 0;
        int writer = 0;

        while (reader < chars.length) {
            char pointer = chars[reader];
            int count = 0;

            // Contar la cantidad de caracteres consecutivos
            while (reader < chars.length && chars[reader] == pointer) {
                count++;
                reader++;
            }

            // Escribir el carácter actual
            chars[writer++] = pointer;

            // Escribir el conteo si es mayor a 1
            if (count > 1) {
                String countStr = Integer.toString(count);
                for (int j = 0; j < countStr.length(); j++) {
                    chars[writer++] = countStr.charAt(j);
                }
            }
        }

        return writer;
    }
}