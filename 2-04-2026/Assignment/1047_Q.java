import java.util.Stack;
class Solution {
    public String removeDuplicates(String s) {
        


        
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {

            // if same → remove
            if (!stack.isEmpty() && stack.peek() == ch) {
                stack.pop();
            } 
            // else → add
            else {
                stack.push(ch);
            }
        }

        // convert stack to string
        String result = "";
        for (int i = 0; i < stack.size(); i++) {
    char c = stack.get(i);
            result += c;
        }

        return result;
    }
}
        

