import java.util.HashSet;

public class RemoveDuplicates {
    // Remove Duplicates using HashSet.
    public static int removeDuplicates(int[] nums){
        // HashSet to store unique elements we have seen
        HashSet<Integer> uniqueNums = new HashSet<>();

        // Position to overwrite next unique element
        int index = 0;

        // Loop over each number in nums
        for (int num : nums) {
            // If num is not in the set, it is unique
            if (!uniqueNums.contains(num)) {
                // Add num to the set
                uniqueNums.add(num);

                // Write num at current index position
                nums[index] = num;

                // Move index forward
                index++;
            }
        }
        // Return number of unique elements
        return index;
    }

    //Optimized function to remove duplicates(in terms of space complexity)
    public static int optimizedRemoveDuplicates(int[] arr){

        if(arr.length==0){
            return 0;
        }
        int i=0;

        for(int j=1;j<arr.length;j++){
            if(arr[j]!=arr[i])
            {
                i++;
                arr[i]=arr[j];
            }
        }

        return i+1;
    }
    public static void main(String[] args) {
        int[] nums={0,1,1,2,3,3,3,5,5};
        int k=removeDuplicates(nums);
        System.out.println("Number of Unique Elements : " + k);
        for(int i=0;i<k;i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        System.out.println("Optimized menthod ");
        int[] arr={10,10,13,14,14,14,18};
        int a = optimizedRemoveDuplicates(arr);
        System.out.println("Number of Unique Elements : " + a);
        for(int s=0;s<a;s++){
            System.out.print(arr[s] + " ");
        }
    }
}
