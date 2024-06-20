import java.util.Stack;
class Solution {
    Stack<Character> stack = new Stack<>();
    StringBuilder result = new StringBuilder();
    Stack<Character> stack2=new Stack<>();
        
    
    public String removeStars(String s) {
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='*'){
                stack.push(s.charAt(i));
            }else{
                stack.pop();
            }
        }
        
        while (!stack.isEmpty()) {
            stack2.push(stack.pop());
        }
        while (!stack2.isEmpty()) {
            result.append(stack2.pop());
        }
        
        
        return result.toString();
    }
}
