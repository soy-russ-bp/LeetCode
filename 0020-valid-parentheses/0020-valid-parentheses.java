import java.util.Stack;
class Solution {
    public boolean isValid(String s) {
        Stack<Character> parentesis = new Stack<>();
        
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{'){
                parentesis.push(s.charAt(i));
            }else if(s.charAt(i)==')'){
                if(parentesis.isEmpty() || parentesis.pop()!='('){
                    return false;
                }
            }else if(s.charAt(i)==']' ){
                if(parentesis.isEmpty() || parentesis.pop()!='['){
                    return false;
                }
            }else if(s.charAt(i)=='}'){
                if(parentesis.isEmpty() || parentesis.pop()!='{'){
                    return false;
                }
            }
        }
        
        return parentesis.isEmpty();
    }
}