public class SecondSmallest {
    public static void main(String[] args){
        int[] nums={4,12,10,2,5,21};
        int smallest=Integer.MAX_VALUE;
        int secondSmallest=Integer.MAX_VALUE;

        for(int i=0;i<nums.length;i++){
            if(nums[i]<smallest){
                secondSmallest=smallest;
                smallest=nums[i];
            }
            if(nums[i]<secondSmallest && nums[i]!=smallest){
                secondSmallest=nums[i];
            }
        }

        System.out.println("Second smallest Number is : " + secondSmallest); 
    }
}
