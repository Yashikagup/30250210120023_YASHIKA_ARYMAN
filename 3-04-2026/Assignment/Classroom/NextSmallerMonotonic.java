import java.util.Stack;

public class NextSmallerMonotonic {

    public static void main(String[] args) {

        int arr[] = {4, 5, 2, 10, 8};
        int n = arr.length;

        int result[] = new int[n];
        Stack<Integer> stack = new Stack<>();

        // Traverse from right to left
        for (int i = n - 1; i >= 0; i--) {

            // Maintain monotonic increasing stack
            while (!stack.isEmpty() && stack.peek() >= arr[i]) {
                stack.pop();
            }

            // Assign result
            result[i] = stack.isEmpty() ? -1 : stack.peek();

            // Push current element
            stack.push(arr[i]);
        }

        // Print result
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " -> " + result[i]);
        }
    }
}