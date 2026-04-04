public class NextSmallerElement {

    public static void main(String[] args) {
        int arr[] = {4, 5, 2, 10, 8};

        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int nextSmaller = -1;

            // Check elements to the right
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[i]) {
                    nextSmaller = arr[j];
                    break;
                }
            }

            System.out.println(arr[i] + " -> " + nextSmaller);
        }
    }
}
