            if (c == '(') 
                stack.push(')'); 
            else if (c == '{') 
                stack.push('}'); 
            else if (c == '[') 
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c) 
                return false;
        }
        return stack.isEmpty();
    }
}
        for (char c : s.toCharArray()) {
        Stack<Character> stack = new Stack<Character>(); // create an empty stack
    public boolean isValid(String s) {
class Solution {
"()"
