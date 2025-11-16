public class SecondLargest {
    public static void main(String[] args) {
        int[] nums={19,21,10,5,26,2};
        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
            if(nums[i]>largest){
                secondLargest=largest;
                largest=nums[i];
            }
            if(nums[i]>secondLargest && nums[i]!=largest){
                secondLargest=nums[i];
            }
        }

        System.out.println("Second Largest Number is : " + secondLargest);
    }
}
