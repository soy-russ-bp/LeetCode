import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> parentesis = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                parentesis.push(c);
            } else if (c == ')') {
                if (parentesis.isEmpty() || parentesis.pop() != '(') {
                    return false;
                }
            } else if (c == ']') {
                if (parentesis.isEmpty() || parentesis.pop() != '[') {
                    return false;
                }
            } else if (c == '}') {
                if (parentesis.isEmpty() || parentesis.pop() != '{') {
                    return false;
                }
            }
        }
        
        return parentesis.isEmpty();
    }
}
