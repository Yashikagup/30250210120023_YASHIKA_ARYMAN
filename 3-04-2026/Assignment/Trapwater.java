import java.util.Stack;

public class Trapwater{

    public static int trap(int[] height) {
        Stack<Integer> stack = new Stack<>();
        int water = 0;

        for (int i = 0; i < height.length; i++) {

            // While current bar is taller than stack top
            while (!stack.isEmpty() && height[i] > height[stack.peek()]) {

                int top = stack.pop();

                // If stack becomes empty → no left boundary
                if (stack.isEmpty()) break;

                int distance = i - stack.peek() - 1;

                int boundedHeight = Math.min(height[i], height[stack.peek()]) - height[top];

                water += distance * boundedHeight;
            }

            stack.push(i);
        }

        return water;
    }

    public static void main(String[] args) {
        int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println("Water trapped = " + trap(arr));
    }
}