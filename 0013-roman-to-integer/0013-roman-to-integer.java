import java.util.HashMap;
import java.util.Map;

class Solution {
    private static final Map<Character, Integer> ROMAN_TO_INT_MAP = new HashMap<>();

    static {
        ROMAN_TO_INT_MAP.put('I', 1);
        ROMAN_TO_INT_MAP.put('V', 5);
        ROMAN_TO_INT_MAP.put('X', 10);
        ROMAN_TO_INT_MAP.put('L', 50);
        ROMAN_TO_INT_MAP.put('C', 100);
        ROMAN_TO_INT_MAP.put('D', 500);
        ROMAN_TO_INT_MAP.put('M', 1000);
    }

    public int romanToInt(String s) {
        int num = 0;
        int prevValue = 0;

        // Recorrer la cadena de derecha a izquierda
        for (int i = s.length() - 1; i >= 0; i--) {
            int currentValue = ROMAN_TO_INT_MAP.getOrDefault(s.charAt(i), 0);
            if (currentValue < prevValue) {
                num -= currentValue;
            } else {
                num += currentValue;
            }
            prevValue = currentValue;
        }

        return num;
    }

}

