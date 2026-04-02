import java.util.Stack;

class Solution {
    public String removeDuplicates(String s) {
        
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // if stack not empty and top == current → remove
            if (!stack.isEmpty() && stack.peek() == ch) {
                stack.pop();
            } 
            // else push
            else {
                stack.push(ch);
            }
        }

        // build result string from stack
        String result = "";
        for (int i = 0; i < stack.size(); i++) {
          char c = stack.get(i);

            result += c;
        }

        return result;
    }
}
        
