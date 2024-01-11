class LongestIncreasingSubarray {
    public static int[] findLongestIncreasingSubarray(int[] arr) {
        if (arr == null || arr.length == 0) {
            return new int[0]; // Return an empty array for invalid input
        }

        int maxLength = 1; // Minimum length of increasing subarray is 1
        int startIndex = 0;
        int currentLength = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                currentLength++;

                if (currentLength > maxLength) {
                    maxLength = currentLength;
                    startIndex = i - maxLength + 1;
                }
            } else {
                currentLength = 1;
            }
        }

        // Extract the longest increasing subarray
        int[] longestIncreasingSubarray = new int[maxLength];
        for (int i = 0; i < maxLength; i++) {
            longestIncreasingSubarray[i] = arr[startIndex + i];
        }

        return longestIncreasingSubarray;
    }

    public static void main(String[] args) {
        int[] arr = { 5, 7, 3, 8, 10, 15, 12, 14, 16, 18, 20 };
        int[] longestIncreasingSubarray = findLongestIncreasingSubarray(arr);

        System.out.print("Longest Increasing Subarray: ");
        for (int num : longestIncreasingSubarray) {
            System.out.print(num + " ");
        }
        // Output: Longest Increasing Subarray: 10 15 12 14 16 18 20
    }
}
