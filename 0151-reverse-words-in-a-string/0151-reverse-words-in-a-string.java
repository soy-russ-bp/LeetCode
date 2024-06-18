import java.util.Stack;

public class Solution {
    public String reverseWords(String s) {
        Stack<String> pila = new Stack<>();
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                sb.append(s.charAt(i));
            } else {
                if (sb.length() > 0) {
                    pila.push(sb.toString());
                    sb.setLength(0);  // Vaciar el StringBuilder
                }
            }
        }
        // Añadir la última palabra si no está vacía
        if (sb.length() > 0) {
            pila.push(sb.toString());
        }
        
        sb.setLength(0);  // Vaciar el StringBuilder para usarlo de nuevo
        
        while (!pila.isEmpty()) {
            sb.append(pila.pop());
            if (!pila.isEmpty()) {
                sb.append(" ");
            }
        }
        
        return sb.toString();
    }
}
