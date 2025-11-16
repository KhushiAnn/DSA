public class LargestElement {
    public static void main(String[] args) {
        int[] nums={65,24,81,77,55,43};
        int maxElement=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>maxElement){
                maxElement=nums[i];
            }
        }
        System.out.println("Largest Element in the array : " + maxElement);
    }
}
