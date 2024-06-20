import java.util.Stack;
class Solution {
    Stack<Character> stack = new Stack<>();
    
    public String removeStars(String s) {
        
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='*'){
                stack.push(s.charAt(i));
            }else{
                stack.pop();
            }
        }
         // Usar StringBuilder para construir la cadena resultante
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.insert(0, stack.pop());
        }
        
        return result.toString();
    }
}

//uso insert(0, char ch), porque todos los caracteres existentes desde esa posición en adelante se desplazan una posición hacia la derecha para hacer espacio para el nuevo carácter, también pude haber vaciado la pila dentro de otra pila, y después sacarla para tener el string en el orden correcto.