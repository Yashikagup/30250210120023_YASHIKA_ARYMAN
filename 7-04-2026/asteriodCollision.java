import java.util.*;

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for (int a : asteroids) {

            while (!stack.isEmpty() && a < 0 && stack.peek() > 0) {

                if (stack.peek() < -a) {
                    stack.pop(); // smaller one dies
                } 
                else if (stack.peek() == -a) {
                    stack.pop(); // both die
                    a = 0; // current also dies
                } 
                else {
                    a = 0; // current dies
                }

                if (a == 0) break;
            }

            if (a != 0) {
                stack.push(a);
            }
        }

        // convert to array
        int[] res = new int[stack.size()];
        for (int i = stack.size() - 1; i >= 0; i--) {
            res[i] = stack.pop();
        }

        return res;
    }
}
