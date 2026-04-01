
import java.util.Stack;

public class Next_greater_element {

    public static void main(String[] args) {

        int arr[] = {4, 5, 2, 25};
        int n = arr.length;

        Stack<Integer> stack = new Stack<>();
        int result[] = new int[n];

        for(int i = n - 1; i >= 0; i--)
        {
            // Step 1: Check stack empty
            if(stack.empty())
            {
                result[i] = -1;
            }
            else
            {
                // Step 2: Check condition
                while(!stack.empty() && stack.peek() <= arr[i])
                {
                    stack.pop();
                }

                if(stack.empty())
                    result[i] = -1;
                else
                    result[i] = stack.peek();
            }

            // Step 3: Push element
            stack.push(arr[i]);
        }

        // Print result
        System.out.println("Next Greater Elements:");
        for(int i = 0; i < n; i++)
        {
            System.out.print(result[i] + " ");
        }
    }
}