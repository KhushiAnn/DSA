import java.util.Arrays;

public class SmallestDivisor {
    private static int sumByD(int[] arr, int div) {
        int sum = 0;
        for (int num : arr) {
            sum += Math.ceil((double) num / div);
        }
        return sum;
    }

    // Method to find the smallest divisor using binary search
    public static int smallestDivisor(int[] arr, int limit) {
        if (arr.length > limit) return -1;

        int low = 1;
        int high = Arrays.stream(arr).max().getAsInt();

        while (low <= high) {
            int mid = (low + high) / 2;
            if (sumByD(arr, mid) <= limit) {
                high = mid - 1; // Try smaller divisor
            } else {
                low = mid + 1;  // Try larger divisor
            }
        }

        return low;
    }

    public static void main(String[] args) {
        
        int[] arr = {1, 2, 3, 4, 5};
        int limit = 8;
        int result = smallestDivisor(arr, limit);
        System.out.println("The minimum divisor is: " + result);
    }
}
