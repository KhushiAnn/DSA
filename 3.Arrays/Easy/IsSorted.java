public class IsSorted {

    static boolean isSortedArray(int[] nums, int n){
        for(int i=1;i<nums.length;i++){
            if(nums[i]<nums[i-1]){
               return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int [] nums={23,54,76,88,91,101};
        
        System.out.println(isSortedArray(nums,nums.length));
       
    }
}
