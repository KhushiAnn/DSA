public class RepeatingAndMissingNumbers {
     public static int[] findMissingRepeatingNumbers(int[] nums) {
        
        // Size of the array
        int n = nums.length;
        
        // Hash array to count occurrences
        int[] hash = new int[n + 1];
        
        // Update the hash array:
        for (int i = 0; i < n; i++) {
            hash[nums[i]]++;
        }

        int repeating = -1, missing = -1;
        
        // Find the repeating and missing number:
        for (int i = 1; i <= n; i++) {
            if (hash[i] == 2) {
                repeating = i;
            } else if (hash[i] == 0) {
                missing = i;
            }

            // Stop early if both found
            if (repeating != -1 && missing != -1) {
                break;
            }
        }
        
        // Return [repeating, missing]
        return new int[]{repeating, missing};
    }

    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 5, 4, 6, 7, 5};
        
      

        int[] result = findMissingRepeatingNumbers(nums);
        
        // Print the repeating and missing numbers found
        System.out.println("The repeating and missing numbers are: {" 
                            + result[0] + ", " + result[1] + "}");
    }
}
