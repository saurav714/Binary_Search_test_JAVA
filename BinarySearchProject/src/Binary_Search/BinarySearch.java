package Binary_Search;

public class BinarySearch {

    // Binary search method
    public static int binarySearch(int[] array, int element_to_be_searched) {
        int left_index = 0;
        int right_index = array.length - 1;

        while (left_index <= right_index) {
            int mid_index = left_index + (right_index - left_index) / 2;

            // Check if target is at mid
            if (array[mid_index] == element_to_be_searched) {
                return mid_index;
            }

            // If target is greater, ignore the left half
            if (array[mid_index] < element_to_be_searched) {
                left_index = mid_index + 1;
            } else {
                // If target is smaller, ignore the right half
                right_index = mid_index - 1;
            }
        }

        // Target not found
        return -1;
    }

    // Main method for initial testing
    public static void main(String[] args) {
        int[] sortedArray = {2, 4, 6, 8, 10, 12, 14};
        int target = 14;

        // Call the binarySearch method and store the result
        int result = binarySearch(sortedArray, target);

        // Print the result
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}

