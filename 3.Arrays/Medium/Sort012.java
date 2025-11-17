
public class Sort012 {
    public static void sortArray(int[] nums, int n) {
       int low = 0; // Pointer for the next position of 0
        int mid = 0; // Pointer for the current element being examined
        int high = nums.length - 1; // Pointer for the next position of 2

        while (mid <= high) {
            if (nums[mid] == 0) {
                // If the current element is 0, swap it with the element at 'low'
                // and increment both 'low' and 'mid' pointers.
                swap(nums, low, mid);
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                // If the current element is 1, it's already in its correct relative position.
                // Just increment 'mid'.
                mid++;
            } else { // nums[mid] == 2
                // If the current element is 2, swap it with the element at 'high'
                // and decrement 'high'. 'mid' is not incremented because the swapped
                // element from 'high' might be a 0 or 1, which needs further processing.
                swap(nums, mid, high);
                high--;
            }
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static void main(String args[]) {
        int n = 6;
        int[] arr={0, 2, 1, 2, 0, 1};
        sortArray(arr, n);
        System.out.println("After sorting:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }

}
