import java.util.Stack;

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        int n = nums2.length;
        int[] nge = new int[n];  // store next greater for nums2
        Stack<Integer> stack = new Stack<>();

        // Step 1: Find NGE for nums2
        for (int i = n - 1; i >= 0; i--) {

            while (!stack.isEmpty() && stack.peek() <= nums2[i]) {
                stack.pop();
            }

            if (stack.isEmpty())
                nge[i] = -1;
            else
                nge[i] = stack.peek();

            stack.push(nums2[i]);
        }

        // Step 2: Answer for nums1
        int[] result = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {

            // find index of nums1[i] in nums2
            for (int j = 0; j < n; j++) {
                if (nums2[j] == nums1[i]) {
                    result[i] = nge[j];
                    break;
                }
            }
        }

        return result;
    }
}