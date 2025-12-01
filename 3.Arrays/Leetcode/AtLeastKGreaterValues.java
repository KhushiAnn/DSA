import java.util.Arrays;

public class AtLeastKGreaterValues {
    public static int countElements(int[] nums, int k) {
        int count=0;
        int size=nums.length;
        if(k==0){
            return size;
        }
        Arrays.sort(nums);
        for(int i : nums){
            if(i<nums[size-k]){
                count++;
            }
            else
                break;
        
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums={3,2,1};
        int k=1;
        int result= countElements(nums, k);
        System.out.println("Number of Elements with at least k greater value : " +result);
    }
}
